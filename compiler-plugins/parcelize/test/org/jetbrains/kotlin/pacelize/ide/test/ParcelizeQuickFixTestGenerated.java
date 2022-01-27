/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.pacelize.ide.test;

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
@TestRoot("compiler-plugins/parcelize")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/quickfix")
public abstract class ParcelizeQuickFixTestGenerated extends AbstractParcelizeQuickFixTest {
    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/quickfix/addPrimaryConstructor")
    public static class AddPrimaryConstructor extends AbstractParcelizeQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("constructorWithDelegate.kt")
        public void testConstructorWithDelegate() throws Exception {
            runTest("testData/quickfix/addPrimaryConstructor/constructorWithDelegate.kt");
        }

        @TestMetadata("noQuickFix.kt")
        public void testNoQuickFix() throws Exception {
            runTest("testData/quickfix/addPrimaryConstructor/noQuickFix.kt");
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("testData/quickfix/addPrimaryConstructor/simple.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/quickfix/cantBeInnerClass")
    public static class CantBeInnerClass extends AbstractParcelizeQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("testData/quickfix/cantBeInnerClass/simple.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/quickfix/classShouldBeAnnotated")
    public static class ClassShouldBeAnnotated extends AbstractParcelizeQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("testData/quickfix/classShouldBeAnnotated/simple.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/quickfix/deleteIncompatible")
    public static class DeleteIncompatible extends AbstractParcelizeQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("creatorField.kt")
        public void testCreatorField() throws Exception {
            runTest("testData/quickfix/deleteIncompatible/creatorField.kt");
        }

        @TestMetadata("writeToParcel.kt")
        public void testWriteToParcel() throws Exception {
            runTest("testData/quickfix/deleteIncompatible/writeToParcel.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/quickfix/migrations")
    public static class Migrations extends AbstractParcelizeQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("basic.kt")
        public void testBasic() throws Exception {
            runTest("testData/quickfix/migrations/basic.kt");
        }

        @TestMetadata("complexCase1.kt")
        public void testComplexCase1() throws Exception {
            runTest("testData/quickfix/migrations/complexCase1.kt");
        }

        @TestMetadata("customDescribeContents.kt")
        public void testCustomDescribeContents() throws Exception {
            runTest("testData/quickfix/migrations/customDescribeContents.kt");
        }

        @TestMetadata("fromCreatorObject.kt")
        public void testFromCreatorObject() throws Exception {
            runTest("testData/quickfix/migrations/fromCreatorObject.kt");
        }

        @TestMetadata("innerClassFactory.kt")
        public void testInnerClassFactory() throws Exception {
            runTest("testData/quickfix/migrations/innerClassFactory.kt");
        }

        @TestMetadata("jvmField.kt")
        public void testJvmField() throws Exception {
            runTest("testData/quickfix/migrations/jvmField.kt");
        }

        @TestMetadata("withoutDescribeContents.kt")
        public void testWithoutDescribeContents() throws Exception {
            runTest("testData/quickfix/migrations/withoutDescribeContents.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/quickfix/noParcelableSupertype")
    public static class NoParcelableSupertype extends AbstractParcelizeQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("alreadyHasSupertype.kt")
        public void testAlreadyHasSupertype() throws Exception {
            runTest("testData/quickfix/noParcelableSupertype/alreadyHasSupertype.kt");
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("testData/quickfix/noParcelableSupertype/simple.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/quickfix/propertyWontBeSerialized")
    public static class PropertyWontBeSerialized extends AbstractParcelizeQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("testData/quickfix/propertyWontBeSerialized/simple.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/quickfix/removeDuplicatingTypeParcelerAnnotation")
    public static class RemoveDuplicatingTypeParcelerAnnotation extends AbstractParcelizeQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("testData/quickfix/removeDuplicatingTypeParcelerAnnotation/simple.kt");
        }
    }
}
