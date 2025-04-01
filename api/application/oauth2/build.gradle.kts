//import com.github.jengelman.gradle.plugins.shadow.transformers.PropertiesFileTransformer

plugins {
//    id("com.github.johnrengelman.shadow") version "8.1.1"
//    id("org.springframework.boot.experimental.thin-launcher") version "1.0.31.RELEASE"

//    id("org.graalvm.buildtools.native") version "0.10.6"
//    id("maven-publish")
//    id("com.ppojin.gradle.plugin") version "0.0.0"
    id("com.ppojin.gradle.plugin") version "0.0.0"
//    id("com.ppojin.gradle") version "0.0.0"
}

//version = "0.0.0"

//publishing {
//    publications {
//        create<MavenPublication>("maven") {
//            from(components["java"])
//            versionMapping {
//                usage("java-api") {
//                    fromResolutionOf("runtimeClasspath")
//                }
//                usage("java-runtime") {
//                    fromResolutionResult()
//                }
//            }
//        }
//    }
//}

//tasks.assemble {
//    dependsOn(tasks.thinJar, tasks.shadowJar)
//}

//tasks.shadowJar {
////    mustRunAfter(tasks.thinJar)
//
//    archiveClassifier = "aws"
////    manifest.inheritFrom(tasks.thinJar.get().manifest)
//
//    mergeServiceFiles()
//    append("META-INF/spring.handlers")
//    append("META-INF/spring.schemas")
//    append("META-INF/spring.tooling")
//    append("META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports")
//    append("META-INF/spring/org.springframework.boot.actuate.autoconfigure.web.ManagementContextConfiguration.imports")
//    transform(PropertiesFileTransformer::class.java) {
//        paths = listOf("META-INF/spring.factories")
//        mergeStrategy = "append"
//    }
//
//    dependencies {
//        exclude(dependency(".*::"))
//    }
//
//    exclude("application-security.yaml")
//}
