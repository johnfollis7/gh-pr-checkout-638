/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.quickfix;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("fir")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class HighLevelQuickFixTestGenerated extends AbstractHighLevelQuickFixTest {
    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../idea/testData/quickfix/abstract")
    public static class Abstract extends AbstractHighLevelQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("abstractFunctionInNonAbstractClass.kt")
        public void testAbstractFunctionInNonAbstractClass() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractFunctionInNonAbstractClass.kt");
        }

        @TestMetadata("abstractFunctionWithBody.kt")
        public void testAbstractFunctionWithBody() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractFunctionWithBody.kt");
        }

        @TestMetadata("abstractFunctionWithBody2.kt")
        public void testAbstractFunctionWithBody2() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractFunctionWithBody2.kt");
        }

        @TestMetadata("abstractFunctionWithBody3.kt")
        public void testAbstractFunctionWithBody3() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractFunctionWithBody3.kt");
        }

        @TestMetadata("abstractFunctionWithBodyWithComments.kt")
        public void testAbstractFunctionWithBodyWithComments() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractFunctionWithBodyWithComments.kt");
        }

        @TestMetadata("abstractFunctionWithBodyWithComments2.kt")
        public void testAbstractFunctionWithBodyWithComments2() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractFunctionWithBodyWithComments2.kt");
        }

        @TestMetadata("abstractPropertyInCompanionObject.kt")
        public void testAbstractPropertyInCompanionObject() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractPropertyInCompanionObject.kt");
        }

        @TestMetadata("abstractPropertyInNonAbstractClass1.kt")
        public void testAbstractPropertyInNonAbstractClass1() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractPropertyInNonAbstractClass1.kt");
        }

        @TestMetadata("abstractPropertyInNonAbstractClass2.kt")
        public void testAbstractPropertyInNonAbstractClass2() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractPropertyInNonAbstractClass2.kt");
        }

        @TestMetadata("abstractPropertyInNonAbstractClass3.kt")
        public void testAbstractPropertyInNonAbstractClass3() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractPropertyInNonAbstractClass3.kt");
        }

        @TestMetadata("abstractPropertyInPrimaryConstructorParameters.kt")
        public void testAbstractPropertyInPrimaryConstructorParameters() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractPropertyInPrimaryConstructorParameters.kt");
        }

        @TestMetadata("abstractPropertyNotInClass.kt")
        public void testAbstractPropertyNotInClass() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractPropertyNotInClass.kt");
        }

        @TestMetadata("abstractPropertyWIthInitializer2.kt")
        public void testAbstractPropertyWIthInitializer2() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractPropertyWIthInitializer2.kt");
        }

        @TestMetadata("abstractPropertyWIthInitializer3.kt")
        public void testAbstractPropertyWIthInitializer3() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractPropertyWIthInitializer3.kt");
        }

        @TestMetadata("abstractPropertyWithGetter1.kt")
        public void testAbstractPropertyWithGetter1() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractPropertyWithGetter1.kt");
        }

        @TestMetadata("abstractPropertyWithGetter2.kt")
        public void testAbstractPropertyWithGetter2() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractPropertyWithGetter2.kt");
        }

        @TestMetadata("abstractPropertyWithInitializer1.kt")
        public void testAbstractPropertyWithInitializer1() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractPropertyWithInitializer1.kt");
        }

        @TestMetadata("abstractPropertyWithSetter.kt")
        public void testAbstractPropertyWithSetter() throws Exception {
            runTest("../idea/testData/quickfix/abstract/abstractPropertyWithSetter.kt");
        }

        @TestMetadata("makeEnumEntryAbstract.kt")
        public void testMakeEnumEntryAbstract() throws Exception {
            runTest("../idea/testData/quickfix/abstract/makeEnumEntryAbstract.kt");
        }

        @TestMetadata("makeInlineClassAbstract.kt")
        public void testMakeInlineClassAbstract() throws Exception {
            runTest("../idea/testData/quickfix/abstract/makeInlineClassAbstract.kt");
        }

        @TestMetadata("makeObjectMemberAbstract.kt")
        public void testMakeObjectMemberAbstract() throws Exception {
            runTest("../idea/testData/quickfix/abstract/makeObjectMemberAbstract.kt");
        }

        @TestMetadata("makeTopLevelAbstract.kt")
        public void testMakeTopLevelAbstract() throws Exception {
            runTest("../idea/testData/quickfix/abstract/makeTopLevelAbstract.kt");
        }

        @TestMetadata("manyImpl.kt")
        public void testManyImpl() throws Exception {
            runTest("../idea/testData/quickfix/abstract/manyImpl.kt");
        }

        @TestMetadata("mustBeInitializedOrBeAbstract.kt")
        public void testMustBeInitializedOrBeAbstract() throws Exception {
            runTest("../idea/testData/quickfix/abstract/mustBeInitializedOrBeAbstract.kt");
        }

        @TestMetadata("mustBeInitializedOrBeAbstractInFinalClass.kt")
        public void testMustBeInitializedOrBeAbstractInFinalClass() throws Exception {
            runTest("../idea/testData/quickfix/abstract/mustBeInitializedOrBeAbstractInFinalClass.kt");
        }

        @TestMetadata("mustBeInitializedOrBeAbstractInOpenClass.kt")
        public void testMustBeInitializedOrBeAbstractInOpenClass() throws Exception {
            runTest("../idea/testData/quickfix/abstract/mustBeInitializedOrBeAbstractInOpenClass.kt");
        }

        @TestMetadata("mustBeInitializedOrBeAbstractInSealedClass.kt")
        public void testMustBeInitializedOrBeAbstractInSealedClass() throws Exception {
            runTest("../idea/testData/quickfix/abstract/mustBeInitializedOrBeAbstractInSealedClass.kt");
        }

        @TestMetadata("nonAbstractFunctionWithNoBody.kt")
        public void testNonAbstractFunctionWithNoBody() throws Exception {
            runTest("../idea/testData/quickfix/abstract/nonAbstractFunctionWithNoBody.kt");
        }

        @TestMetadata("nonMemberAbstractFunction.kt")
        public void testNonMemberAbstractFunction() throws Exception {
            runTest("../idea/testData/quickfix/abstract/nonMemberAbstractFunction.kt");
        }

        @TestMetadata("nonMemberFunctionNoBody.kt")
        public void testNonMemberFunctionNoBody() throws Exception {
            runTest("../idea/testData/quickfix/abstract/nonMemberFunctionNoBody.kt");
        }

        @TestMetadata("notImplementedMember.kt")
        public void testNotImplementedMember() throws Exception {
            runTest("../idea/testData/quickfix/abstract/notImplementedMember.kt");
        }

        @TestMetadata("notImplementedMemberFromAbstractClass.kt")
        public void testNotImplementedMemberFromAbstractClass() throws Exception {
            runTest("../idea/testData/quickfix/abstract/notImplementedMemberFromAbstractClass.kt");
        }

        @TestMetadata("replaceOpen.kt")
        public void testReplaceOpen() throws Exception {
            runTest("../idea/testData/quickfix/abstract/replaceOpen.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../idea/testData/quickfix/lateinit")
    public static class Lateinit extends AbstractHighLevelQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("nullable.kt")
        public void testNullable() throws Exception {
            runTest("../idea/testData/quickfix/lateinit/nullable.kt");
        }

        @TestMetadata("val.kt")
        public void testVal() throws Exception {
            runTest("../idea/testData/quickfix/lateinit/val.kt");
        }

        @TestMetadata("withGetter.kt")
        public void testWithGetter() throws Exception {
            runTest("../idea/testData/quickfix/lateinit/withGetter.kt");
        }

        @TestMetadata("withGetterSetter.kt")
        public void testWithGetterSetter() throws Exception {
            runTest("../idea/testData/quickfix/lateinit/withGetterSetter.kt");
        }

        @TestMetadata("withInitializer.kt")
        public void testWithInitializer() throws Exception {
            runTest("../idea/testData/quickfix/lateinit/withInitializer.kt");
        }

        @TestMetadata("withSetter.kt")
        public void testWithSetter() throws Exception {
            runTest("../idea/testData/quickfix/lateinit/withSetter.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../idea/testData/quickfix/modifiers")
    public static class Modifiers extends AbstractHighLevelQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("abstractModifierInEnum.kt")
        public void testAbstractModifierInEnum() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/abstractModifierInEnum.kt");
        }

        @TestMetadata("abstractVarWithPrivateSetter.kt")
        public void testAbstractVarWithPrivateSetter() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/abstractVarWithPrivateSetter.kt");
        }

        @TestMetadata("addLateinit.kt")
        public void testAddLateinit() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/addLateinit.kt");
        }

        @TestMetadata("cannotMakeClassAnnotation.kt")
        public void testCannotMakeClassAnnotation() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/cannotMakeClassAnnotation.kt");
        }

        @TestMetadata("finalTrait.kt")
        public void testFinalTrait() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/finalTrait.kt");
        }

        @TestMetadata("illegalEnumAnnotation1.kt")
        public void testIllegalEnumAnnotation1() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/illegalEnumAnnotation1.kt");
        }

        @TestMetadata("illegalEnumAnnotation2.kt")
        public void testIllegalEnumAnnotation2() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/illegalEnumAnnotation2.kt");
        }

        @TestMetadata("infixModifier.kt")
        public void testInfixModifier() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/infixModifier.kt");
        }

        @TestMetadata("kt10409.kt")
        public void testKt10409() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/kt10409.kt");
        }

        @TestMetadata("nestedAbstractClass.kt")
        public void testNestedAbstractClass() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/nestedAbstractClass.kt");
        }

        @TestMetadata("nestedAnnotationClass.kt")
        public void testNestedAnnotationClass() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/nestedAnnotationClass.kt");
        }

        @TestMetadata("nestedClassNotAllowed.kt")
        public void testNestedClassNotAllowed() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/nestedClassNotAllowed.kt");
        }

        @TestMetadata("nestedDataClass.kt")
        public void testNestedDataClass() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/nestedDataClass.kt");
        }

        @TestMetadata("nestedEnumClass.kt")
        public void testNestedEnumClass() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/nestedEnumClass.kt");
        }

        @TestMetadata("nestedInterface.kt")
        public void testNestedInterface() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/nestedInterface.kt");
        }

        @TestMetadata("nestedObject.kt")
        public void testNestedObject() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/nestedObject.kt");
        }

        @TestMetadata("nestedSealedClass.kt")
        public void testNestedSealedClass() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/nestedSealedClass.kt");
        }

        @TestMetadata("noAbstractForAnonymousObject.kt")
        public void testNoAbstractForAnonymousObject() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/noAbstractForAnonymousObject.kt");
        }

        @TestMetadata("noAbstractForObject.kt")
        public void testNoAbstractForObject() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/noAbstractForObject.kt");
        }

        @TestMetadata("noLateinitOnNullable.kt")
        public void testNoLateinitOnNullable() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/noLateinitOnNullable.kt");
        }

        @TestMetadata("noLateinitOnPrimitive.kt")
        public void testNoLateinitOnPrimitive() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/noLateinitOnPrimitive.kt");
        }

        @TestMetadata("notAnAnnotationClass.kt")
        public void testNotAnAnnotationClass() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/notAnAnnotationClass.kt");
        }

        @TestMetadata("openCompanionObject.kt")
        public void testOpenCompanionObject() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/openCompanionObject.kt");
        }

        @TestMetadata("openCompanionObject2.kt")
        public void testOpenCompanionObject2() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/openCompanionObject2.kt");
        }

        @TestMetadata("openMemberInFinalClass1.kt")
        public void testOpenMemberInFinalClass1() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/openMemberInFinalClass1.kt");
        }

        @TestMetadata("openMemberInFinalClass2.kt")
        public void testOpenMemberInFinalClass2() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/openMemberInFinalClass2.kt");
        }

        @TestMetadata("openMemberInFinalClass3.kt")
        public void testOpenMemberInFinalClass3() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/openMemberInFinalClass3.kt");
        }

        @TestMetadata("openMemberInFinalClass4.kt")
        public void testOpenMemberInFinalClass4() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/openMemberInFinalClass4.kt");
        }

        @TestMetadata("openModifierInEnum.kt")
        public void testOpenModifierInEnum() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/openModifierInEnum.kt");
        }

        @TestMetadata("openObject.kt")
        public void testOpenObject() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/openObject.kt");
        }

        @TestMetadata("openVarWithPrivateSetter1.kt")
        public void testOpenVarWithPrivateSetter1() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/openVarWithPrivateSetter1.kt");
        }

        @TestMetadata("openVarWithPrivateSetter2.kt")
        public void testOpenVarWithPrivateSetter2() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/openVarWithPrivateSetter2.kt");
        }

        @TestMetadata("operatorModifier.kt")
        public void testOperatorModifier() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/operatorModifier.kt");
        }

        @TestMetadata("operatorModifierCollection.kt")
        public void testOperatorModifierCollection() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/operatorModifierCollection.kt");
        }

        @TestMetadata("operatorModifierComponent.kt")
        public void testOperatorModifierComponent() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/operatorModifierComponent.kt");
        }

        @TestMetadata("operatorModifierGet.kt")
        public void testOperatorModifierGet() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/operatorModifierGet.kt");
        }

        @TestMetadata("operatorModifierInherited.kt")
        public void testOperatorModifierInherited() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/operatorModifierInherited.kt");
        }

        @TestMetadata("overrideWithPrivateSetter1.kt")
        public void testOverrideWithPrivateSetter1() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/overrideWithPrivateSetter1.kt");
        }

        @TestMetadata("overrideWithPrivateSetter2.kt")
        public void testOverrideWithPrivateSetter2() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/overrideWithPrivateSetter2.kt");
        }

        @TestMetadata("packageMemberCannotBeProtected.kt")
        public void testPackageMemberCannotBeProtected() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/packageMemberCannotBeProtected.kt");
        }

        @TestMetadata("redundantOpenInInterface.kt")
        public void testRedundantOpenInInterface() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/redundantOpenInInterface.kt");
        }

        @TestMetadata("removeAbstractModifier.kt")
        public void testRemoveAbstractModifier() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/removeAbstractModifier.kt");
        }

        @TestMetadata("removeConst.kt")
        public void testRemoveConst() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/removeConst.kt");
        }

        @TestMetadata("removeIncompatibleModifier.kt")
        public void testRemoveIncompatibleModifier() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/removeIncompatibleModifier.kt");
        }

        @TestMetadata("removeInnerForClassInTrait.kt")
        public void testRemoveInnerForClassInTrait() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/removeInnerForClassInTrait.kt");
        }

        @TestMetadata("removeModifierFromForbiddenOperatorMod.kt")
        public void testRemoveModifierFromForbiddenOperatorMod() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/removeModifierFromForbiddenOperatorMod.kt");
        }

        @TestMetadata("removeModifierFromOperatorMod.kt")
        public void testRemoveModifierFromOperatorMod() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/removeModifierFromOperatorMod.kt");
        }

        @TestMetadata("removeModifierFromOperatorModAssign.kt")
        public void testRemoveModifierFromOperatorModAssign() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/removeModifierFromOperatorModAssign.kt");
        }

        @TestMetadata("removeProtectedModifier.kt")
        public void testRemoveProtectedModifier() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/removeProtectedModifier.kt");
        }

        @TestMetadata("removeRedundantModifier1.kt")
        public void testRemoveRedundantModifier1() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/removeRedundantModifier1.kt");
        }

        @TestMetadata("removeRedundantModifier2.kt")
        public void testRemoveRedundantModifier2() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/removeRedundantModifier2.kt");
        }

        @TestMetadata("removeRedundantModifier3.kt")
        public void testRemoveRedundantModifier3() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/removeRedundantModifier3.kt");
        }

        @TestMetadata("removeSupertype1.kt")
        public void testRemoveSupertype1() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/removeSupertype1.kt");
        }

        @TestMetadata("removeSupertype2.kt")
        public void testRemoveSupertype2() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/removeSupertype2.kt");
        }

        @TestMetadata("removeSupertype3.kt")
        public void testRemoveSupertype3() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/removeSupertype3.kt");
        }

        @TestMetadata("removeSupertype4.kt")
        public void testRemoveSupertype4() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/removeSupertype4.kt");
        }

        @TestMetadata("visibilityModifer1.kt")
        public void testVisibilityModifer1() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/visibilityModifer1.kt");
        }

        @TestMetadata("visibilityModifer2.kt")
        public void testVisibilityModifer2() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/visibilityModifer2.kt");
        }

        @TestMetadata("visibilityModiferOverrideJavaRuntime.kt")
        public void testVisibilityModiferOverrideJavaRuntime() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/visibilityModiferOverrideJavaRuntime.kt");
        }

        @TestMetadata("visibilityModiferParameter.kt")
        public void testVisibilityModiferParameter() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/visibilityModiferParameter.kt");
        }

        @TestMetadata("withAnnotationAndBlockComment.kt")
        public void testWithAnnotationAndBlockComment() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/withAnnotationAndBlockComment.kt");
        }

        @TestMetadata("withAnnotationAndEolComment.kt")
        public void testWithAnnotationAndEolComment() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/withAnnotationAndEolComment.kt");
        }

        @TestMetadata("withAnnotationAndEolComment2.kt")
        public void testWithAnnotationAndEolComment2() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/withAnnotationAndEolComment2.kt");
        }

        @TestMetadata("withAnnotationAndEolComment3.kt")
        public void testWithAnnotationAndEolComment3() throws Exception {
            runTest("../idea/testData/quickfix/modifiers/withAnnotationAndEolComment3.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../idea/testData/quickfix/override/typeMismatchOnOverride")
    public static class TypeMismatchOnOverride extends AbstractHighLevelQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("cantChangeMultipleOverriddenPropertiesTypes.kt")
        public void testCantChangeMultipleOverriddenPropertiesTypes() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/cantChangeMultipleOverriddenPropertiesTypes.kt");
        }

        @TestMetadata("cantChangeOverriddenPropertyTypeToMatchOverridingProperty.kt")
        public void testCantChangeOverriddenPropertyTypeToMatchOverridingProperty() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/cantChangeOverriddenPropertyTypeToMatchOverridingProperty.kt");
        }

        @TestMetadata("cantChangePropertyTypeToMatchOverridenProperties.kt")
        public void testCantChangePropertyTypeToMatchOverridenProperties() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/cantChangePropertyTypeToMatchOverridenProperties.kt");
        }

        @TestMetadata("cantChangeReturnTypeOfOverriddenFunction.kt")
        public void testCantChangeReturnTypeOfOverriddenFunction() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/cantChangeReturnTypeOfOverriddenFunction.kt");
        }

        @TestMetadata("changeOverriddenPropertyType1.kt")
        public void testChangeOverriddenPropertyType1() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/changeOverriddenPropertyType1.kt");
        }

        @TestMetadata("changeOverriddenPropertyType2.kt")
        public void testChangeOverriddenPropertyType2() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/changeOverriddenPropertyType2.kt");
        }

        @TestMetadata("changeOverriddenPropertyTypeFromCtorParameter.kt")
        public void testChangeOverriddenPropertyTypeFromCtorParameter() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/changeOverriddenPropertyTypeFromCtorParameter.kt");
        }

        @TestMetadata("changeOverridingCtorParameterType.kt")
        public void testChangeOverridingCtorParameterType() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/changeOverridingCtorParameterType.kt");
        }

        @TestMetadata("changeOverridingPropertyTypeToFunctionType.kt")
        public void testChangeOverridingPropertyTypeToFunctionType() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/changeOverridingPropertyTypeToFunctionType.kt");
        }

        @TestMetadata("changeReturnTypeOfOverriddenFunction.kt")
        public void testChangeReturnTypeOfOverriddenFunction() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/changeReturnTypeOfOverriddenFunction.kt");
        }

        @TestMetadata("namedFunctionReturnOverrideInsideVariableInitializer.kt")
        public void testNamedFunctionReturnOverrideInsideVariableInitializer() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/namedFunctionReturnOverrideInsideVariableInitializer.kt");
        }

        @TestMetadata("objectInsideBody.kt")
        public void testObjectInsideBody() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/objectInsideBody.kt");
        }

        @TestMetadata("propertyReturnTypeMismatchOnOverride.kt")
        public void testPropertyReturnTypeMismatchOnOverride() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/propertyReturnTypeMismatchOnOverride.kt");
        }

        @TestMetadata("propertyTypeMismatchOnOverrideIntLong.kt")
        public void testPropertyTypeMismatchOnOverrideIntLong() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/propertyTypeMismatchOnOverrideIntLong.kt");
        }

        @TestMetadata("propertyTypeMismatchOnOverrideIntUnit.kt")
        public void testPropertyTypeMismatchOnOverrideIntUnit() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/propertyTypeMismatchOnOverrideIntUnit.kt");
        }

        @TestMetadata("returnTypeMismatchOnMultipleOverride.kt")
        public void testReturnTypeMismatchOnMultipleOverride() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/returnTypeMismatchOnMultipleOverride.kt");
        }

        @TestMetadata("returnTypeMismatchOnMultipleOverrideAmbiguity.kt")
        public void testReturnTypeMismatchOnMultipleOverrideAmbiguity() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/returnTypeMismatchOnMultipleOverrideAmbiguity.kt");
        }

        @TestMetadata("returnTypeMismatchOnOverrideIntLong.kt")
        public void testReturnTypeMismatchOnOverrideIntLong() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/returnTypeMismatchOnOverrideIntLong.kt");
        }

        @TestMetadata("returnTypeMismatchOnOverrideIntUnit.kt")
        public void testReturnTypeMismatchOnOverrideIntUnit() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/returnTypeMismatchOnOverrideIntUnit.kt");
        }

        @TestMetadata("returnTypeMismatchOnOverrideUnitInt.kt")
        public void testReturnTypeMismatchOnOverrideUnitInt() throws Exception {
            runTest("../idea/testData/quickfix/override/typeMismatchOnOverride/returnTypeMismatchOnOverrideUnitInt.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../idea/testData/quickfix/variables/changeMutability")
    public static class ChangeMutability extends AbstractHighLevelQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInChangeMutability() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/quickfix/variables/changeMutability"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), null, true);
        }

        @TestMetadata("capturedMemberValInitialization.kt")
        public void testCapturedMemberValInitialization() throws Exception {
            runTest("../idea/testData/quickfix/variables/changeMutability/capturedMemberValInitialization.kt");
        }

        @TestMetadata("capturedValInitialization.kt")
        public void testCapturedValInitialization() throws Exception {
            runTest("../idea/testData/quickfix/variables/changeMutability/capturedValInitialization.kt");
        }

        @TestMetadata("const.kt")
        public void testConst() throws Exception {
            runTest("../idea/testData/quickfix/variables/changeMutability/const.kt");
        }

        @TestMetadata("funParameter.kt")
        public void testFunParameter() throws Exception {
            runTest("../idea/testData/quickfix/variables/changeMutability/funParameter.kt");
        }

        @TestMetadata("localInGetter.kt")
        public void testLocalInGetter() throws Exception {
            runTest("../idea/testData/quickfix/variables/changeMutability/localInGetter.kt");
        }

        @TestMetadata("valOverrideVar.kt")
        public void testValOverrideVar() throws Exception {
            runTest("../idea/testData/quickfix/variables/changeMutability/valOverrideVar.kt");
        }

        @TestMetadata("valOverrideVarConstructorParameter.kt")
        public void testValOverrideVarConstructorParameter() throws Exception {
            runTest("../idea/testData/quickfix/variables/changeMutability/valOverrideVarConstructorParameter.kt");
        }

        @TestMetadata("valReassignmentLocal.kt")
        public void testValReassignmentLocal() throws Exception {
            runTest("../idea/testData/quickfix/variables/changeMutability/valReassignmentLocal.kt");
        }

        @TestMetadata("valReassignmentOuterDecl.kt")
        public void testValReassignmentOuterDecl() throws Exception {
            runTest("../idea/testData/quickfix/variables/changeMutability/valReassignmentOuterDecl.kt");
        }

        @TestMetadata("valReassignmentProperty.kt")
        public void testValReassignmentProperty() throws Exception {
            runTest("../idea/testData/quickfix/variables/changeMutability/valReassignmentProperty.kt");
        }

        @TestMetadata("valReassignmentPropertyConstructorParameter.kt")
        public void testValReassignmentPropertyConstructorParameter() throws Exception {
            runTest("../idea/testData/quickfix/variables/changeMutability/valReassignmentPropertyConstructorParameter.kt");
        }

        @TestMetadata("valWithSetter.kt")
        public void testValWithSetter() throws Exception {
            runTest("../idea/testData/quickfix/variables/changeMutability/valWithSetter.kt");
        }

        @TestMetadata("varAnnotationParameter.kt")
        public void testVarAnnotationParameter() throws Exception {
            runTest("../idea/testData/quickfix/variables/changeMutability/varAnnotationParameter.kt");
        }

        @TestMetadata("idea/testData/quickfix/variables/changeMutability/canBeVal")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class CanBeVal extends AbstractHighLevelQuickFixTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            public void testAllFilesPresentInCanBeVal() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/quickfix/variables/changeMutability/canBeVal"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), null, true);
            }

            @TestMetadata("const.kt")
            public void testConst() throws Exception {
                runTest("idea/testData/quickfix/variables/changeMutability/canBeVal/const.kt");
            }

            @TestMetadata("delegatedProperty.kt")
            public void testDelegatedProperty() throws Exception {
                runTest("idea/testData/quickfix/variables/changeMutability/canBeVal/delegatedProperty.kt");
            }

            @TestMetadata("delegatedProperty2.kt")
            public void testDelegatedProperty2() throws Exception {
                runTest("idea/testData/quickfix/variables/changeMutability/canBeVal/delegatedProperty2.kt");
            }

            @TestMetadata("delegatedProperty3.kt")
            public void testDelegatedProperty3() throws Exception {
                runTest("idea/testData/quickfix/variables/changeMutability/canBeVal/delegatedProperty3.kt");
            }

            @TestMetadata("multiVariable.kt")
            public void testMultiVariable() throws Exception {
                runTest("idea/testData/quickfix/variables/changeMutability/canBeVal/multiVariable.kt");
            }

            @TestMetadata("singleVariable.kt")
            public void testSingleVariable() throws Exception {
                runTest("idea/testData/quickfix/variables/changeMutability/canBeVal/singleVariable.kt");
            }

            @TestMetadata("uninitializedWithGetter.kt")
            public void testUninitializedWithGetter() throws Exception {
                runTest("idea/testData/quickfix/variables/changeMutability/canBeVal/uninitializedWithGetter.kt");
            }

            @TestMetadata("uninitializedWithGetter2.kt")
            public void testUninitializedWithGetter2() throws Exception {
                runTest("idea/testData/quickfix/variables/changeMutability/canBeVal/uninitializedWithGetter2.kt");
            }

            @TestMetadata("uninitializedWithGetter3.kt")
            public void testUninitializedWithGetter3() throws Exception {
                runTest("idea/testData/quickfix/variables/changeMutability/canBeVal/uninitializedWithGetter3.kt");
            }
        }
    }
}
