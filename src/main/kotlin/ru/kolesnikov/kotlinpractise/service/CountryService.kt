package ru.kolesnikov.kotlinpractise.service

import ru.kolesnikov.kotlinpractise.controller.CountryDTO
import ru.kolesnikov.kotlinpractise.entity.CountryEntity

interface CountryService {

    fun getAll(): List<CountryDTO>

    fun getById(id:Long): CountryDTO

    fun addCountry(countryEntity: CountryDTO): CountryDTO

    fun deleteCountry(id: Long)
}