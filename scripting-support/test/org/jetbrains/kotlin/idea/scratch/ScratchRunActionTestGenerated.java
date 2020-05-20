/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.scratch;

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
@TestRoot("scripting-support")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ScratchRunActionTestGenerated extends AbstractScratchRunActionTest {
    @TestMetadata("testData/scratch")
    public static class ScratchCompiling extends AbstractScratchRunActionTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doScratchCompilingTest, this, testDataFilePath);
        }

        @TestMetadata("for.kts")
        public void testFor() throws Exception {
            runTest("testData/scratch/for.kts");
        }

        @TestMetadata("generics.kts")
        public void testGenerics() throws Exception {
            runTest("testData/scratch/generics.kts");
        }

        @TestMetadata("klass.kts")
        public void testKlass() throws Exception {
            runTest("testData/scratch/klass.kts");
        }

        @TestMetadata("libraryDepWithKotlinTest.kts")
        public void testLibraryDepWithKotlinTest() throws Exception {
            runTest("testData/scratch/libraryDepWithKotlinTest.kts");
        }

        @TestMetadata("simple.kts")
        public void testSimple() throws Exception {
            runTest("testData/scratch/simple.kts");
        }

        @TestMetadata("simpleFun.kts")
        public void testSimpleFun() throws Exception {
            runTest("testData/scratch/simpleFun.kts");
        }

        @TestMetadata("simpleNoRuntime.kts")
        public void testSimpleNoRuntime() throws Exception {
            runTest("testData/scratch/simpleNoRuntime.kts");
        }

        @TestMetadata("spacesAtLineStart.kts")
        public void testSpacesAtLineStart() throws Exception {
            runTest("testData/scratch/spacesAtLineStart.kts");
        }

        @TestMetadata("stdlibFun.kts")
        public void testStdlibFun() throws Exception {
            runTest("testData/scratch/stdlibFun.kts");
        }

        @TestMetadata("unresolved.kts")
        public void testUnresolved() throws Exception {
            runTest("testData/scratch/unresolved.kts");
        }

        @TestMetadata("unresolvedMultiline.kts")
        public void testUnresolvedMultiline() throws Exception {
            runTest("testData/scratch/unresolvedMultiline.kts");
        }

        @TestMetadata("userOutput.kts")
        public void testUserOutput() throws Exception {
            runTest("testData/scratch/userOutput.kts");
        }

        @TestMetadata("var.kts")
        public void testVar() throws Exception {
            runTest("testData/scratch/var.kts");
        }

        @TestMetadata("veryLongOutput.kts")
        public void testVeryLongOutput() throws Exception {
            runTest("testData/scratch/veryLongOutput.kts");
        }

        @TestMetadata("when.kts")
        public void testWhen() throws Exception {
            runTest("testData/scratch/when.kts");
        }
    }

    @TestMetadata("testData/scratch")
    public static class ScratchRepl extends AbstractScratchRunActionTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doScratchReplTest, this, testDataFilePath);
        }

        @TestMetadata("for.kts")
        public void testFor() throws Exception {
            runTest("testData/scratch/for.kts");
        }

        @TestMetadata("generics.kts")
        public void testGenerics() throws Exception {
            runTest("testData/scratch/generics.kts");
        }

        @TestMetadata("klass.kts")
        public void testKlass() throws Exception {
            runTest("testData/scratch/klass.kts");
        }

        @TestMetadata("libraryDepWithKotlinTest.kts")
        public void testLibraryDepWithKotlinTest() throws Exception {
            runTest("testData/scratch/libraryDepWithKotlinTest.kts");
        }

        @TestMetadata("simple.kts")
        public void testSimple() throws Exception {
            runTest("testData/scratch/simple.kts");
        }

        @TestMetadata("simpleFun.kts")
        public void testSimpleFun() throws Exception {
            runTest("testData/scratch/simpleFun.kts");
        }

        @TestMetadata("simpleNoRuntime.kts")
        public void testSimpleNoRuntime() throws Exception {
            runTest("testData/scratch/simpleNoRuntime.kts");
        }

        @TestMetadata("spacesAtLineStart.kts")
        public void testSpacesAtLineStart() throws Exception {
            runTest("testData/scratch/spacesAtLineStart.kts");
        }

        @TestMetadata("stdlibFun.kts")
        public void testStdlibFun() throws Exception {
            runTest("testData/scratch/stdlibFun.kts");
        }

        @TestMetadata("unresolved.kts")
        public void testUnresolved() throws Exception {
            runTest("testData/scratch/unresolved.kts");
        }

        @TestMetadata("unresolvedMultiline.kts")
        public void testUnresolvedMultiline() throws Exception {
            runTest("testData/scratch/unresolvedMultiline.kts");
        }

        @TestMetadata("userOutput.kts")
        public void testUserOutput() throws Exception {
            runTest("testData/scratch/userOutput.kts");
        }

        @TestMetadata("var.kts")
        public void testVar() throws Exception {
            runTest("testData/scratch/var.kts");
        }

        @TestMetadata("veryLongOutput.kts")
        public void testVeryLongOutput() throws Exception {
            runTest("testData/scratch/veryLongOutput.kts");
        }

        @TestMetadata("when.kts")
        public void testWhen() throws Exception {
            runTest("testData/scratch/when.kts");
        }
    }

    @TestMetadata("testData/scratch/multiFile")
    public static class ScratchMultiFile extends AbstractScratchRunActionTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doScratchMultiFileTest, this, testDataFilePath);
        }

        @TestMetadata("inlineFun")
        public void testInlineFun() throws Exception {
            runTest("testData/scratch/multiFile/inlineFun/");
        }

        @TestMetadata("javaDep")
        public void testJavaDep() throws Exception {
            runTest("testData/scratch/multiFile/javaDep/");
        }
    }

    @TestMetadata("testData/worksheet")
    public static class WorksheetCompiling extends AbstractScratchRunActionTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doWorksheetCompilingTest, this, testDataFilePath);
        }

        @TestMetadata("simpleScriptRuntime.ws.kts")
        public void testSimpleScriptRuntime() throws Exception {
            runTest("testData/worksheet/simpleScriptRuntime.ws.kts");
        }
    }

    @TestMetadata("testData/worksheet")
    public static class WorksheetRepl extends AbstractScratchRunActionTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doWorksheetReplTest, this, testDataFilePath);
        }

        @TestMetadata("simpleScriptRuntime.ws.kts")
        public void testSimpleScriptRuntime() throws Exception {
            runTest("testData/worksheet/simpleScriptRuntime.ws.kts");
        }
    }

    @TestMetadata("testData/worksheet/multiFile")
    public static class WorksheetMultiFile extends AbstractScratchRunActionTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doWorksheetMultiFileTest, this, testDataFilePath);
        }

        @TestMetadata("inlineFunScriptRuntime")
        public void testInlineFunScriptRuntime() throws Exception {
            runTest("testData/worksheet/multiFile/inlineFunScriptRuntime/");
        }

        @TestMetadata("javaDepScriptRuntime")
        public void testJavaDepScriptRuntime() throws Exception {
            runTest("testData/worksheet/multiFile/javaDepScriptRuntime/");
        }
    }

    @TestMetadata("testData/scratch/rightPanelOutput")
    public static class ScratchRightPanelOutput extends AbstractScratchRunActionTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doRightPreviewPanelOutputTest, this, testDataFilePath);
        }

        @TestMetadata("bigSequentialOutputs.kts")
        public void testBigSequentialOutputs() throws Exception {
            runTest("testData/scratch/rightPanelOutput/bigSequentialOutputs.kts");
        }

        @TestMetadata("shortExpression.longOutput.singleTop.kts")
        public void testShortExpression_longOutput_singleTop() throws Exception {
            runTest("testData/scratch/rightPanelOutput/shortExpression.longOutput.singleTop.kts");
        }

        @TestMetadata("shortExpression.shortOutput.singleTop.kts")
        public void testShortExpression_shortOutput_singleTop() throws Exception {
            runTest("testData/scratch/rightPanelOutput/shortExpression.shortOutput.singleTop.kts");
        }
    }
}
