package com.example.wether.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wether.data.repository.WeatherRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel (
   private val weatherRepository: WeatherRepository = WeatherRepository()
    ) : ViewModel() {

    private val _state = MutableStateFlow(HomeState())
    val state: StateFlow<HomeState> = _state.asStateFlow()

    fun onIntent(intent: HomeIntent) {
        when (intent) {
            is HomeIntent.LoadWeather -> loadWeather(intent.city)
        }

    }

    private fun loadWeather(city: String) {
        viewModelScope.launch {
            _state.value = HomeState(isLoading = true)
            try {
                val data = weatherRepository.fetchWeather(city)
                _state.value = HomeState(weatherInfo = data)

            } catch (e: Exception) {
                _state.value = HomeState(error = e.message ?: "Unknown error")
            }
        }

    }
}