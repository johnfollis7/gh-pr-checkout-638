/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.quickfix

import com.intellij.codeInsight.intention.IntentionAction
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.util.PsiTreeUtil
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.builtins.isKFunctionType
import org.jetbrains.kotlin.config.LanguageFeature
import org.jetbrains.kotlin.diagnostics.Diagnostic
import org.jetbrains.kotlin.diagnostics.Errors
import org.jetbrains.kotlin.diagnostics.rendering.DefaultErrorMessages
import org.jetbrains.kotlin.idea.caches.resolve.analyzeWithContent
import org.jetbrains.kotlin.idea.caches.resolve.findModuleDescriptor
import org.jetbrains.kotlin.idea.caches.resolve.getResolutionFacade
import org.jetbrains.kotlin.idea.core.quickfix.QuickFixUtil
import org.jetbrains.kotlin.idea.intentions.reflectToRegularFunctionType
import org.jetbrains.kotlin.idea.project.languageVersionSettings
import org.jetbrains.kotlin.idea.util.approximateWithResolvableType
import org.jetbrains.kotlin.idea.util.getResolutionScope
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.getQualifiedExpressionForSelectorOrThis
import org.jetbrains.kotlin.psi.psiUtil.getStrictParentOfType
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.DescriptorToSourceUtils
import org.jetbrains.kotlin.resolve.bindingContextUtil.getTargetFunction
import org.jetbrains.kotlin.resolve.calls.callUtil.getParameterForArgument
import org.jetbrains.kotlin.resolve.calls.callUtil.getParentResolvedCall
import org.jetbrains.kotlin.resolve.calls.callUtil.getResolvedCall
import org.jetbrains.kotlin.resolve.calls.callUtil.getValueArgumentForExpression
import org.jetbrains.kotlin.resolve.calls.model.ResolvedCall
import org.jetbrains.kotlin.resolve.constants.IntegerValueTypeConstant
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.TypeUtils
import org.jetbrains.kotlin.types.TypeUtils.NO_EXPECTED_TYPE
import org.jetbrains.kotlin.types.typeUtil.*
import java.util.*

//TODO: should use change signature to deal with cases of multiple overridden descriptors
class QuickFixFactoryForTypeMismatchError : KotlinIntentionActionsFactory() {

