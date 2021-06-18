/*
 * Copyright 2010-2016 JetBrains s.r.o.
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

package org.jetbrains.uast.kotlin

import com.intellij.psi.*
import com.intellij.psi.impl.light.LightPsiClassBuilder
import org.jetbrains.kotlin.asJava.classes.KtLightClass
import org.jetbrains.kotlin.asJava.classes.KtLightClassForScript
import org.jetbrains.kotlin.asJava.elements.KtLightMethod
import org.jetbrains.kotlin.psi.*
import org.jetbrains.uast.*

class KotlinUClass(
    psi: KtLightClass,
    givenParent: UElement?
) : BaseKotlinUClass(psi, givenParent) {
    override fun buildPrimaryConstructorUMethod(ktClass: KtClassOrObject?, psi: KtLightMethod, givenParent: UElement?): UMethod {
        return KotlinConstructorUMethod(ktClass, psi, givenParent)
    }

    override fun buildSecondaryConstructorUMethod(ktClass: KtClassOrObject?, psi: KtLightMethod, givenParent: UElement?): UMethod {
        return KotlinSecondaryConstructorWithInitializersUMethod(ktClass, psi, givenParent)
    }

    companion object {
        fun create(psi: KtLightClass, containingElement: UElement?): UClass = when (psi) {
            is PsiAnonymousClass -> KotlinUAnonymousClass(psi, containingElement)
            is KtLightClassForScript -> KotlinScriptUClass(psi, containingElement)
            else -> KotlinUClass(psi, containingElement)
        }
    }

}

class KotlinUAnonymousClass(
        psi: PsiAnonymousClass,
        givenParent: UElement?
) : AbstractKotlinUClass(givenParent), UAnonymousClass, PsiAnonymousClass by psi {

    override val psi: PsiAnonymousClass = unwrap<UAnonymousClass, PsiAnonymousClass>(psi)

    override val javaPsi: PsiAnonymousClass = psi

    override val sourcePsi: KtClassOrObject? = ktClass

    override fun getOriginalElement(): PsiElement? = super<AbstractKotlinUClass>.getOriginalElement()

    override fun getSuperClass(): UClass? = super<AbstractKotlinUClass>.getSuperClass()
    override fun getFields(): Array<UField> = super<AbstractKotlinUClass>.getFields()
    override fun getMethods(): Array<UMethod> = super<AbstractKotlinUClass>.getMethods()
    override fun getInitializers(): Array<UClassInitializer> = super<AbstractKotlinUClass>.getInitializers()
    override fun getInnerClasses(): Array<UClass> = super<AbstractKotlinUClass>.getInnerClasses()

    override fun getContainingFile(): PsiFile = unwrapFakeFileForLightClass(psi.containingFile)

    override val uastAnchor by lazy {
        val ktClassOrObject = (psi.originalElement as? KtLightClass)?.kotlinOrigin as? KtObjectDeclaration ?: return@lazy null
        KotlinUIdentifier(ktClassOrObject.getObjectKeyword(), this)
        }

}

class KotlinScriptUClass(
        psi: KtLightClassForScript,
        givenParent: UElement?
) : AbstractKotlinUClass(givenParent), PsiClass by psi {
    override fun getContainingFile(): PsiFile = unwrapFakeFileForLightClass(psi.containingFile)

    override fun getNameIdentifier(): PsiIdentifier? = UastLightIdentifier(psi, psi.kotlinOrigin)

    override val uastAnchor by lazy { KotlinUIdentifier(nameIdentifier, sourcePsi?.nameIdentifier, this) }

    override val javaPsi: PsiClass = psi

    override val sourcePsi: KtClassOrObject? = psi.kotlinOrigin

    override val psi = unwrap<UClass, KtLightClassForScript>(psi)

    override fun getSuperClass(): UClass? = super.getSuperClass()

    override fun getFields(): Array<UField> = super.getFields()

    override fun getInitializers(): Array<UClassInitializer> = super.getInitializers()

    override fun getInnerClasses(): Array<UClass> =
            psi.innerClasses.mapNotNull { getLanguagePlugin().convertOpt<UClass>(it, this) }.toTypedArray()

    override fun getMethods(): Array<UMethod> = psi.methods.map(this::createUMethod).toTypedArray()

    private fun createUMethod(method: PsiMethod): UMethod {
        return if (method.isConstructor) {
            KotlinScriptConstructorUMethod(psi.script, method as KtLightMethod, this)
        }
        else {
            getLanguagePlugin().convertOpt(method, this) ?: reportConvertFailure(method)
        }
    }

    override fun getOriginalElement(): PsiElement? = psi.originalElement

    class KotlinScriptConstructorUMethod(
        script: KtScript,
        override val psi: KtLightMethod,
        givenParent: UElement?
    ) : KotlinUMethod(psi, psi.kotlinOrigin, givenParent) {
        override val uastBody: UExpression? by lz {
            val initializers = script.declarations.filterIsInstance<KtScriptInitializer>()
            KotlinLazyUBlockExpression.create(initializers, this)
        }
        override val javaPsi = psi
    }
}

/**
 * implementation of [UClass] for invalid code, when it is impossible to create a [KtLightClass]
 */
class KotlinInvalidUClass(
    override val psi: PsiClass,
    givenParent: UElement?
) : AbstractKotlinUClass(givenParent), PsiClass by psi {

    constructor(name: String, context: PsiElement, givenParent: UElement?) : this(LightPsiClassBuilder(context, name), givenParent)

    override fun getContainingFile(): PsiFile? = uastParent?.getContainingUFile()?.sourcePsi as? PsiFile

    override val sourcePsi: PsiElement? get() = null

    override val uastAnchor: UIdentifier? get() = null

    override val javaPsi: PsiClass get() = psi

    override fun getFields(): Array<UField> = emptyArray()

    override fun getInitializers(): Array<UClassInitializer> = emptyArray()

    override fun getInnerClasses(): Array<UClass> = emptyArray()

    override fun getMethods(): Array<UMethod> = emptyArray()

    override fun getSuperClass(): UClass? = null

    override fun getOriginalElement(): PsiElement? = null
}
