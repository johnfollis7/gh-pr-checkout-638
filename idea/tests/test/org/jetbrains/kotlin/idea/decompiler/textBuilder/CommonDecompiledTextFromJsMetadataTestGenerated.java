/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.decompiler.textBuilder;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.idea.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.idea.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.idea.test.TestRoot;
import org.junit.runner.RunWith;
import org.jetbrains.kotlin.test.TargetBackend;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("idea/tests")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/decompiler/decompiledText")
public class CommonDecompiledTextFromJsMetadataTestGenerated extends AbstractCommonDecompiledTextFromJsMetadataTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, TargetBackend.JS, testDataFilePath);
    }

    @TestMetadata("AnnotatedEnumEntry")
    public void testAnnotatedEnumEntry() throws Exception {
        runTest("testData/decompiler/decompiledText/AnnotatedEnumEntry/");
    }

    @TestMetadata("AnnotatedParameterInEnumConstructor")
    public void testAnnotatedParameterInEnumConstructor() throws Exception {
        runTest("testData/decompiler/decompiledText/AnnotatedParameterInEnumConstructor/");
    }

    @TestMetadata("AnnotatedParameterInInnerClassConstructor")
    public void testAnnotatedParameterInInnerClassConstructor() throws Exception {
        runTest("testData/decompiler/decompiledText/AnnotatedParameterInInnerClassConstructor/");
    }

    @TestMetadata("Annotations")
    public void testAnnotations() throws Exception {
        runTest("testData/decompiler/decompiledText/Annotations/");
    }

    @TestMetadata("AnnotationsOnPrimaryCtr")
    public void testAnnotationsOnPrimaryCtr() throws Exception {
        runTest("testData/decompiler/decompiledText/AnnotationsOnPrimaryCtr/");
    }

    @TestMetadata("ClassWithClassObject")
    public void testClassWithClassObject() throws Exception {
        runTest("testData/decompiler/decompiledText/ClassWithClassObject/");
    }

    @TestMetadata("ClassWithDelegatedComponentFunctions")
    public void testClassWithDelegatedComponentFunctions() throws Exception {
        runTest("testData/decompiler/decompiledText/ClassWithDelegatedComponentFunctions/");
    }

    @TestMetadata("ClassWithNamedClassObject")
    public void testClassWithNamedClassObject() throws Exception {
        runTest("testData/decompiler/decompiledText/ClassWithNamedClassObject/");
    }

    @TestMetadata("Const")
    public void testConst() throws Exception {
        runTest("testData/decompiler/decompiledText/Const/");
    }

    @TestMetadata("DependencyOnNestedClasses")
    public void testDependencyOnNestedClasses() throws Exception {
        runTest("testData/decompiler/decompiledText/DependencyOnNestedClasses/");
    }

    @TestMetadata("Enum")
    public void testEnum() throws Exception {
        runTest("testData/decompiler/decompiledText/Enum/");
    }

    @TestMetadata("FlexibleTypes")
    public void testFlexibleTypes() throws Exception {
        runTest("testData/decompiler/decompiledText/FlexibleTypes/");
    }

    @TestMetadata("FunInterfaceDeclaration")
    public void testFunInterfaceDeclaration() throws Exception {
        runTest("testData/decompiler/decompiledText/FunInterfaceDeclaration/");
    }

    @TestMetadata("FunctionTypes")
    public void testFunctionTypes() throws Exception {
        runTest("testData/decompiler/decompiledText/FunctionTypes/");
    }

    @TestMetadata("FunctionalTypeWithNamedArguments")
    public void testFunctionalTypeWithNamedArguments() throws Exception {
        runTest("testData/decompiler/decompiledText/FunctionalTypeWithNamedArguments/");
    }

    @TestMetadata("Inherited")
    public void testInherited() throws Exception {
        runTest("testData/decompiler/decompiledText/Inherited/");
    }

    @TestMetadata("InnerClasses")
    public void testInnerClasses() throws Exception {
        runTest("testData/decompiler/decompiledText/InnerClasses/");
    }

    @TestMetadata("LocalClassAsTypeWithArgument")
    public void testLocalClassAsTypeWithArgument() throws Exception {
        runTest("testData/decompiler/decompiledText/LocalClassAsTypeWithArgument/");
    }

    @TestMetadata("Modifiers")
    public void testModifiers() throws Exception {
        runTest("testData/decompiler/decompiledText/Modifiers/");
    }

    @TestMetadata("NestedClasses")
    public void testNestedClasses() throws Exception {
        runTest("testData/decompiler/decompiledText/NestedClasses/");
    }

    @TestMetadata("Object")
    public void testObject() throws Exception {
        runTest("testData/decompiler/decompiledText/Object/");
    }

    @TestMetadata("SecondaryConstructors")
    public void testSecondaryConstructors() throws Exception {
        runTest("testData/decompiler/decompiledText/SecondaryConstructors/");
    }

    @TestMetadata("SimpleClass")
    public void testSimpleClass() throws Exception {
        runTest("testData/decompiler/decompiledText/SimpleClass/");
    }

    @TestMetadata("TypeModifiers")
    public void testTypeModifiers() throws Exception {
        runTest("testData/decompiler/decompiledText/TypeModifiers/");
    }
}
