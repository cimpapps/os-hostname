package com.example.kubernetes.oshostname

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OsHostnameApplication

fun main(args: Array<String>) {
    runApplication<OsHostnameApplication>(*args)
}

