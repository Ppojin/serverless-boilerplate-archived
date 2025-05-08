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

val subProjects = listOf(
    ":application:oauth2",
    ":application:poc",
    ":application:core"
)

include(
    *subProjects.toTypedArray()
)
