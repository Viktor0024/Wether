package com.example.wether.ui.home

sealed class HomeIntent {
    data class LoadWeather(val city: String) : HomeIntent()
}