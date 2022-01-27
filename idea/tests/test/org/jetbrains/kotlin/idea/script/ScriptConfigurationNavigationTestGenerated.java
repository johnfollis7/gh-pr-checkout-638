/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.script;

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
@TestMetadata("testData/script/definition/navigation")
public class ScriptConfigurationNavigationTestGenerated extends AbstractScriptConfigurationNavigationTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("buildSrcProblem")
    public void testBuildSrcProblem() throws Exception {
        runTest("testData/script/definition/navigation/buildSrcProblem/");
    }

    @TestMetadata("conflictingModule")
    public void testConflictingModule() throws Exception {
        runTest("testData/script/definition/navigation/conflictingModule/");
    }

    @TestMetadata("customBaseClass")
    public void testCustomBaseClass() throws Exception {
        runTest("testData/script/definition/navigation/customBaseClass/");
    }

    @TestMetadata("includedPluginProblem")
    public void testIncludedPluginProblem() throws Exception {
        runTest("testData/script/definition/navigation/includedPluginProblem/");
    }

    @TestMetadata("javaLib")
    public void testJavaLib() throws Exception {
        runTest("testData/script/definition/navigation/javaLib/");
    }

    @TestMetadata("javaLibWithSources")
    public void testJavaLibWithSources() throws Exception {
        runTest("testData/script/definition/navigation/javaLibWithSources/");
    }

    @TestMetadata("kotlinLib")
    public void testKotlinLib() throws Exception {
        runTest("testData/script/definition/navigation/kotlinLib/");
    }

    @TestMetadata("kotlinLibWithSources")
    public void testKotlinLibWithSources() throws Exception {
        runTest("testData/script/definition/navigation/kotlinLibWithSources/");
    }

    @TestMetadata("stdlib")
    public void testStdlib() throws Exception {
        runTest("testData/script/definition/navigation/stdlib/");
    }

    @TestMetadata("stdlibWithSources")
    public void testStdlibWithSources() throws Exception {
        runTest("testData/script/definition/navigation/stdlibWithSources/");
    }
}
