package ru.kolesnikov.kotlinpractise.controller

data class CountryDTO (
    val id: Long = 0,
    val countryName: String = "",
    val population: Long = 0
)