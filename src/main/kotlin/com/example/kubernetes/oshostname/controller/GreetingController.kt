package com.example.kubernetes.oshostname.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress

@RestController
class GreetingController {

    var counter = 0

    @GetMapping("/hello", produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun greeting(): String? {
        counter++;
        println(" am fost apelat")
        if (counter > 10) {
            throw IllegalAccessException()
        }
        return InetAddress.getLocalHost().hostName
    }

}
