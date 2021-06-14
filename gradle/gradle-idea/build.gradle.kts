// GENERATED build.gradle.kts
// GENERATED BY kotlin.gradle.gradle-idea.iml
// USE `./gradlew generateIdeaGradleFiles` TO REGENERATE THIS FILE

plugins {
    kotlin("jvm")
    `java-library` // Add `compileOnlyApi` configuration
    id("jps-compatible")
}

repositories {
    maven { setUrl("https://cache-redirector.jetbrains.com/maven-central") }
    maven { setUrl("https://cache-redirector.jetbrains.com/intellij-third-party-dependencies") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jcenter") }
    maven { setUrl("https://cache-redirector.jetbrains.com/dl.google.com/dl/android/maven2") }
    maven { setUrl("https://cache-redirector.jetbrains.com/repo.jenkins-ci.org/releases") }
    maven { setUrl("https://cache-redirector.jetbrains.com/dl.bintray.com/groovy/maven/") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jetbrains.bintray.com/jediterm/") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jetbrains.bintray.com/markdown") }
    maven { setUrl("https://cache-redirector.jetbrains.com/www.myget.org/F/rd-snapshots/maven") }
    maven { setUrl("https://cache-redirector.jetbrains.com/download.jetbrains.com/teamcity-repository") }
    maven { setUrl("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide-plugin-dependencies") }
    maven { setUrl("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jetbrains.bintray.com/intellij-plugin-service") }
    maven { setUrl("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide-plugin-dependencies") }
}

