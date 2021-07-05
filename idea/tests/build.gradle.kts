// GENERATED build.gradle.kts
// GENERATED BY kotlin.idea.tests.iml
// USE `./gradlew generateIdePluginGradleFiles` TO REGENERATE THIS FILE

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
    maven { setUrl("https://cache-redirector.jetbrains.com/kotlin.bintray.com/kotlin-plugin/") }
    maven { setUrl("https://cache-redirector.jetbrains.com/jetbrains.bintray.com/space") }
    maven { setUrl("https://cache-redirector.jetbrains.com/kotlin.bintray.com/kotlin-ide-plugin-dependencies") }
    maven { setUrl("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-ide") }
    maven { setUrl("https://cache-redirector.jetbrains.com/kotlin.bintray.com/kotlin-ide-plugin-dependencies") }
}

disableDependencyVerification()

dependencies {
    implementation(toolsJarApi())
    jpsLikeJarDependency(kotlinStdlib(), JpsDepScope.COMPILE)
    jpsLikeJarDependency(project(":kotlin-stdlib-jdk7"), JpsDepScope.COMPILE)
    jpsLikeJarDependency("io.javaslang:javaslang:2.0.6", JpsDepScope.TEST)
    jpsLikeJarDependency("org.jetbrains.kotlin:kotlin-test:1.4.0", JpsDepScope.TEST)
    jpsLikeJarDependency(project(":prepare:ide-plugin-dependencies:android-extensions-compiler-plugin-for-ide"), JpsDepScope.TEST)
    jpsLikeJarDependency("com.google.code.gson:gson:2.8.6", JpsDepScope.TEST)
    jpsLikeJarDependency("org.jetbrains.intellij.deps:trove4j:1.0.20200330", JpsDepScope.TEST)
    jpsLikeJarDependency("com.google.guava:guava:29.0-jre", JpsDepScope.TEST)
    jpsLikeJarDependency("org.jetbrains.intellij.deps.fastutil:intellij-deps-fastutil:8.4.1-4", JpsDepScope.TEST, { isTransitive = false })
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.test-framework", JpsDepScope.TEST, exported = true)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.tests-common", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.repl", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.line-indent-provider", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm-debugger.util", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.native", JpsDepScope.TEST)
    jpsLikeJarDependency(project(":prepare:ide-plugin-dependencies:kotlin-compiler-for-ide"), JpsDepScope.TEST)
    jpsLikeJarDependency(project(":prepare:ide-plugin-dependencies:kotlin-compiler-cli-for-ide"), JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.core", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.common", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.fir.frontend-independent", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.fir.frontend-independent.tests", JpsDepScope.TEST)
    jpsLikeJarDependency(project(":prepare:ide-plugin-dependencies:sam-with-receiver-compiler-plugin-for-ide"), JpsDepScope.TEST)
    jpsLikeJarDependency(project(":kotlin-reflect"), JpsDepScope.TEST)
    jpsLikeJarDependency(project(":kotlin-script-runtime"), JpsDepScope.TEST)
    jpsLikeJarDependency(project(":kotlin-scripting-common"), JpsDepScope.TEST)
    jpsLikeJarDependency(project(":kotlin-scripting-jvm"), JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.idea", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.gradle.gradle-idea", JpsDepScope.RUNTIME)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.gradle.gradle-native", JpsDepScope.RUNTIME)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.sam-with-receiver", JpsDepScope.RUNTIME)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.noarg", JpsDepScope.RUNTIME)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.kotlinx-serialization", JpsDepScope.RUNTIME)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.allopen", JpsDepScope.RUNTIME)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.parcelize", JpsDepScope.RUNTIME)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.compiler-plugins.lombok", JpsDepScope.RUNTIME)
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-api") }) // 'intellij.platform.core' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("resources_en") }) // 'intellij.platform.core' dependency
    jpsLikeJarDependency(intellijCoreDep(), JpsDepScope.TEST) // 'intellij.platform.core' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("intellij-core-analysis-deprecated") }) // 'intellij.platform.core' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("extensions") }) // 'intellij.platform.core' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("util") }) // 'intellij.platform.core' dependency
    jpsLikeJarDependency("org.jetbrains:annotations:20.1.0", JpsDepScope.TEST) // 'intellij.platform.core' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("idea") }) // 'intellij.platform.structuralSearch' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("structuralsearch") }) // 'intellij.platform.structuralSearch' dependency
    jpsLikeJarDependency(intellijPluginDep("gradle", forIde = true), JpsDepScope.TEST) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:gradle-api:6.7", JpsDepScope.TEST) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency("org.slf4j:slf4j-log4j12:1.7.25", JpsDepScope.TEST) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-impl") }) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("external-system-rt") }) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency("org.jetbrains.teamcity:serviceMessages:2019.1.4", JpsDepScope.TEST, { isTransitive = false }) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy-ant:2.4.17", JpsDepScope.TEST) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy:2.4.17", JpsDepScope.TEST) // 'intellij.gradle.common' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-ide-util-io") }) // 'intellij.platform.ide.util.io' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-concurrency") }) // 'intellij.platform.duplicates.analysis' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("jps-model") }) // 'intellij.platform.duplicates.analysis' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:jdom:2.0.6", JpsDepScope.TEST) // 'intellij.platform.duplicates.analysis' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-util-ex") }) // 'intellij.platform.duplicates.analysis' dependency
    jpsLikeJarDependency("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.0", JpsDepScope.TEST) // 'intellij.platform.duplicates.analysis' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("spellchecker") }) // 'intellij.spellchecker' dependency
    jpsLikeModuleDependency(":kotlin-ide.kotlin.uast.uast-kotlin", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.formatter", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jps-common", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.jvm-debugger.evaluation", JpsDepScope.TEST)
    jpsLikeModuleDependency(":kotlin-ide.kotlin.j2k.services", JpsDepScope.TEST)
    jpsLikeJarDependency(intellijPluginDep("IntelliLang", forIde = true), JpsDepScope.TEST) // 'intellij.platform.langInjection' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-serviceContainer") }) // 'intellij.platform.serviceContainer' dependency
    jpsLikeJarDependency(intellijPluginDep("java", forIde = true), JpsDepScope.TEST) // 'intellij.jvm.analysis.impl' dependency
    jpsLikeJarDependency("org.jetbrains.intellij.deps:asm-all:9.0", JpsDepScope.TEST, { isTransitive = false }) // 'intellij.jvm.analysis.impl' dependency
    jpsLikeJarDependency("org.apache.velocity:velocity:1.7", JpsDepScope.TEST) // 'intellij.jvm.analysis.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("javac2") }) // 'intellij.jvm.analysis.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("forms_rt") }) // 'intellij.jvm.analysis.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("resources") }) // 'intellij.jvm.analysis.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-util-ui") }) // 'intellij.jvm.analysis.impl' dependency
    jpsLikeJarDependency("com.jgoodies:forms:1.1-preview", JpsDepScope.TEST) // 'intellij.jvm.analysis.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-statistics") }) // 'intellij.java.execution.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-statistics-uploader") }) // 'intellij.java.execution.impl' dependency
    jpsLikeJarDependency(intellijDep(forIde = true), JpsDepScope.TEST, { includeJars("platform-statistics-config") }) // 'intellij.java.execution.impl' dependency
    jpsLikeJarDependency(intellijPluginDep("copyright", forIde = true), JpsDepScope.TEST) // 'intellij.copyright' dependency
    jpsLikeJarDependency(intellijPluginDep("junit", forIde = true), JpsDepScope.TEST) // 'intellij.junit' dependency
    jpsLikeJarDependency(intellijPluginDep("Groovy", forIde = true), JpsDepScope.TEST) // 'intellij.groovy.psi' dependency
    jpsLikeJarDependency("org.codehaus.groovy:groovy:2.5.11", JpsDepScope.TEST) // 'intellij.groovy.psi' dependency
    jpsLikeJarDependency(intellijPluginDep("properties", forIde = true), JpsDepScope.TEST) // 'intellij.properties.psi' dependency
}

configurations.all {
    exclude(module = "tests-common") // Avoid classes with same FQN clashing
}

sourceSets {
    "main" {
        
    }
    "test" {
        java.srcDir("../../completion/tests/test")
        java.srcDir("test")
        java.srcDir("../../live-templates/tests/test")
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompile> {
    kotlinOptions.freeCompilerArgs = listOf("-version", "-Xstrict-java-nullability-assertions", "-Xjvm-default=enable", "-Xskip-prerelease-check")
    kotlinOptions.useOldBackend = true // KT-45697
}

testsJar()