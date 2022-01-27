/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.debugger.test;

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
@TestRoot("jvm-debugger/test")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/smartStepInto")
public class SmartStepIntoTestGenerated extends AbstractSmartStepIntoTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("annotation.kt")
    public void testAnnotation() throws Exception {
        runTest("testData/smartStepInto/annotation.kt");
    }

    @TestMetadata("arrayAccess.kt")
    public void testArrayAccess() throws Exception {
        runTest("testData/smartStepInto/arrayAccess.kt");
    }

    @TestMetadata("callChain.kt")
    public void testCallChain() throws Exception {
        runTest("testData/smartStepInto/callChain.kt");
    }

    @TestMetadata("constructor.kt")
    public void testConstructor() throws Exception {
        runTest("testData/smartStepInto/constructor.kt");
    }

    @TestMetadata("conventionMethod.kt")
    public void testConventionMethod() throws Exception {
        runTest("testData/smartStepInto/conventionMethod.kt");
    }

    @TestMetadata("delegatedPropertyGetter.kt")
    public void testDelegatedPropertyGetter() throws Exception {
        runTest("testData/smartStepInto/delegatedPropertyGetter.kt");
    }

    @TestMetadata("doWhile.kt")
    public void testDoWhile() throws Exception {
        runTest("testData/smartStepInto/doWhile.kt");
    }

    @TestMetadata("dotQualified.kt")
    public void testDotQualified() throws Exception {
        runTest("testData/smartStepInto/dotQualified.kt");
    }

    @TestMetadata("dotQualifiedInParam.kt")
    public void testDotQualifiedInParam() throws Exception {
        runTest("testData/smartStepInto/dotQualifiedInParam.kt");
    }

    @TestMetadata("empty.kt")
    public void testEmpty() throws Exception {
        runTest("testData/smartStepInto/empty.kt");
    }

    @TestMetadata("for.kt")
    public void testFor() throws Exception {
        runTest("testData/smartStepInto/for.kt");
    }

    @TestMetadata("funLiteral.kt")
    public void testFunLiteral() throws Exception {
        runTest("testData/smartStepInto/funLiteral.kt");
    }

    @TestMetadata("funWithExpressionBody.kt")
    public void testFunWithExpressionBody() throws Exception {
        runTest("testData/smartStepInto/funWithExpressionBody.kt");
    }

    @TestMetadata("if.kt")
    public void testIf() throws Exception {
        runTest("testData/smartStepInto/if.kt");
    }

    @TestMetadata("infixCall.kt")
    public void testInfixCall() throws Exception {
        runTest("testData/smartStepInto/infixCall.kt");
    }

    @TestMetadata("inlineOnly.kt")
    public void testInlineOnly() throws Exception {
        runTest("testData/smartStepInto/inlineOnly.kt");
    }

    @TestMetadata("inlinedFunLiteral.kt")
    public void testInlinedFunLiteral() throws Exception {
        runTest("testData/smartStepInto/inlinedFunLiteral.kt");
    }

    @TestMetadata("inlinedFunctionalExpression.kt")
    public void testInlinedFunctionalExpression() throws Exception {
        runTest("testData/smartStepInto/inlinedFunctionalExpression.kt");
    }

    @TestMetadata("invoke.kt")
    public void testInvoke() throws Exception {
        runTest("testData/smartStepInto/invoke.kt");
    }

    @TestMetadata("libraryFun.kt")
    public void testLibraryFun() throws Exception {
        runTest("testData/smartStepInto/libraryFun.kt");
    }

    @TestMetadata("multiline.kt")
    public void testMultiline() throws Exception {
        runTest("testData/smartStepInto/multiline.kt");
    }

    @TestMetadata("multilineCallChain.kt")
    public void testMultilineCallChain() throws Exception {
        runTest("testData/smartStepInto/multilineCallChain.kt");
    }

    @TestMetadata("object.kt")
    public void testObject() throws Exception {
        runTest("testData/smartStepInto/object.kt");
    }

    @TestMetadata("param.kt")
    public void testParam() throws Exception {
        runTest("testData/smartStepInto/param.kt");
    }

    @TestMetadata("parantesized.kt")
    public void testParantesized() throws Exception {
        runTest("testData/smartStepInto/parantesized.kt");
    }

    @TestMetadata("propertyGetter.kt")
    public void testPropertyGetter() throws Exception {
        runTest("testData/smartStepInto/propertyGetter.kt");
    }

    @TestMetadata("renderer.kt")
    public void testRenderer() throws Exception {
        runTest("testData/smartStepInto/renderer.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("testData/smartStepInto/simple.kt");
    }

    @TestMetadata("stringTemplate.kt")
    public void testStringTemplate() throws Exception {
        runTest("testData/smartStepInto/stringTemplate.kt");
    }

    @TestMetadata("unary.kt")
    public void testUnary() throws Exception {
        runTest("testData/smartStepInto/unary.kt");
    }

    @TestMetadata("when.kt")
    public void testWhen() throws Exception {
        runTest("testData/smartStepInto/when.kt");
    }

    @TestMetadata("while.kt")
    public void testWhile() throws Exception {
        runTest("testData/smartStepInto/while.kt");
    }
}
