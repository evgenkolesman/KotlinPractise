package ru.kolesnikov.kotlinpractise

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinPractiseApplication

fun main(args: Array<String>) {
    runApplication<KotlinPractiseApplication>(*args)
}
