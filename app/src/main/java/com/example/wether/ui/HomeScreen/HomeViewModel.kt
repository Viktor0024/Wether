package com.example.wether.ui.HomeScreen

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {

    data class City(val id: Int, val nameCity: String)

    private val _citys = MutableStateFlow<List<City>>(emptyList())
    var citys: StateFlow<List<City>> = _citys

    init {
        loadCity()
    }

    private fun loadCity() {
        _citys.value = listOf(
            City(1, "Chernihiv"),
            City(2, "Kyiv"),
            City(3, "London")

        )
    }
}