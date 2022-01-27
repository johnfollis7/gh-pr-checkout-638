/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test;

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
@TestRoot("completion/tests")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/basic/withLib")
public class JvmWithLibBasicCompletionTestGenerated extends AbstractJvmWithLibBasicCompletionTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("NamedArgumentsJava.kt")
    public void testNamedArgumentsJava() throws Exception {
        runTest("testData/basic/withLib/NamedArgumentsJava.kt");
    }

    @TestMetadata("NamedArgumentsKotlin.kt")
    public void testNamedArgumentsKotlin() throws Exception {
        runTest("testData/basic/withLib/NamedArgumentsKotlin.kt");
    }

    @TestMetadata("SamAdapter.kt")
    public void testSamAdapter() throws Exception {
        runTest("testData/basic/withLib/SamAdapter.kt");
    }

    @TestMetadata("SamAdapterAndGenerics.kt")
    public void testSamAdapterAndGenerics() throws Exception {
        runTest("testData/basic/withLib/SamAdapterAndGenerics.kt");
    }

    @TestMetadata("TopLevelNonImportedExtFun.kt")
    public void testTopLevelNonImportedExtFun() throws Exception {
        runTest("testData/basic/withLib/TopLevelNonImportedExtFun.kt");
    }

    @TestMetadata("TopLevelNonImportedExtProp.kt")
    public void testTopLevelNonImportedExtProp() throws Exception {
        runTest("testData/basic/withLib/TopLevelNonImportedExtProp.kt");
    }

    @TestMetadata("TopLevelNonImportedFun.kt")
    public void testTopLevelNonImportedFun() throws Exception {
        runTest("testData/basic/withLib/TopLevelNonImportedFun.kt");
    }

    @TestMetadata("TopLevelNonImportedProperty.kt")
    public void testTopLevelNonImportedProperty() throws Exception {
        runTest("testData/basic/withLib/TopLevelNonImportedProperty.kt");
    }
}
