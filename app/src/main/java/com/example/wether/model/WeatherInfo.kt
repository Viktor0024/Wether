package com.example.wether.model

data class WeatherInfo(
    val id: Int,
    val city: String,
    val temperatureC: Double,
    val condition: String,
    val iconUrl: String,
    val windSpeed: Double
)