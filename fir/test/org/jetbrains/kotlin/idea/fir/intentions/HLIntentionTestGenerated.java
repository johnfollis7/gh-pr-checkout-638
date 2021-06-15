/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.intentions;

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
@TestRoot("fir")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public abstract class HLIntentionTestGenerated extends AbstractHLIntentionTest {
    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../idea/tests/testData/intentions/addPropertyAccessors")
    public abstract static class AddPropertyAccessors extends AbstractHLIntentionTest {
        @RunWith(JUnit3RunnerWithInners.class)
        @TestMetadata("../idea/tests/testData/intentions/addPropertyAccessors/both")
        public static class Both extends AbstractHLIntentionTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            @TestMetadata("abstract.kt")
            public void testAbstract() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/both/abstract.kt");
            }

            @TestMetadata("caretNotOnName.kt")
            public void testCaretNotOnName() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/both/caretNotOnName.kt");
            }

            @TestMetadata("delegate.kt")
            public void testDelegate() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/both/delegate.kt");
            }

            @TestMetadata("expect.kt")
            public void testExpect() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/both/expect.kt");
            }

            @TestMetadata("hasAccessor.kt")
            public void testHasAccessor() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/both/hasAccessor.kt");
            }

            @TestMetadata("hasGetter.kt")
            public void testHasGetter() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/both/hasGetter.kt");
            }

            @TestMetadata("hasSetter.kt")
            public void testHasSetter() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/both/hasSetter.kt");
            }

            @TestMetadata("jvmField.kt")
            public void testJvmField() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/both/jvmField.kt");
            }

            @TestMetadata("lateinit.kt")
            public void testLateinit() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/both/lateinit.kt");
            }

            @TestMetadata("local.kt")
            public void testLocal() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/both/local.kt");
            }

            @TestMetadata("noType.kt")
            public void testNoType() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/both/noType.kt");
            }

            @TestMetadata("top.kt")
            public void testTop() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/both/top.kt");
            }

            @TestMetadata("val.kt")
            public void testVal() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/both/val.kt");
            }

            @TestMetadata("var.kt")
            public void testVar() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/both/var.kt");
            }
        }

        @RunWith(JUnit3RunnerWithInners.class)
        @TestMetadata("../idea/tests/testData/intentions/addPropertyAccessors/getter")
        public static class Getter extends AbstractHLIntentionTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            @TestMetadata("abstract.kt")
            public void testAbstract() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/getter/abstract.kt");
            }

            @TestMetadata("caretNotOnName.kt")
            public void testCaretNotOnName() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/getter/caretNotOnName.kt");
            }

            @TestMetadata("const.kt")
            public void testConst() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/getter/const.kt");
            }

            @TestMetadata("delegate.kt")
            public void testDelegate() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/getter/delegate.kt");
            }

            @TestMetadata("expect.kt")
            public void testExpect() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/getter/expect.kt");
            }

            @TestMetadata("hasAccessor.kt")
            public void testHasAccessor() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/getter/hasAccessor.kt");
            }

            @TestMetadata("hasGetter.kt")
            public void testHasGetter() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/getter/hasGetter.kt");
            }

            @TestMetadata("hasSetter.kt")
            public void testHasSetter() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/getter/hasSetter.kt");
            }

            @TestMetadata("jvmField.kt")
            public void testJvmField() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/getter/jvmField.kt");
            }

            @TestMetadata("lateinit.kt")
            public void testLateinit() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/getter/lateinit.kt");
            }

            @TestMetadata("local.kt")
            public void testLocal() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/getter/local.kt");
            }

            @TestMetadata("noType.kt")
            public void testNoType() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/getter/noType.kt");
            }

            @TestMetadata("top.kt")
            public void testTop() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/getter/top.kt");
            }

            @TestMetadata("val.kt")
            public void testVal() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/getter/val.kt");
            }

            @TestMetadata("var.kt")
            public void testVar() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/getter/var.kt");
            }
        }

        @RunWith(JUnit3RunnerWithInners.class)
        @TestMetadata("../idea/tests/testData/intentions/addPropertyAccessors/setter")
        public static class Setter extends AbstractHLIntentionTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            @TestMetadata("abstract.kt")
            public void testAbstract() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/setter/abstract.kt");
            }

            @TestMetadata("caretNotOnName.kt")
            public void testCaretNotOnName() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/setter/caretNotOnName.kt");
            }

            @TestMetadata("delegate.kt")
            public void testDelegate() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/setter/delegate.kt");
            }

            @TestMetadata("expect.kt")
            public void testExpect() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/setter/expect.kt");
            }

            @TestMetadata("hasAccessor.kt")
            public void testHasAccessor() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/setter/hasAccessor.kt");
            }

            @TestMetadata("hasGetter.kt")
            public void testHasGetter() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/setter/hasGetter.kt");
            }

            @TestMetadata("hasSetter.kt")
            public void testHasSetter() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/setter/hasSetter.kt");
            }

            @TestMetadata("jvmField.kt")
            public void testJvmField() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/setter/jvmField.kt");
            }

            @TestMetadata("lateinit.kt")
            public void testLateinit() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/setter/lateinit.kt");
            }

            @TestMetadata("local.kt")
            public void testLocal() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/setter/local.kt");
            }

            @TestMetadata("noType.kt")
            public void testNoType() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/setter/noType.kt");
            }

            @TestMetadata("top.kt")
            public void testTop() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/setter/top.kt");
            }

            @TestMetadata("val.kt")
            public void testVal() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/setter/val.kt");
            }

            @TestMetadata("var.kt")
            public void testVar() throws Exception {
                runTest("../idea/tests/testData/intentions/addPropertyAccessors/setter/var.kt");
            }
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("../idea/tests/testData/intentions/specifyTypeExplicitly")
    public static class SpecifyTypeExplicitly extends AbstractHLIntentionTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("anonymousObject.kt")
        public void testAnonymousObject() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/anonymousObject.kt");
        }

        @TestMetadata("backticked.kt")
        public void testBackticked() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/backticked.kt");
        }

        @TestMetadata("badCaretPosition.kt")
        public void testBadCaretPosition() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/badCaretPosition.kt");
        }

        @TestMetadata("classNameClashing.kt")
        public void testClassNameClashing() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/classNameClashing.kt");
        }

        @TestMetadata("constructor.kt")
        public void testConstructor() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/constructor.kt");
        }

        @TestMetadata("destructuringInLambda.kt")
        public void testDestructuringInLambda() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/destructuringInLambda.kt");
        }

        @TestMetadata("enumType.kt")
        public void testEnumType() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/enumType.kt");
        }

        @TestMetadata("forAsExpression.kt")
        public void testForAsExpression() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/forAsExpression.kt");
        }

        @TestMetadata("functionType.kt")
        public void testFunctionType() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/functionType.kt");
        }

        @TestMetadata("genericClass.kt")
        public void testGenericClass() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/genericClass.kt");
        }

        @TestMetadata("genericClassWithTypeParameters.kt")
        public void testGenericClassWithTypeParameters() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/genericClassWithTypeParameters.kt");
        }

        @TestMetadata("genericClassWithTypeParameters2.kt")
        public void testGenericClassWithTypeParameters2() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/genericClassWithTypeParameters2.kt");
        }

        @TestMetadata("genericFunction.kt")
        public void testGenericFunction() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/genericFunction.kt");
        }

        @TestMetadata("innerTypeParameter.kt")
        public void testInnerTypeParameter() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/innerTypeParameter.kt");
        }

        @TestMetadata("innerTypeParameter2.kt")
        public void testInnerTypeParameter2() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/innerTypeParameter2.kt");
        }

        @TestMetadata("lambdaParam.kt")
        public void testLambdaParam() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/lambdaParam.kt");
        }

        @TestMetadata("localClass.kt")
        public void testLocalClass() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/localClass.kt");
        }

        @TestMetadata("localClassInSecondTypeParameter.kt")
        public void testLocalClassInSecondTypeParameter() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/localClassInSecondTypeParameter.kt");
        }

        @TestMetadata("localClassInSecondTypeParameter2.kt")
        public void testLocalClassInSecondTypeParameter2() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/localClassInSecondTypeParameter2.kt");
        }

        @TestMetadata("localClassInSecondTypeParameter3.kt")
        public void testLocalClassInSecondTypeParameter3() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/localClassInSecondTypeParameter3.kt");
        }

        @TestMetadata("localClassInTypeParameter.kt")
        public void testLocalClassInTypeParameter() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/localClassInTypeParameter.kt");
        }

        @TestMetadata("loopParameter.kt")
        public void testLoopParameter() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/loopParameter.kt");
        }

        @TestMetadata("outClass.kt")
        public void testOutClass() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/outClass.kt");
        }

        @TestMetadata("outClass2.kt")
        public void testOutClass2() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/outClass2.kt");
        }

        @TestMetadata("outClass3.kt")
        public void testOutClass3() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/outClass3.kt");
        }

        @TestMetadata("overriddenAsNull.kt")
        public void testOverriddenAsNull() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/overriddenAsNull.kt");
        }

        @TestMetadata("overrideNotNullFunction.kt")
        public void testOverrideNotNullFunction() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/overrideNotNullFunction.kt");
        }

        @TestMetadata("overrideNotNullProperty.kt")
        public void testOverrideNotNullProperty() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/overrideNotNullProperty.kt");
        }

        @TestMetadata("overrideNullableFunction.kt")
        public void testOverrideNullableFunction() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/overrideNullableFunction.kt");
        }

        @TestMetadata("overrideNullableProperty.kt")
        public void testOverrideNullableProperty() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/overrideNullableProperty.kt");
        }

        @TestMetadata("propertyTypeFromGetter.kt")
        public void testPropertyTypeFromGetter() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/propertyTypeFromGetter.kt");
        }

        @TestMetadata("publicMember.kt")
        public void testPublicMember() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/publicMember.kt");
        }

        @TestMetadata("stringRedefined.kt")
        public void testStringRedefined() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/stringRedefined.kt");
        }

        @TestMetadata("typeAlreadyProvided.kt")
        public void testTypeAlreadyProvided() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/typeAlreadyProvided.kt");
        }

        @TestMetadata("unitType.kt")
        public void testUnitType() throws Exception {
            runTest("../idea/tests/testData/intentions/specifyTypeExplicitly/unitType.kt");
        }
    }

    @TestMetadata("idea/testData/intentions/importAllMembers")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ImportAllMembers extends AbstractHLIntentionTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInImportAllMembers() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/intentions/importAllMembers"), Pattern.compile("^([\\w\\-_]+)\\.(kt|kts)$"), null, true);
        }

        @TestMetadata("AlreadyImported.kt")
        public void testAlreadyImported() throws Exception {
            runTest("idea/testData/intentions/importAllMembers/AlreadyImported.kt");
        }

        @TestMetadata("AlreadyImportedWithStar.kt")
        public void testAlreadyImportedWithStar() throws Exception {
            runTest("idea/testData/intentions/importAllMembers/AlreadyImportedWithStar.kt");
        }

        @TestMetadata("AmbiguousCalls.kt")
        public void testAmbiguousCalls() throws Exception {
            runTest("idea/testData/intentions/importAllMembers/AmbiguousCalls.kt");
        }

        @TestMetadata("EnumMembers.kt")
        public void testEnumMembers() throws Exception {
            runTest("idea/testData/intentions/importAllMembers/EnumMembers.kt");
        }

        @TestMetadata("ImportAllMembersInImport.kt")
        public void testImportAllMembersInImport() throws Exception {
            runTest("idea/testData/intentions/importAllMembers/ImportAllMembersInImport.kt");
        }

        @TestMetadata("NotFromCompanionObject.kt")
        public void testNotFromCompanionObject() throws Exception {
            runTest("idea/testData/intentions/importAllMembers/NotFromCompanionObject.kt");
        }

        @TestMetadata("NotFromObject.kt")
        public void testNotFromObject() throws Exception {
            runTest("idea/testData/intentions/importAllMembers/NotFromObject.kt");
        }

        @TestMetadata("QualifiedName.kt")
        public void testQualifiedName() throws Exception {
            runTest("idea/testData/intentions/importAllMembers/QualifiedName.kt");
        }

        @TestMetadata("QualifiedName2.kt")
        public void testQualifiedName2() throws Exception {
            runTest("idea/testData/intentions/importAllMembers/QualifiedName2.kt");
        }

        @TestMetadata("RemoveSingleImports.kt")
        public void testRemoveSingleImports() throws Exception {
            runTest("idea/testData/intentions/importAllMembers/RemoveSingleImports.kt");
        }

        @TestMetadata("StaticJavaMembers.kt")
        public void testStaticJavaMembers() throws Exception {
            runTest("idea/testData/intentions/importAllMembers/StaticJavaMembers.kt");
        }

        @TestMetadata("TypeReference.kt")
        public void testTypeReference() throws Exception {
            runTest("idea/testData/intentions/importAllMembers/TypeReference.kt");
        }

        @TestMetadata("TypeReference2.kt")
        public void testTypeReference2() throws Exception {
            runTest("idea/testData/intentions/importAllMembers/TypeReference2.kt");
        }

        @TestMetadata("UnresolvedMember.kt")
        public void testUnresolvedMember() throws Exception {
            runTest("idea/testData/intentions/importAllMembers/UnresolvedMember.kt");
        }
    }

    @TestMetadata("idea/testData/intentions/importMember")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ImportMember extends AbstractHLIntentionTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInImportMember() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/intentions/importMember"), Pattern.compile("^([\\w\\-_]+)\\.(kt|kts)$"), null, true);
        }

        @TestMetadata("AlreadyImportedSameNameClass.kt")
        public void testAlreadyImportedSameNameClass() throws Exception {
            runTest("idea/testData/intentions/importMember/AlreadyImportedSameNameClass.kt");
        }

        @TestMetadata("AlreadyImportedSameNameClass2.kt")
        public void testAlreadyImportedSameNameClass2() throws Exception {
            runTest("idea/testData/intentions/importMember/AlreadyImportedSameNameClass2.kt");
        }

        @TestMetadata("ClassCallChain.kt")
        public void testClassCallChain() throws Exception {
            runTest("idea/testData/intentions/importMember/ClassCallChain.kt");
        }

        @TestMetadata("ClassCallChain2.kt")
        public void testClassCallChain2() throws Exception {
            runTest("idea/testData/intentions/importMember/ClassCallChain2.kt");
        }

        @TestMetadata("ClassCallChain3.kt")
        public void testClassCallChain3() throws Exception {
            runTest("idea/testData/intentions/importMember/ClassCallChain3.kt");
        }

        @TestMetadata("EnumMember.kt")
        public void testEnumMember() throws Exception {
            runTest("idea/testData/intentions/importMember/EnumMember.kt");
        }

        @TestMetadata("FqReference.kt")
        public void testFqReference() throws Exception {
            runTest("idea/testData/intentions/importMember/FqReference.kt");
        }

        @TestMetadata("FqReferenceCall.kt")
        public void testFqReferenceCall() throws Exception {
            runTest("idea/testData/intentions/importMember/FqReferenceCall.kt");
        }

        @TestMetadata("FqReferenceForNestedMember.kt")
        public void testFqReferenceForNestedMember() throws Exception {
            runTest("idea/testData/intentions/importMember/FqReferenceForNestedMember.kt");
        }

        @TestMetadata("FqReferenceForNestedMember2.kt")
        public void testFqReferenceForNestedMember2() throws Exception {
            runTest("idea/testData/intentions/importMember/FqReferenceForNestedMember2.kt");
        }

        @TestMetadata("FromCompanionObject.kt")
        public void testFromCompanionObject() throws Exception {
            runTest("idea/testData/intentions/importMember/FromCompanionObject.kt");
        }

        @TestMetadata("ImportMemberInImport.kt")
        public void testImportMemberInImport() throws Exception {
            runTest("idea/testData/intentions/importMember/ImportMemberInImport.kt");
        }

        @TestMetadata("ImportMemberInMiddleOfImport.kt")
        public void testImportMemberInMiddleOfImport() throws Exception {
            runTest("idea/testData/intentions/importMember/ImportMemberInMiddleOfImport.kt");
        }

        @TestMetadata("NestedClass1.kt")
        public void testNestedClass1() throws Exception {
            runTest("idea/testData/intentions/importMember/NestedClass1.kt");
        }

        @TestMetadata("NestedClass2.kt")
        public void testNestedClass2() throws Exception {
            runTest("idea/testData/intentions/importMember/NestedClass2.kt");
        }

        @TestMetadata("NoTarget.kt")
        public void testNoTarget() throws Exception {
            runTest("idea/testData/intentions/importMember/NoTarget.kt");
        }

        @TestMetadata("NotApplicablePackage.kt")
        public void testNotApplicablePackage() throws Exception {
            runTest("idea/testData/intentions/importMember/NotApplicablePackage.kt");
        }

        @TestMetadata("NotForQualifier.kt")
        public void testNotForQualifier() throws Exception {
            runTest("idea/testData/intentions/importMember/NotForQualifier.kt");
        }

        @TestMetadata("ObjectMethod.kt")
        public void testObjectMethod() throws Exception {
            runTest("idea/testData/intentions/importMember/ObjectMethod.kt");
        }

        @TestMetadata("StaticJavaField.kt")
        public void testStaticJavaField() throws Exception {
            runTest("idea/testData/intentions/importMember/StaticJavaField.kt");
        }

        @TestMetadata("StaticJavaMethod.kt")
        public void testStaticJavaMethod() throws Exception {
            runTest("idea/testData/intentions/importMember/StaticJavaMethod.kt");
        }

        @TestMetadata("TopLevelFun.kt")
        public void testTopLevelFun() throws Exception {
            runTest("idea/testData/intentions/importMember/TopLevelFun.kt");
        }
    }

    @TestMetadata("idea/testData/intentions/convertToBlockBody")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ConvertToBlockBody extends AbstractHLIntentionTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("addSpace.kt")
        public void testAddSpace() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/addSpace.kt");
        }

        @TestMetadata("adjustLineIndent.kt")
        public void testAdjustLineIndent() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/adjustLineIndent.kt");
        }

        public void testAllFilesPresentInConvertToBlockBody() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/intentions/convertToBlockBody"), Pattern.compile("^([\\w\\-_]+)\\.(kt|kts)$"), null, true);
        }

        @TestMetadata("annotatedExpr.kt")
        public void testAnnotatedExpr() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/annotatedExpr.kt");
        }

        @TestMetadata("annotatedExpr2.kt")
        public void testAnnotatedExpr2() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/annotatedExpr2.kt");
        }

        @TestMetadata("annotatedExprInParentheses.kt")
        public void testAnnotatedExprInParentheses() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/annotatedExprInParentheses.kt");
        }

        @TestMetadata("explicitlyNonUnitFun.kt")
        public void testExplicitlyNonUnitFun() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/explicitlyNonUnitFun.kt");
        }

        @TestMetadata("explicitlyTypedFunWithUnresolvedExpression.kt")
        public void testExplicitlyTypedFunWithUnresolvedExpression() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/explicitlyTypedFunWithUnresolvedExpression.kt");
        }

        @TestMetadata("explicitlyTypedFunWithUnresolvedType.kt")
        public void testExplicitlyTypedFunWithUnresolvedType() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/explicitlyTypedFunWithUnresolvedType.kt");
        }

        @TestMetadata("explicitlyUnitFun.kt")
        public void testExplicitlyUnitFun() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/explicitlyUnitFun.kt");
        }

        @TestMetadata("explicitlyUnitFunWithUnresolvedExpression.kt")
        public void testExplicitlyUnitFunWithUnresolvedExpression() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/explicitlyUnitFunWithUnresolvedExpression.kt");
        }

        @TestMetadata("funWithCustomUnitClass.kt")
        public void testFunWithCustomUnitClass() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/funWithCustomUnitClass.kt");
        }

        @TestMetadata("funWithThrow.kt")
        public void testFunWithThrow() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/funWithThrow.kt");
        }

        @TestMetadata("funWithUnit.kt")
        public void testFunWithUnit() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/funWithUnit.kt");
        }

        @TestMetadata("getter.kt")
        public void testGetter() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/getter.kt");
        }

        @TestMetadata("getterTypeInferred.kt")
        public void testGetterTypeInferred() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/getterTypeInferred.kt");
        }

        @TestMetadata("getterWithThrow.kt")
        public void testGetterWithThrow() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/getterWithThrow.kt");
        }

        @TestMetadata("ifWhenUnit.kt")
        public void testIfWhenUnit() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/ifWhenUnit.kt");
        }

        @TestMetadata("implicitlyNonUnitFun.kt")
        public void testImplicitlyNonUnitFun() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/implicitlyNonUnitFun.kt");
        }

        @TestMetadata("implicitlyNonUnitFun2.kt")
        public void testImplicitlyNonUnitFun2() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/implicitlyNonUnitFun2.kt");
        }

        @TestMetadata("implicitlyTypedFunWithUnresolvedType.kt")
        public void testImplicitlyTypedFunWithUnresolvedType() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/implicitlyTypedFunWithUnresolvedType.kt");
        }

        @TestMetadata("implicitlyUnitFun.kt")
        public void testImplicitlyUnitFun() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/implicitlyUnitFun.kt");
        }

        @TestMetadata("labeledExpr.kt")
        public void testLabeledExpr() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/labeledExpr.kt");
        }

        @TestMetadata("labeledExprInParentheses.kt")
        public void testLabeledExprInParentheses() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/labeledExprInParentheses.kt");
        }

        @TestMetadata("nothingFun.kt")
        public void testNothingFun() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/nothingFun.kt");
        }

        @TestMetadata("overrideWithPlatformType.kt")
        public void testOverrideWithPlatformType() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/overrideWithPlatformType.kt");
        }

        @TestMetadata("setter.kt")
        public void testSetter() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/setter.kt");
        }

        @TestMetadata("valueIsAnonymousObject.kt")
        public void testValueIsAnonymousObject() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/valueIsAnonymousObject.kt");
        }

        @TestMetadata("valueIsAnonymousObject2.kt")
        public void testValueIsAnonymousObject2() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/valueIsAnonymousObject2.kt");
        }

        @TestMetadata("valueIsAnonymousObject3.kt")
        public void testValueIsAnonymousObject3() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/valueIsAnonymousObject3.kt");
        }

        @TestMetadata("valueIsAnonymousObject4.kt")
        public void testValueIsAnonymousObject4() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/valueIsAnonymousObject4.kt");
        }

        @TestMetadata("whenUnit.kt")
        public void testWhenUnit() throws Exception {
            runTest("idea/testData/intentions/convertToBlockBody/whenUnit.kt");
        }
    }
}
