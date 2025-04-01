configurations.compileClasspath {
    exclude("spring-boot-starter-web")
}

tasks.register("exportLibs", Zip::class) {
    from(configurations.compileClasspath)
    archiveFileName.set("libs.zip")
    into("java/lib")
    destinationDirectory.set(file("build"))
}
