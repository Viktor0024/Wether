package com.example.wether.ui.home

import com.example.wether.model.WeatherInfo

data class HomeState (
val isLoading: Boolean = false,
val weatherInfo: WeatherInfo? = null,
val error: String? = null
)