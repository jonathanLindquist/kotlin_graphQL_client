package com.example.kotlingraphQLclient.controller

import com.example.kotlingraphQLclient.client.TestClient
import com.example.kotlingraphQLclient.model.Countries
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/test")
class TestController() {
    @GetMapping("/hello")
    fun hello(): Mono<String> {
        return Mono.just("Hello World!")
    }

    @GetMapping("/countries")
    fun getCountries(testClient: TestClient): Flux<Countries> {
        return testClient.getCountries()
    }
}