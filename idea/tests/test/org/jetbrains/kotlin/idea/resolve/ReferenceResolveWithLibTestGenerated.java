/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.resolve;

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
@TestMetadata("testData/resolve/referenceWithLib")
public class ReferenceResolveWithLibTestGenerated extends AbstractReferenceResolveWithLibTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("delegatedPropertyWithTypeParameters.kt")
    public void testDelegatedPropertyWithTypeParameters() throws Exception {
        runTest("testData/resolve/referenceWithLib/delegatedPropertyWithTypeParameters.kt");
    }

    @TestMetadata("fakeOverride.kt")
    public void testFakeOverride() throws Exception {
        runTest("testData/resolve/referenceWithLib/fakeOverride.kt");
    }

    @TestMetadata("fakeOverride2.kt")
    public void testFakeOverride2() throws Exception {
        runTest("testData/resolve/referenceWithLib/fakeOverride2.kt");
    }

    @TestMetadata("infinityAndNanInJavaAnnotation.kt")
    public void testInfinityAndNanInJavaAnnotation() throws Exception {
        runTest("testData/resolve/referenceWithLib/infinityAndNanInJavaAnnotation.kt");
    }

    @TestMetadata("innerClassFromLib.kt")
    public void testInnerClassFromLib() throws Exception {
        runTest("testData/resolve/referenceWithLib/innerClassFromLib.kt");
    }

    @TestMetadata("iteratorWithTypeParameter.kt")
    public void testIteratorWithTypeParameter() throws Exception {
        runTest("testData/resolve/referenceWithLib/iteratorWithTypeParameter.kt");
    }

    @TestMetadata("multiDeclarationWithTypeParameters.kt")
    public void testMultiDeclarationWithTypeParameters() throws Exception {
        runTest("testData/resolve/referenceWithLib/multiDeclarationWithTypeParameters.kt");
    }

    @TestMetadata("nestedClassFromLib.kt")
    public void testNestedClassFromLib() throws Exception {
        runTest("testData/resolve/referenceWithLib/nestedClassFromLib.kt");
    }

    @TestMetadata("overloadFun.kt")
    public void testOverloadFun() throws Exception {
        runTest("testData/resolve/referenceWithLib/overloadFun.kt");
    }

    @TestMetadata("overridingFunctionWithSamAdapter.kt")
    public void testOverridingFunctionWithSamAdapter() throws Exception {
        runTest("testData/resolve/referenceWithLib/overridingFunctionWithSamAdapter.kt");
    }

    @TestMetadata("packageOfLibDeclaration.kt")
    public void testPackageOfLibDeclaration() throws Exception {
        runTest("testData/resolve/referenceWithLib/packageOfLibDeclaration.kt");
    }

    @TestMetadata("referenceToRootJavaClassFromLib.kt")
    public void testReferenceToRootJavaClassFromLib() throws Exception {
        runTest("testData/resolve/referenceWithLib/referenceToRootJavaClassFromLib.kt");
    }

    @TestMetadata("sameNameInLib.kt")
    public void testSameNameInLib() throws Exception {
        runTest("testData/resolve/referenceWithLib/sameNameInLib.kt");
    }

    @TestMetadata("setWithTypeParameters.kt")
    public void testSetWithTypeParameters() throws Exception {
        runTest("testData/resolve/referenceWithLib/setWithTypeParameters.kt");
    }
}
