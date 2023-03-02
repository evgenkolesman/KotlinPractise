package ru.kolesnikov.kotlinpractise.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.kolesnikov.kotlinpractise.entity.CountryEntity

interface CountryRepository : JpaRepository<CountryEntity, Long>