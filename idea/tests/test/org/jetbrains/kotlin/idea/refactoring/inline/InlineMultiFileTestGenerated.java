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
@TestMetadata("testData/refactoring/inlineMultiFile")
public class InlineMultiFileTestGenerated extends AbstractInlineMultiFileTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("fromJavaToKotlin/complexJavaToKotlin2/complexJavaToKotlin2.test")
    public void testFromJavaToKotlin_complexJavaToKotlin2_ComplexJavaToKotlin2() throws Exception {
        runTest("testData/refactoring/inlineMultiFile/fromJavaToKotlin/complexJavaToKotlin2/complexJavaToKotlin2.test");
    }

    @TestMetadata("fromJavaToKotlin/complexJavaToKotlin/complexJavaToKotlin.test")
    public void testFromJavaToKotlin_complexJavaToKotlin_ComplexJavaToKotlin() throws Exception {
        runTest("testData/refactoring/inlineMultiFile/fromJavaToKotlin/complexJavaToKotlin/complexJavaToKotlin.test");
    }

    @TestMetadata("fromJavaToKotlin/delegateToCallChain/delegateToCallChain.test")
    public void testFromJavaToKotlin_delegateToCallChain_DelegateToCallChain() throws Exception {
        runTest("testData/refactoring/inlineMultiFile/fromJavaToKotlin/delegateToCallChain/delegateToCallChain.test");
    }

    @TestMetadata("fromJavaToKotlin/inheritance/inheritance.test")
    public void testFromJavaToKotlin_inheritance_Inheritance() throws Exception {
        runTest("testData/refactoring/inlineMultiFile/fromJavaToKotlin/inheritance/inheritance.test");
    }
}
