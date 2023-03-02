package ru.kolesnikov.kotlinpractise

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class KotlinPractiseApplication

fun main(args: Array<String>) {
    runApplication<KotlinPractiseApplication>(*args)
}
