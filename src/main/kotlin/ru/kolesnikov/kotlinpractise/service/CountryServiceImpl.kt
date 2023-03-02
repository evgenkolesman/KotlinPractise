package ru.kolesnikov.kotlinpractise.service

import org.springframework.stereotype.Service
import ru.kolesnikov.kotlinpractise.controller.CountryDTO

@Service
class CountryService {

    fun getAll():CountryDTO {
        return new CountryDTO
    }
}