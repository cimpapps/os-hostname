package com.example.kubernetes.oshostname.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress

@RestController
class GreetingController {
    @GetMapping("/hello")
    fun greeting() = InetAddress.getLocalHost().hostName
}
