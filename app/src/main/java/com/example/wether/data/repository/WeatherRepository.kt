package com.example.wether.data.repository

import com.example.wether.data.source.FakeWeatherData
import com.example.wether.model.WeatherInfo

class WeatherRepository {
    fun fetchWeather(city:String):WeatherInfo{
        return FakeWeatherData.getWeather(city)
    }
}