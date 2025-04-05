package com.ppojin.sl.poc

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class PocHandler {
    @Bean
    fun pocRouter(): (APIGatewayProxyRequestEvent) -> APIGatewayProxyResponseEvent = {
        if (it.path.startsWith("/uppercase")) {
            uppercaseHandler(it)
        } else if (it.path.startsWith("/reversed")) {
            reversedHandler(it)
        } else {
            helloWorldHandler(it)
        }
    }
}

fun reversedHandler(event: APIGatewayProxyRequestEvent): APIGatewayProxyResponseEvent {
    return APIGatewayProxyResponseEvent().apply {
        statusCode = 200
        body = event.body.reversed()
        headers = mapOf("Content-Type" to "text/plain")
        isBase64Encoded = false
    }
}

fun uppercaseHandler(event: APIGatewayProxyRequestEvent): APIGatewayProxyResponseEvent {
    return APIGatewayProxyResponseEvent().apply {
        statusCode = 200
        body = event.body.uppercase()
        headers = mapOf("Content-Type" to "text/plain")
        isBase64Encoded = false
    }
}

fun helloWorldHandler(event: APIGatewayProxyRequestEvent): APIGatewayProxyResponseEvent {
    return APIGatewayProxyResponseEvent().apply {
        statusCode = 200
        body = "Hello, ${event.queryStringParameters["name"] ?: "world"}!"
        headers = mapOf("Content-Type" to "text/plain")
        isBase64Encoded = false
    }
}
