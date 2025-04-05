rootProject.name = "api"

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

include("modules:core")
findProject(":modules:core")?.name = "core"

include(":modules:oauth2")
findProject(":modules:oauth2")?.name = "oauth2"

include("modules:poc")
findProject(":modules:poc")?.name = "poc"