dependencies {
    implementation(toolsJarApi())
    jpsLikeJarDependency(kotlinStdlib(), JpsDepScope.COMPILE)
    jpsLikeJarDependency(project(":kotlin-stdlib-jdk7"), JpsDepScope.COMPILE)
    jpsLikeJarDependency("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.4.2", JpsDepScope.COMPILE)
    jpsLikeJarDependency("com.google.guava:guava:30.1-jre", JpsDepScope.COMPILE)
    jpsLikeJarDependency("org.jetbrains.intellij.deps:gradle-api:6.8", JpsDepScope.COMPILE)
    jpsLikeJarDependency("org.jetbrains.intellij.deps:trove4j:1.0.20200330", JpsDepScope.COMPILE)
    jpsLikeJarDependency("org.jetbrains.kotlin:kotlin-test:1.4.32", JpsDepScope.TEST)
    jpsLikeJarDependency(project(":prepare:ide-plugin-dependencies:kotlin-compiler-for-ide"), JpsDepScope.COMPILE)
    jpsLikeJarDependency(project(":kotlin-scripting-compiler"), JpsDepScope.COMPILE)
    jpsLikeJarDependency(project(":kotlin-scripting-compiler-impl"), JpsDepScope.COMPILE)
    jpsLikeJarDependency(project(":kotlin-script-runtime"), JpsDepScope.COMPILE)
    jpsLikeJarDependency(project(":kotlin-scripting-common"), JpsDepScope.COMPILE)
    jpsLikeJarDependency(project(":kotlin-scripting-jvm"), JpsDepScope.COMPILE)
    jpsLikeJarDependency(project(":prepare:ide-plugin-dependencies:kotlin-gradle-statistics-for-ide"), JpsDepScope.COMPILE)
    jpsLikeJarDependency(project(":prepare:ide-plugin-dependencies:kotlin-compiler-tests-for-ide"), JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.common", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.core", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.fir.frontend-independent", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jps-common", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.idea", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.idea.tests", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.formatter", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.gradle.gradle-tooling", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm-debugger.core", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm-debugger.coroutines", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.native", JpsDepScope.COMPILE)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.kapt", JpsDepScope.RUNTIME)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.scripting", JpsDepScope.RUNTIME)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.project-wizard.idea", JpsDepScope.RUNTIME)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.tests-common", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.test-framework", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.resources-descriptors", JpsDepScope.TEST)
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("platform-objectSerializer-annotations") }) // 'intellij.platform.objectSerializer.annotations' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("platform-impl") }) // 'intellij.platform.projectModel.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("resources_en") }) // 'intellij.platform.projectModel.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("intellij-core-analysis-deprecated") }) // 'intellij.platform.projectModel.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("platform-api") }) // 'intellij.platform.projectModel.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("jps-model") }) // 'intellij.platform.projectModel.impl' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:jdom:2.0.6", JpsDepScope.COMPILE) // 'intellij.platform.projectModel.impl' dependency
    jpsLikeJarDependency(intellijCoreDep(), JpsDepScope.COMPILE) // 'intellij.platform.projectModel.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("util") }) // 'intellij.platform.projectModel.impl' dependency
    jpsLikeJarDependency("org.jetbrains:annotations:20.1.0", JpsDepScope.COMPILE) // 'intellij.platform.projectModel.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("external-system-rt") }) // 'intellij.platform.externalSystem' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("forms_rt") }) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("resources") }) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency("com.jgoodies:forms:1.1-preview", JpsDepScope.COMPILE) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.32", JpsDepScope.COMPILE) // 'intellij.platform.ide.impl' dependency
    jpsLikeJarDependency(intellijPluginDep("java", forIde = true), JpsDepScope.COMPILE) // 'intellij.java.impl' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:asm-all:9.1", JpsDepScope.COMPILE, { isTransitive = false }) // 'intellij.java.impl' dependency
    jpsLikeJarDependency("org.apache.velocity:velocity:1.7", JpsDepScope.COMPILE) // 'intellij.java.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.COMPILE, { includeJars("stats") }) // 'intellij.java.execution.impl' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:ap-validation:0.0.5", JpsDepScope.COMPILE) // 'intellij.java.execution.impl' dependency
    jpsLikeJarDependency(intellijPluginDep("Groovy", forIde = true), JpsDepScope.COMPILE) // 'intellij.groovy.psi' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy:2.5.11", JpsDepScope.COMPILE) // 'intellij.groovy.psi' dependency
    jpsLikeJarDependency(intellijPluginDep("junit", forIde = true), JpsDepScope.COMPILE) // 'intellij.junit' dependency
    jpsLikeJarDependency("org.jetbrains.teamcity:serviceMessages:2019.1.4", JpsDepScope.COMPILE, { isTransitive = false }) // 'intellij.junit' dependency
    jpsLikeJarDependency(intellijPluginDep("testng", forIde = true), JpsDepScope.COMPILE) // 'intellij.testng' dependency
    jpsLikeJarDependency(intellijPluginDep("gradle-java", forIde = true), JpsDepScope.COMPILE) // 'intellij.gradle.java' dependency
    jpsLikeJarDependency(intellijPluginDep("gradle", forIde = true), JpsDepScope.COMPILE) // 'intellij.gradle.java' dependency
    jpsLikeJarDependency("org.slf4j:slf4j-log4j12:1.7.25", JpsDepScope.COMPILE) // 'intellij.gradle.java' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy-ant:2.4.17", JpsDepScope.PROVIDED) // 'intellij.gradle.java' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy:2.4.17", JpsDepScope.PROVIDED) // 'intellij.gradle.java' dependency
    jpsLikeModuleDependency(":kotlin-ide.intellij.platform.externalSystem.tests", JpsDepScope.TEST) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeModuleDependency(":kotlin-ide.intellij.platform.lang.tests", JpsDepScope.TEST) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-impl") }) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("resources_en") }) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("intellij-core-analysis-deprecated") }) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-api") }) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeJarDependency(intellijCoreDep(), JpsDepScope.TEST) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("util") }) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("forms_rt") }) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("jps-model") }) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:jdom:2.0.6", JpsDepScope.TEST) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("resources") }) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeJarDependency("org.jetbrains:annotations:20.1.0", JpsDepScope.TEST) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeJarDependency("com.jgoodies:forms:1.1-preview", JpsDepScope.TEST) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeJarDependency("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.32", JpsDepScope.TEST) // 'intellij.platform.externalSystem.tests' dependency
    jpsLikeModuleDependency(":kotlin-ide.intellij.gradle.toolingExtension.tests", JpsDepScope.TEST) // 'intellij.gradle.toolingExtension.tests' dependency
    jpsLikeModuleDependency(":kotlin-ide.intellij.gradle.tests", JpsDepScope.TEST) // 'intellij.gradle.tests' dependency
}

configurations.all {
    exclude(module = "tests-common") // Avoid classes with same FQN clashing
}

sourceSets {
    "main" {
        java.srcDir("src")
        resources.srcDir("resources")
    }
    "test" {
        java.srcDir("test")
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompile> {
    kotlinOptions.freeCompilerArgs = listOf("-version", "-Xstrict-java-nullability-assertions", "-Xjvm-default=enable", "-Xopt-in=kotlin.RequiresOptIn", "-Xopt-in=org.jetbrains.kotlin.gradle.ExperimentalKotlinMPPGradleModelExtensionsApi", "-Xskip-prerelease-check")
    kotlinOptions.jdkHome = rootProject.extra["JDK_11"] as String
    kotlinOptions.useOldBackend = true // KT-45697
}

testsJar()