/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.intentions;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.idea.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.idea.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.idea.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("idea/tests")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/multiFileIntentions")
public class MultiFileIntentionTestGenerated extends AbstractMultiFileIntentionTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("addJvmStaticToCompanionObjectFun/addJvmStaticToCompanionObjectFun.test")
    public void testAddJvmStaticToCompanionObjectFun_AddJvmStaticToCompanionObjectFun() throws Exception {
        runTest("testData/multiFileIntentions/addJvmStaticToCompanionObjectFun/addJvmStaticToCompanionObjectFun.test");
    }

    @TestMetadata("addJvmStaticToCompanionObjectProperty/addJvmStaticToCompanionObjectProperty.test")
    public void testAddJvmStaticToCompanionObjectProperty_AddJvmStaticToCompanionObjectProperty() throws Exception {
        runTest("testData/multiFileIntentions/addJvmStaticToCompanionObjectProperty/addJvmStaticToCompanionObjectProperty.test");
    }

    @TestMetadata("addJvmStaticToNamedCompanionObjectFun/addJvmStaticToNamedCompanionObjectFun.test")
    public void testAddJvmStaticToNamedCompanionObjectFun_AddJvmStaticToNamedCompanionObjectFun() throws Exception {
        runTest("testData/multiFileIntentions/addJvmStaticToNamedCompanionObjectFun/addJvmStaticToNamedCompanionObjectFun.test");
    }

    @TestMetadata("addJvmStaticToNamedCompanionObjectProperty/addJvmStaticToNamedCompanionObjectProperty.test")
    public void testAddJvmStaticToNamedCompanionObjectProperty_AddJvmStaticToNamedCompanionObjectProperty() throws Exception {
        runTest("testData/multiFileIntentions/addJvmStaticToNamedCompanionObjectProperty/addJvmStaticToNamedCompanionObjectProperty.test");
    }

    @TestMetadata("addJvmStaticToObjectFun/addJvmStaticToObjectFun.test")
    public void testAddJvmStaticToObjectFun_AddJvmStaticToObjectFun() throws Exception {
        runTest("testData/multiFileIntentions/addJvmStaticToObjectFun/addJvmStaticToObjectFun.test");
    }

    @TestMetadata("addJvmStaticToObjectProperty/addJvmStaticToObjectProperty.test")
    public void testAddJvmStaticToObjectProperty_AddJvmStaticToObjectProperty() throws Exception {
        runTest("testData/multiFileIntentions/addJvmStaticToObjectProperty/addJvmStaticToObjectProperty.test");
    }

    @TestMetadata("convertMemberToExtension/addImports/addImports.test")
    public void testConvertMemberToExtension_addImports_AddImports() throws Exception {
        runTest("testData/multiFileIntentions/convertMemberToExtension/addImports/addImports.test");
    }

    @TestMetadata("implementAbstractMember/implementFunctionInJava/implementAllInJava.test")
    public void testImplementAbstractMember_implementFunctionInJava_ImplementAllInJava() throws Exception {
        runTest("testData/multiFileIntentions/implementAbstractMember/implementFunctionInJava/implementAllInJava.test");
    }

    @TestMetadata("implementAbstractMember/implementValInJava/implementAllInJava.test")
    public void testImplementAbstractMember_implementValInJava_ImplementAllInJava() throws Exception {
        runTest("testData/multiFileIntentions/implementAbstractMember/implementValInJava/implementAllInJava.test");
    }

    @TestMetadata("implementAbstractMember/implementVarInJava/implementAllInJava.test")
    public void testImplementAbstractMember_implementVarInJava_ImplementAllInJava() throws Exception {
        runTest("testData/multiFileIntentions/implementAbstractMember/implementVarInJava/implementAllInJava.test");
    }

    @TestMetadata("implementAsConstructorParameter/implementValInJava/implementAllInJava.test")
    public void testImplementAsConstructorParameter_implementValInJava_ImplementAllInJava() throws Exception {
        runTest("testData/multiFileIntentions/implementAsConstructorParameter/implementValInJava/implementAllInJava.test");
    }

    @TestMetadata("moveDeclarationToSeparateFile/moveClassToExistingFile/moveClassToExistingFile.test")
    public void testMoveDeclarationToSeparateFile_moveClassToExistingFile_MoveClassToExistingFile() throws Exception {
        runTest("testData/multiFileIntentions/moveDeclarationToSeparateFile/moveClassToExistingFile/moveClassToExistingFile.test");
    }

    @TestMetadata("moveDeclarationToSeparateFile/moveClassToFileInDefaultPackage/moveClassToFileInDefaultPackage.test")
    public void testMoveDeclarationToSeparateFile_moveClassToFileInDefaultPackage_MoveClassToFileInDefaultPackage() throws Exception {
        runTest("testData/multiFileIntentions/moveDeclarationToSeparateFile/moveClassToFileInDefaultPackage/moveClassToFileInDefaultPackage.test");
    }

    @TestMetadata("moveDeclarationToSeparateFile/moveClassToFile/moveClassToFile.test")
    public void testMoveDeclarationToSeparateFile_moveClassToFile_MoveClassToFile() throws Exception {
        runTest("testData/multiFileIntentions/moveDeclarationToSeparateFile/moveClassToFile/moveClassToFile.test");
    }

    @TestMetadata("moveDeclarationToSeparateFile/moveSingleToFile/moveSingleToFile.test")
    public void testMoveDeclarationToSeparateFile_moveSingleToFile_MoveSingleToFile() throws Exception {
        runTest("testData/multiFileIntentions/moveDeclarationToSeparateFile/moveSingleToFile/moveSingleToFile.test");
    }

    @TestMetadata("moveDeclarationToSeparateFile/optimizeImports/optimizeImports.test")
    public void testMoveDeclarationToSeparateFile_optimizeImports_OptimizeImports() throws Exception {
        runTest("testData/multiFileIntentions/moveDeclarationToSeparateFile/optimizeImports/optimizeImports.test");
    }

    @TestMetadata("moveMemberToTopLevel/function/function.test")
    public void testMoveMemberToTopLevel_function_Function() throws Exception {
        runTest("testData/multiFileIntentions/moveMemberToTopLevel/function/function.test");
    }

    @TestMetadata("moveOutOfCompanion/moveClass/moveClass.test")
    public void testMoveOutOfCompanion_moveClass_MoveClass() throws Exception {
        runTest("testData/multiFileIntentions/moveOutOfCompanion/moveClass/moveClass.test");
    }

    @TestMetadata("moveToCompanion/moveFunction/moveFunction.test")
    public void testMoveToCompanion_moveFunction_MoveFunction() throws Exception {
        runTest("testData/multiFileIntentions/moveToCompanion/moveFunction/moveFunction.test");
    }

    @TestMetadata("moveToCompanion/moveInnerClass/moveInnerClass.test")
    public void testMoveToCompanion_moveInnerClass_MoveInnerClass() throws Exception {
        runTest("testData/multiFileIntentions/moveToCompanion/moveInnerClass/moveInnerClass.test");
    }

    @TestMetadata("moveToCompanion/moveNonInnerClass/moveNonInnerClass.test")
    public void testMoveToCompanion_moveNonInnerClass_MoveNonInnerClass() throws Exception {
        runTest("testData/multiFileIntentions/moveToCompanion/moveNonInnerClass/moveNonInnerClass.test");
    }

    @TestMetadata("moveToCompanion/moveProperty/moveProperty.test")
    public void testMoveToCompanion_moveProperty_MoveProperty() throws Exception {
        runTest("testData/multiFileIntentions/moveToCompanion/moveProperty/moveProperty.test");
    }

    @TestMetadata("objectLiteralToLambda/objectLiteralToLambda.test")
    public void testObjectLiteralToLambda_ObjectLiteralToLambda() throws Exception {
        runTest("testData/multiFileIntentions/objectLiteralToLambda/objectLiteralToLambda.test");
    }

    @TestMetadata("specifyTypeExplicitly/specifyTypeExplicitly.test")
    public void testSpecifyTypeExplicitly_SpecifyTypeExplicitly() throws Exception {
        runTest("testData/multiFileIntentions/specifyTypeExplicitly/specifyTypeExplicitly.test");
    }
}
