package com.example.kubernetes.oshostname.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import java.net.InetAddress

@RestController
class GreetingController {

    @Autowired
    lateinit var restTemplate: RestTemplate;

    @GetMapping("/hello")
    fun greeting() = InetAddress.getLocalHost().hostName

    @GetMapping("/hello/{name}/{port}")
    fun greetingAnother(@PathVariable name: String, @PathVariable port: String) = restTemplate.getForObject("http://$name:$port/hello", String::class.java)




}