    override fun doCreateActions(diagnostic: Diagnostic): List<IntentionAction> {
        val actions = LinkedList<IntentionAction>()

        val context = (diagnostic.psiFile as KtFile).analyzeWithContent()

        val diagnosticElement = diagnostic.psiElement
        if (diagnosticElement !is KtExpression) {
            LOG.error("Unexpected element: " + diagnosticElement.text)
            return emptyList()
        }

        val expectedType: KotlinType
        val expressionType: KotlinType?
        when (diagnostic.factory) {
            Errors.TYPE_MISMATCH -> {
                val diagnosticWithParameters = Errors.TYPE_MISMATCH.cast(diagnostic)
                expectedType = diagnosticWithParameters.a
                expressionType = diagnosticWithParameters.b
            }
            Errors.NULL_FOR_NONNULL_TYPE -> {
                val diagnosticWithParameters = Errors.NULL_FOR_NONNULL_TYPE.cast(diagnostic)
                expectedType = diagnosticWithParameters.a
                expressionType = expectedType.makeNullable()
            }
            Errors.TYPE_INFERENCE_EXPECTED_TYPE_MISMATCH -> {
                val diagnosticWithParameters = Errors.TYPE_INFERENCE_EXPECTED_TYPE_MISMATCH.cast(diagnostic)
                expectedType = diagnosticWithParameters.a
                expressionType = diagnosticWithParameters.b
            }
            Errors.CONSTANT_EXPECTED_TYPE_MISMATCH -> {
                val diagnosticWithParameters = Errors.CONSTANT_EXPECTED_TYPE_MISMATCH.cast(diagnostic)
                expectedType = diagnosticWithParameters.b
                expressionType = context.getType(diagnosticElement)
            }
            Errors.SIGNED_CONSTANT_CONVERTED_TO_UNSIGNED -> {
                val constantValue = context[BindingContext.COMPILE_TIME_VALUE, diagnosticElement]
                if (constantValue is IntegerValueTypeConstant) {
                    // Here we have unsigned type (despite really constant is signed)
                    expectedType = constantValue.getType(NO_EXPECTED_TYPE)
                    val signedConstantValue = with(IntegerValueTypeConstant) {
                        constantValue.convertToSignedConstant(diagnosticElement.findModuleDescriptor())
                    }
                    // And here we have signed type
                    expressionType = signedConstantValue.getType(NO_EXPECTED_TYPE)
                } else return emptyList()
            }
            else -> {
                LOG.error("Unexpected diagnostic: " + DefaultErrorMessages.render(diagnostic))
                return emptyList()
            }
        }
        if (expressionType == null) {
            LOG.error("No type inferred: " + diagnosticElement.text)
            return emptyList()
        }

        if (expressionType.isSignedOrUnsignedNumberType() && expectedType.isSignedOrUnsignedNumberType()) {
            var wrongPrimitiveLiteralFix: WrongPrimitiveLiteralFix? = null
            if (diagnosticElement is KtConstantExpression && !KotlinBuiltIns.isChar(expectedType)) {
                wrongPrimitiveLiteralFix = WrongPrimitiveLiteralFix(diagnosticElement, expectedType)
                actions.add(wrongPrimitiveLiteralFix)
            }
            actions.add(NumberConversionFix(diagnosticElement, expectedType, wrongPrimitiveLiteralFix))
            actions.add(RoundNumberFix(diagnosticElement, expectedType, wrongPrimitiveLiteralFix))
        }

        if (KotlinBuiltIns.isCharSequenceOrNullableCharSequence(expectedType) || KotlinBuiltIns.isStringOrNullableString(expectedType)) {
            actions.add(AddToStringFix(diagnosticElement, false))
            if (expectedType.isMarkedNullable && expressionType.isMarkedNullable) {
                actions.add(AddToStringFix(diagnosticElement, true))
            }
        }

        if (expectedType.isInterface()) {
            val expressionTypeDeclaration = expressionType.constructor.declarationDescriptor?.let {
                DescriptorToSourceUtils.descriptorToDeclaration(it)
            } as? KtClassOrObject
            if (expressionTypeDeclaration != null && expectedType != TypeUtils.makeNotNullable(expressionType)) {
                actions.add(LetImplementInterfaceFix(expressionTypeDeclaration, expectedType, expressionType))
            }
        }


        actions.addAll(WrapWithCollectionLiteralCallFix.create(expectedType, expressionType, diagnosticElement))

        ConvertCollectionFix.getConversionTypeOrNull(expressionType, expectedType)?.let {
            actions.add(ConvertCollectionFix(diagnosticElement, it))
        }

        fun KtExpression.getTopMostQualifiedForSelectorIfAny(): KtExpression {
            var qualifiedOrThis = this
            do {
                val element = qualifiedOrThis
                qualifiedOrThis = element.getQualifiedExpressionForSelectorOrThis()
            } while (qualifiedOrThis !== element)
            return qualifiedOrThis
        }

        // We don't want to cast a cast or type-asserted expression:
        if (diagnostic.factory != Errors.SIGNED_CONSTANT_CONVERTED_TO_UNSIGNED &&
            diagnosticElement !is KtBinaryExpressionWithTypeRHS &&
            diagnosticElement.parent !is KtBinaryExpressionWithTypeRHS
        ) {
            actions.add(CastExpressionFix(diagnosticElement.getTopMostQualifiedForSelectorIfAny(), expectedType))
        }

        if (!expectedType.isMarkedNullable && TypeUtils.isNullableType(expressionType)) {
            val nullableExpected = expectedType.makeNullable()
            if (expressionType.isSubtypeOf(nullableExpected)) {
                val targetExpression = diagnosticElement.getTopMostQualifiedForSelectorIfAny()
                getAddExclExclCallFix(targetExpression)?.let { actions.add(it) }
                if (expectedType.isBoolean()) {
                    actions.add(AddEqEqTrueFix(targetExpression))
                }
            }
        }

        fun <D : KtCallableDeclaration> addChangeTypeFix(
            callable: D,
            expressionType: KotlinType,
            createFix: (D, KotlinType) -> KotlinQuickFixAction<KtCallableDeclaration>
        ) {
            val scope = callable.getResolutionScope(context, callable.getResolutionFacade())
            val typeToInsert = expressionType.approximateWithResolvableType(scope, false)
            if (typeToInsert.isKFunctionType) {
                actions.add(createFix(callable, typeToInsert.reflectToRegularFunctionType()))
            }
            actions.add(createFix(callable, typeToInsert))
        }

        // Property initializer type mismatch property type:
        val property = PsiTreeUtil.getParentOfType(diagnosticElement, KtProperty::class.java)
        if (property != null) {
            val getter = property.getter
            val initializer = property.initializer
            if (QuickFixUtil.canEvaluateTo(initializer, diagnosticElement)
                || getter != null && QuickFixUtil.canFunctionOrGetterReturnExpression(getter, diagnosticElement)
            ) {
                addChangeTypeFix(property, expressionType, ::ChangeVariableTypeFix)
            }
        }

        val expressionParent = diagnosticElement.parent

        // Mismatch in returned expression:

        val function = if (expressionParent is KtReturnExpression)
            expressionParent.getTargetFunction(context)
        else
            PsiTreeUtil.getParentOfType(diagnosticElement, KtFunction::class.java, true)
        if (function is KtFunction && QuickFixUtil.canFunctionOrGetterReturnExpression(function, diagnosticElement)) {
            addChangeTypeFix(function, expressionType, ChangeCallableReturnTypeFix::ForEnclosing)
        }

        // Fixing overloaded operators:
        if (diagnosticElement is KtOperationExpression) {
            val resolvedCall = diagnosticElement.getResolvedCall(context)
            if (resolvedCall != null) {
                val declaration = getFunctionDeclaration(resolvedCall)
                if (declaration != null) {
                    actions.add(ChangeCallableReturnTypeFix.ForCalled(declaration, expectedType))
                }
            }
        }

        // Change function return type when TYPE_MISMATCH is reported on call expression:
        if (diagnosticElement is KtCallExpression) {
            val resolvedCall = diagnosticElement.getResolvedCall(context)
            if (resolvedCall != null) {
                val declaration = getFunctionDeclaration(resolvedCall)
                if (declaration != null) {
                    actions.add(ChangeCallableReturnTypeFix.ForCalled(declaration, expectedType))
                }
            }
        }

        // KT-10063: arrayOf() bounding single array element
        val annotationEntry = PsiTreeUtil.getParentOfType(diagnosticElement, KtAnnotationEntry::class.java)
        if (annotationEntry != null) {
            if (KotlinBuiltIns.isArray(expectedType) && expressionType.isSubtypeOf(expectedType.arguments[0].type)
                || KotlinBuiltIns.isPrimitiveArray(expectedType)
            ) {
                actions.add(AddArrayOfTypeFix(diagnosticElement, expectedType))
                if (diagnosticElement.languageVersionSettings.supportsFeature(LanguageFeature.ArrayLiteralsInAnnotations)) {
                    actions.add(WrapWithArrayLiteralFix(diagnosticElement))
                }
            }
        }

        diagnosticElement.getStrictParentOfType<KtParameter>()?.let {
            if (it.defaultValue == diagnosticElement) {
                actions.add(ChangeParameterTypeFix(it, expressionType))
            }
        }

        val resolvedCall = diagnosticElement.getParentResolvedCall(context, true)
        if (resolvedCall != null) {
            // to fix 'type mismatch' on 'if' branches
            // todo: the same with 'when'
            val parentIf = QuickFixUtil.getParentIfForBranch(diagnosticElement)
            val argumentExpression = parentIf ?: diagnosticElement
            val valueArgument = resolvedCall.call.getValueArgumentForExpression(argumentExpression)
            if (valueArgument != null) {
                val correspondingParameterDescriptor = resolvedCall.getParameterForArgument(valueArgument)
                val correspondingParameter = QuickFixUtil.safeGetDeclaration(correspondingParameterDescriptor) as? KtParameter
                val expressionFromArgument = valueArgument.getArgumentExpression()
                val valueArgumentType = when (diagnostic.factory) {
                    Errors.NULL_FOR_NONNULL_TYPE, Errors.SIGNED_CONSTANT_CONVERTED_TO_UNSIGNED -> expressionType
                    else -> expressionFromArgument?.let { context.getType(it) }
                }
                if (valueArgumentType != null) {
                    if (correspondingParameter != null) {
                        val callable = PsiTreeUtil.getParentOfType(correspondingParameter, KtCallableDeclaration::class.java, true)
                        val scope = callable?.getResolutionScope(context, callable.getResolutionFacade())
                        val typeToInsert = valueArgumentType.approximateWithResolvableType(scope, true)
                        actions.add(ChangeParameterTypeFix(correspondingParameter, typeToInsert))
                    }
                    val parameterVarargType = correspondingParameterDescriptor?.varargElementType
                    if ((parameterVarargType != null || resolvedCall.resultingDescriptor.fqNameSafe == FqName("kotlin.collections.mapOf"))
                        && KotlinBuiltIns.isArray(valueArgumentType)
                        && expressionType.arguments.isNotEmpty()
                        && expressionType.arguments[0].type.constructor == expectedType.constructor
                    ) {
                        actions.add(ChangeToUseSpreadOperatorFix(diagnosticElement))
                    }
                }
            }
        }
        return actions
    }

    companion object {
        private val LOG = Logger.getInstance(QuickFixFactoryForTypeMismatchError::class.java)

        private fun getFunctionDeclaration(resolvedCall: ResolvedCall<*>): KtFunction? {
            val result = QuickFixUtil.safeGetDeclaration(resolvedCall.resultingDescriptor)
            if (result is KtFunction) {
                return result
            }
            return null
        }
    }
}

