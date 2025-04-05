plugins {
    kotlin("jvm") version "2.1.20"
    kotlin("plugin.spring") version "2.1.20"
    id("org.springframework.boot") version "3.4.4"
    id("io.spring.dependency-management") version "1.1.7"
//    id("org.graalvm.buildtools.native") version "0.10.6"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.1.20")
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
        plugin("org.jetbrains.kotlin.plugin.spring")
        plugin("org.springframework.boot")
        plugin("io.spring.dependency-management")
    }

    group = "com.ppojin"

    val springCloudVersion = "2024.0.0"

    repositories {
        mavenCentral()
        maven("https://repo.spring.io/milestone")
    }

    dependencies {
        implementation("org.springframework.boot:spring-boot-starter")
//        implementation("org.springframework.boot:spring-boot-starter-web")

        implementation("org.jetbrains.kotlin:kotlin-reflect")

        implementation("com.amazonaws:aws-lambda-java-core:1.2.3")
        implementation("com.amazonaws:aws-lambda-java-events:3.15.0")

        implementation("org.springframework.boot:spring-boot-starter-webflux")
        implementation("org.apache.httpcomponents.client5:httpclient5:5.4.2")

        implementation("org.springframework.cloud:spring-cloud-starter-function-web")
        implementation("org.springframework.cloud:spring-cloud-function-kotlin")
        implementation("org.springframework.cloud:spring-cloud-function-adapter-aws")

        testImplementation("org.springframework.boot:spring-boot-starter-test")
    }

    dependencyManagement {
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}")
        }
    }

    tasks.jar {
        exclude ("application-security.yaml")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
