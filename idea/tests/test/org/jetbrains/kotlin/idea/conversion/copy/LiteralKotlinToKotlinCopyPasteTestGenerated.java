/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.conversion.copy;

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
@TestMetadata("testData/copyPaste/literal")
public class LiteralKotlinToKotlinCopyPasteTestGenerated extends AbstractLiteralKotlinToKotlinCopyPasteTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("CollectionLiteralReference.kt")
    public void testCollectionLiteralReference() throws Exception {
        runTest("testData/copyPaste/literal/CollectionLiteralReference.kt");
    }

    @TestMetadata("DontEscapeEntries.kt")
    public void testDontEscapeEntries() throws Exception {
        runTest("testData/copyPaste/literal/DontEscapeEntries.kt");
    }

    @TestMetadata("DontEscapeEntries2.kt")
    public void testDontEscapeEntries2() throws Exception {
        runTest("testData/copyPaste/literal/DontEscapeEntries2.kt");
    }

    @TestMetadata("DontEscapeThis.kt")
    public void testDontEscapeThis() throws Exception {
        runTest("testData/copyPaste/literal/DontEscapeThis.kt");
    }

    @TestMetadata("DontUnescapeLiteralWIthCode.kt")
    public void testDontUnescapeLiteralWIthCode() throws Exception {
        runTest("testData/copyPaste/literal/DontUnescapeLiteralWIthCode.kt");
    }

    @TestMetadata("UnescapeFullSelection.kt")
    public void testUnescapeFullSelection() throws Exception {
        runTest("testData/copyPaste/literal/UnescapeFullSelection.kt");
    }
}
