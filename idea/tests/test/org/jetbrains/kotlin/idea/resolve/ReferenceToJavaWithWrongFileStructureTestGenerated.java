/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.resolve;

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
@TestMetadata("testData/resolve/referenceToJavaWithWrongFileStructure")
public class ReferenceToJavaWithWrongFileStructureTestGenerated extends AbstractReferenceToJavaWithWrongFileStructureTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("ClassStatics.kt")
    public void testClassStatics() throws Exception {
        runTest("testData/resolve/referenceToJavaWithWrongFileStructure/ClassStatics.kt");
    }

    @TestMetadata("SimpleClass.kt")
    public void testSimpleClass() throws Exception {
        runTest("testData/resolve/referenceToJavaWithWrongFileStructure/SimpleClass.kt");
    }
}
