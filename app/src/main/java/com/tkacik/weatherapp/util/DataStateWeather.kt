package com.tkacik.weatherapp.util

import com.tkacik.weatherapp.model.WeatherContainer

sealed class DataStateWeather {
    data class Success(val data: List<WeatherContainer>) : DataStateWeather()
    data class Error(val msg: String) : DataStateWeather()
    object Loading : DataStateWeather()
    object Idle : DataStateWeather()
}
