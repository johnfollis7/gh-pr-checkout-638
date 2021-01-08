/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.projectWizard.wizard;

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
@TestRoot("project-wizard/idea")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public abstract class ProjectTemplateNewWizardProjectImportTestGenerated extends AbstractProjectTemplateNewWizardProjectImportTest {
    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../cli/testData/projectTemplatesBuildFileGeneration")
    public static class GradleKts extends AbstractProjectTemplateNewWizardProjectImportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestGradleKts, this, testDataFilePath);
        }

        @TestMetadata("backendApplication")
        public void testBackendApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/backendApplication/");
        }

        @TestMetadata("composeDesktopApplication")
        public void testComposeDesktopApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/composeDesktopApplication/");
        }

        @TestMetadata("composeMultiplatformApplication")
        public void testComposeMultiplatformApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/composeMultiplatformApplication/");
        }

        @TestMetadata("consoleApplication")
        public void testConsoleApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/consoleApplication/");
        }

        @TestMetadata("frontendApplication")
        public void testFrontendApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/frontendApplication/");
        }

        @TestMetadata("fullStackWebApplication")
        public void testFullStackWebApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/fullStackWebApplication/");
        }

        @TestMetadata("multiplatformApplication")
        public void testMultiplatformApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/multiplatformApplication/");
        }

        @TestMetadata("multiplatformLibrary")
        public void testMultiplatformLibrary() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/multiplatformLibrary/");
        }

        @TestMetadata("multiplatformMobileApplication")
        public void testMultiplatformMobileApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/multiplatformMobileApplication/");
        }

        @TestMetadata("multiplatformMobileLibrary")
        public void testMultiplatformMobileLibrary() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/multiplatformMobileLibrary/");
        }

        @TestMetadata("nativeApplication")
        public void testNativeApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/nativeApplication/");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../cli/testData/projectTemplatesBuildFileGeneration")
    public static class GradleGroovy extends AbstractProjectTemplateNewWizardProjectImportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestGradleGroovy, this, testDataFilePath);
        }

        @TestMetadata("backendApplication")
        public void testBackendApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/backendApplication/");
        }

        @TestMetadata("composeDesktopApplication")
        public void testComposeDesktopApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/composeDesktopApplication/");
        }

        @TestMetadata("composeMultiplatformApplication")
        public void testComposeMultiplatformApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/composeMultiplatformApplication/");
        }

        @TestMetadata("consoleApplication")
        public void testConsoleApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/consoleApplication/");
        }

        @TestMetadata("frontendApplication")
        public void testFrontendApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/frontendApplication/");
        }

        @TestMetadata("fullStackWebApplication")
        public void testFullStackWebApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/fullStackWebApplication/");
        }

        @TestMetadata("multiplatformApplication")
        public void testMultiplatformApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/multiplatformApplication/");
        }

        @TestMetadata("multiplatformLibrary")
        public void testMultiplatformLibrary() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/multiplatformLibrary/");
        }

        @TestMetadata("multiplatformMobileApplication")
        public void testMultiplatformMobileApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/multiplatformMobileApplication/");
        }

        @TestMetadata("multiplatformMobileLibrary")
        public void testMultiplatformMobileLibrary() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/multiplatformMobileLibrary/");
        }

        @TestMetadata("nativeApplication")
        public void testNativeApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/nativeApplication/");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../cli/testData/projectTemplatesBuildFileGeneration")
    public static class Maven extends AbstractProjectTemplateNewWizardProjectImportTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestMaven, this, testDataFilePath);
        }

        @TestMetadata("backendApplication")
        public void testBackendApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/backendApplication/");
        }

        @TestMetadata("composeDesktopApplication")
        public void testComposeDesktopApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/composeDesktopApplication/");
        }

        @TestMetadata("composeMultiplatformApplication")
        public void testComposeMultiplatformApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/composeMultiplatformApplication/");
        }

        @TestMetadata("consoleApplication")
        public void testConsoleApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/consoleApplication/");
        }

        @TestMetadata("frontendApplication")
        public void testFrontendApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/frontendApplication/");
        }

        @TestMetadata("fullStackWebApplication")
        public void testFullStackWebApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/fullStackWebApplication/");
        }

        @TestMetadata("multiplatformApplication")
        public void testMultiplatformApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/multiplatformApplication/");
        }

        @TestMetadata("multiplatformLibrary")
        public void testMultiplatformLibrary() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/multiplatformLibrary/");
        }

        @TestMetadata("multiplatformMobileApplication")
        public void testMultiplatformMobileApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/multiplatformMobileApplication/");
        }

        @TestMetadata("multiplatformMobileLibrary")
        public void testMultiplatformMobileLibrary() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/multiplatformMobileLibrary/");
        }

        @TestMetadata("nativeApplication")
        public void testNativeApplication() throws Exception {
            runTest("../cli/testData/projectTemplatesBuildFileGeneration/nativeApplication/");
        }
    }
}
