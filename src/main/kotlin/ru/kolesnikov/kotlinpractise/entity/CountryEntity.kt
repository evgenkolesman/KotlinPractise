package ru.kolesnikov.kotlinpractise.entity

import javax.persistence.*

@Entity
@Table(name ="country")
class CountryEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long = 0,
    @Column(name = "countryName")
    val countryName: String = "",
    @Column(name = "population")
    val population: Long = 0)