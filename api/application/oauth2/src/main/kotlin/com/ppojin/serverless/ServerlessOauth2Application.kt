package com.ppojin.serverless

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ServerlessOauth2Application {
    fun main(args: Array<String>) {
        runApplication<ServerlessOauth2Application>(*args)
    }
}


