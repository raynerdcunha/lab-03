package com.example.listycity3

import androidx.compose.runtime.mutableStateListOf

class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )
    private var index = -1

    val cities: List<City>
        get() = _cities

    fun addCity(city: City) {
        _cities.add(city)
    }
    // The following function is from Anthropic, Claude, "Can we change values on MutuableStateListOf datatype?", 2026-09-16
    fun updateCity(city: City) {
        _cities[index]=city
    }

    fun updateIndex(newIndex: Int) {
        if (newIndex != -1) {
            index = newIndex
        }
    }

}