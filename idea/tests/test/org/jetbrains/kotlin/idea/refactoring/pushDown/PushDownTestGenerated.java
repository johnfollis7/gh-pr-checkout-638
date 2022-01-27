/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.refactoring.pushDown;

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
public abstract class PushDownTestGenerated extends AbstractPushDownTest {
    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/refactoring/pushDown/k2k")
    public static class K2K extends AbstractPushDownTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest, this, testDataFilePath);
        }

        @TestMetadata("accidentalOverrides.kt")
        public void testAccidentalOverrides() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/accidentalOverrides.kt");
        }

        @TestMetadata("clashingMembers.kt")
        public void testClashingMembers() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/clashingMembers.kt");
        }

        @TestMetadata("classToInterface.kt")
        public void testClassToInterface() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/classToInterface.kt");
        }

        @TestMetadata("conflictingSuperCall.kt")
        public void testConflictingSuperCall() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/conflictingSuperCall.kt");
        }

        @TestMetadata("dropVisibilityOnGeneratedOverride.kt")
        public void testDropVisibilityOnGeneratedOverride() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/dropVisibilityOnGeneratedOverride.kt");
        }

        @TestMetadata("finalClass.kt")
        public void testFinalClass() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/finalClass.kt");
        }

        @TestMetadata("implicitCompanionUsages.kt")
        public void testImplicitCompanionUsages() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/implicitCompanionUsages.kt");
        }

        @TestMetadata("liftPrivate.kt")
        public void testLiftPrivate() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/liftPrivate.kt");
        }

        @TestMetadata("noCaret.kt")
        public void testNoCaret() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/noCaret.kt");
        }

        @TestMetadata("objectDeclaration.kt")
        public void testObjectDeclaration() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/objectDeclaration.kt");
        }

        @TestMetadata("outsideOfClass.kt")
        public void testOutsideOfClass() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/outsideOfClass.kt");
        }

        @TestMetadata("pushClassMembers.kt")
        public void testPushClassMembers() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/pushClassMembers.kt");
        }

        @TestMetadata("pushClassMembersAndMakeAbstract.kt")
        public void testPushClassMembersAndMakeAbstract() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/pushClassMembersAndMakeAbstract.kt");
        }

        @TestMetadata("pushClassMembersWithGenerics.kt")
        public void testPushClassMembersWithGenerics() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/pushClassMembersWithGenerics.kt");
        }

        @TestMetadata("pushInterfaceMembers.kt")
        public void testPushInterfaceMembers() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/pushInterfaceMembers.kt");
        }

        @TestMetadata("pushInterfaceMembersAndMakeAbstract.kt")
        public void testPushInterfaceMembersAndMakeAbstract() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/pushInterfaceMembersAndMakeAbstract.kt");
        }

        @TestMetadata("pushMembersUsingPrivates.kt")
        public void testPushMembersUsingPrivates() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/pushMembersUsingPrivates.kt");
        }

        @TestMetadata("pushMembersWithExternalUsages.kt")
        public void testPushMembersWithExternalUsages() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/pushMembersWithExternalUsages.kt");
        }

        @TestMetadata("pushSuperInterfaces.kt")
        public void testPushSuperInterfaces() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/pushSuperInterfaces.kt");
        }

        @TestMetadata("pushSuperInterfacesWithGenerics.kt")
        public void testPushSuperInterfacesWithGenerics() throws Exception {
            runTest("testData/refactoring/pushDown/k2k/pushSuperInterfacesWithGenerics.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/refactoring/pushDown/k2j")
    public static class K2J extends AbstractPushDownTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doKotlinTest, this, testDataFilePath);
        }

        @TestMetadata("kotlinToJava.kt")
        public void testKotlinToJava() throws Exception {
            runTest("testData/refactoring/pushDown/k2j/kotlinToJava.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/refactoring/pushDown/j2k")
    public static class J2K extends AbstractPushDownTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doJavaTest, this, testDataFilePath);
        }

        @TestMetadata("fromClass.java")
        public void testFromClass() throws Exception {
            runTest("testData/refactoring/pushDown/j2k/fromClass.java");
        }

        @TestMetadata("fromClassAndMakeAbstract.java")
        public void testFromClassAndMakeAbstract() throws Exception {
            runTest("testData/refactoring/pushDown/j2k/fromClassAndMakeAbstract.java");
        }

        @TestMetadata("fromClassUsageConflicts.java")
        public void testFromClassUsageConflicts() throws Exception {
            runTest("testData/refactoring/pushDown/j2k/fromClassUsageConflicts.java");
        }

        @TestMetadata("fromInterface.java")
        public void testFromInterface() throws Exception {
            runTest("testData/refactoring/pushDown/j2k/fromInterface.java");
        }
    }
}
