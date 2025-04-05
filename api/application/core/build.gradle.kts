plugins {
    id("com.ppojin.gradle.plugin") version "0.0.1"
}

configurations.compileClasspath {
    exclude("spring-boot-starter-web")
    exclude("spring-cloud-starter-function-web")
}

tasks.register("zipConfigurations", Zip::class) {
    from(configurations.compileClasspath)
    archiveFileName.set("libs.zip")
    into("java/lib")
    destinationDirectory.set(file("build"))
}

tasks.register("zipShadowJar", Zip::class) {
    from("build/libs")
    archiveFileName.set("libs.zip")
    into("java/lib")
    destinationDirectory.set(file("build"))
}

tasks.wrapAwsLambdaPackage {
    finalizedBy(tasks.named("zipShadowJar"))
}
