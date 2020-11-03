package com.example.kotlingraphQLclient.model


data class Countries(
    var countries: List<Country>
)

data class Country(
    var name: String
)