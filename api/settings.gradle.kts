rootProject.name = "root"

include(
    ":application:core",
    ":application:oauth2",
)

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }
}
