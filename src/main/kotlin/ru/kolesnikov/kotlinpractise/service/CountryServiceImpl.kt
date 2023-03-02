package ru.kolesnikov.kotlinpractise.service

import org.springframework.stereotype.Service
import ru.kolesnikov.kotlinpractise.controller.CountryDTO
import ru.kolesnikov.kotlinpractise.entity.CountryEntity
import ru.kolesnikov.kotlinpractise.repository.CountryRepository
import java.util.stream.Collectors

@Service
class CountryServiceImpl(
    private val countryRepository: CountryRepository) : CountryService {
    override fun getAll(): List<CountryDTO> = countryRepository.findAll()
        .map {it.toDto() }

    override fun getById(id:Long): CountryDTO = countryRepository.getReferenceById(id).toDto()

    override fun addCountry(country: CountryDTO): CountryDTO = countryRepository.save(country.toEntity()).toDto()

    override fun deleteCountry(id: Long) = countryRepository.deleteById(id)


    private fun CountryEntity.toDto(): CountryDTO =
        CountryDTO (countryName = this.countryName,
            id = this.id,
            population = this.population)

    private fun CountryDTO.toEntity(): CountryEntity =
        CountryEntity (countryName = this.countryName,
            id = this.id,
            population = this.population)
}