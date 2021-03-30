/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.refactoring.inline;

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
@TestRoot("idea/tests")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/refactoring/inline/withFullJdk")
public class InlineTestWithSomeDescriptorsGenerated extends AbstractInlineTestWithSomeDescriptors {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("functionFromJdkWithoutSources.kt")
    public void testFunctionFromJdkWithoutSources() throws Exception {
        runTest("testData/refactoring/inline/withFullJdk/functionFromJdkWithoutSources.kt");
    }

    @TestMetadata("functionFromStdlib.kt")
    public void testFunctionFromStdlib() throws Exception {
        runTest("testData/refactoring/inline/withFullJdk/functionFromStdlib.kt");
    }

    @TestMetadata("functionFromStdlibWithoutSources.kt")
    public void testFunctionFromStdlibWithoutSources() throws Exception {
        runTest("testData/refactoring/inline/withFullJdk/functionFromStdlibWithoutSources.kt");
    }

    @TestMetadata("propertyFromStdlib.kt")
    public void testPropertyFromStdlib() throws Exception {
        runTest("testData/refactoring/inline/withFullJdk/propertyFromStdlib.kt");
    }

    @TestMetadata("propertyFromStdlibWithoutSources.kt")
    public void testPropertyFromStdlibWithoutSources() throws Exception {
        runTest("testData/refactoring/inline/withFullJdk/propertyFromStdlibWithoutSources.kt");
    }
}
