/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight;

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
@TestMetadata("testData/multiFileInspections")
public class MultiFileInspectionTestGenerated extends AbstractMultiFileInspectionTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("fakeJvmFieldConstant/fakeJvmFieldConstant.test")
    public void testFakeJvmFieldConstant_FakeJvmFieldConstant() throws Exception {
        runTest("testData/multiFileInspections/fakeJvmFieldConstant/fakeJvmFieldConstant.test");
    }

    @TestMetadata("invalidBundleOrProperty/invalidBundleOrProperty.test")
    public void testInvalidBundleOrProperty_InvalidBundleOrProperty() throws Exception {
        runTest("testData/multiFileInspections/invalidBundleOrProperty/invalidBundleOrProperty.test");
    }

    @TestMetadata("kotlinInternalInJavaTest/kotlinInternalInJavaTest.test")
    public void testKotlinInternalInJavaTest_KotlinInternalInJavaTest() throws Exception {
        runTest("testData/multiFileInspections/kotlinInternalInJavaTest/kotlinInternalInJavaTest.test");
    }

    @TestMetadata("kotlinInternalInJava/kotlinInternalInJava.test")
    public void testKotlinInternalInJava_KotlinInternalInJava() throws Exception {
        runTest("testData/multiFileInspections/kotlinInternalInJava/kotlinInternalInJava.test");
    }

    @TestMetadata("kotlinSealedInJavaTest/kotlinSealedInJavaTest.test")
    public void testKotlinSealedInJavaTest_KotlinSealedInJavaTest() throws Exception {
        runTest("testData/multiFileInspections/kotlinSealedInJavaTest/kotlinSealedInJavaTest.test");
    }

    @TestMetadata("mainInTwoModules/mainInTwoModules.test")
    public void testMainInTwoModules_MainInTwoModules() throws Exception {
        runTest("testData/multiFileInspections/mainInTwoModules/mainInTwoModules.test");
    }

    @TestMetadata("mismatchedPackageDirectoryWithEmptyKts/mismatchedPackageDirectoryWithEmptyKts.test")
    public void testMismatchedPackageDirectoryWithEmptyKts_MismatchedPackageDirectoryWithEmptyKts() throws Exception {
        runTest("testData/multiFileInspections/mismatchedPackageDirectoryWithEmptyKts/mismatchedPackageDirectoryWithEmptyKts.test");
    }

    @TestMetadata("mismatchedProjectAndDirectoryRoot/mismatchedProjectAndDirectoryRoot.test")
    public void testMismatchedProjectAndDirectoryRoot_MismatchedProjectAndDirectoryRoot() throws Exception {
        runTest("testData/multiFileInspections/mismatchedProjectAndDirectoryRoot/mismatchedProjectAndDirectoryRoot.test");
    }

    @TestMetadata("mismatchedProjectAndDirectory/mismatchedProjectAndDirectory.test")
    public void testMismatchedProjectAndDirectory_MismatchedProjectAndDirectory() throws Exception {
        runTest("testData/multiFileInspections/mismatchedProjectAndDirectory/mismatchedProjectAndDirectory.test");
    }

    @TestMetadata("platformExtensionReceiverOfInline/platformExtensionReceiverOfInline.test")
    public void testPlatformExtensionReceiverOfInline_PlatformExtensionReceiverOfInline() throws Exception {
        runTest("testData/multiFileInspections/platformExtensionReceiverOfInline/platformExtensionReceiverOfInline.test");
    }
}
