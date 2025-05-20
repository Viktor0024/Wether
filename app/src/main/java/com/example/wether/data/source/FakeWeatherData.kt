package com.example.wether.data.source

import com.example.wether.model.WeatherInfo
object FakeWeatherData {
 val fakeWeatherData = listOf(
    WeatherInfo(1, "Киев", 21.5, "Солнечно", "https://openweathermap.org/img/wn/01d.png", 3.2),
    WeatherInfo(2, "Львов", 18.0, "Дождь", "https://openweathermap.org/img/wn/09d.png", 4.5),
    WeatherInfo(3, "Харьков", 19.3, "Облачно", "https://openweathermap.org/img/wn/03d.png", 2.7),
    WeatherInfo(4, "Одесса", 23.8, "Ясно", "https://openweathermap.org/img/wn/01d.png", 5.0),
    WeatherInfo(5, "Днепр", 20.4, "Пасмурно", "https://openweathermap.org/img/wn/04d.png", 3.8),
    WeatherInfo(6, "Запорожье", 22.1, "Солнечно", "https://openweathermap.org/img/wn/01d.png", 2.5),
    WeatherInfo(7, "Чернигов", 17.9, "Лёгкий дождь", "https://openweathermap.org/img/wn/10d.png", 4.1),
    WeatherInfo(8, "Житомир", 18.5, "Облачно", "https://openweathermap.org/img/wn/03d.png", 3.6),
    WeatherInfo(9, "Винница", 20.0, "Ясно", "https://openweathermap.org/img/wn/01d.png", 2.0),
    WeatherInfo(10, "Ивано-Франковск", 16.4, "Гроза", "https://openweathermap.org/img/wn/11d.png", 6.0),
    WeatherInfo(11, "Полтава", 21.2, "Солнечно", "https://openweathermap.org/img/wn/01d.png", 3.1),
    WeatherInfo(12, "Сумы", 19.0, "Облачно", "https://openweathermap.org/img/wn/03d.png", 2.9),
    WeatherInfo(13, "Тернополь", 17.7, "Морось", "https://openweathermap.org/img/wn/09d.png", 3.0),
    WeatherInfo(14, "Черкассы", 20.3, "Ясно", "https://openweathermap.org/img/wn/01d.png", 2.8),
    WeatherInfo(15, "Ужгород", 15.9, "Туман", "https://openweathermap.org/img/wn/50d.png", 1.5)
)
   fun  getWeather(city: String):WeatherInfo{
   return fakeWeatherData.firstOrNull{it.city.equals(city,ignoreCase = true)}
      ?: fakeWeatherData.random()
   }
}