package ru.kolesnikov.kotlinpractise.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import ru.kolesnikov.kotlinpractise.entity.CountryEntity
import ru.kolesnikov.kotlinpractise.service.CountryService

@RestController
@RequestMapping
class CountryController(
    private val countryService: CountryService
) {

    @GetMapping("/countries")
    fun getAll(): List<CountryDTO> = countryService.getAll()

    @GetMapping("/countries/{id}")
    fun getCountryById(@PathVariable id: Long): CountryDTO = countryService.getById(id)

    @PostMapping("/countries")
    fun addCountry(@RequestBody country: CountryDTO) = countryService.addCountry(country)

    @DeleteMapping("/countries/{id}")
    fun deleteCountry(@PathVariable id: Long) = countryService.deleteCountry(id)
}
