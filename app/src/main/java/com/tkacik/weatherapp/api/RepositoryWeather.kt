package com.tkacik.weatherapp.api

import com.tkacik.weatherapp.model.WeatherResponse
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class RepositoryWeather @Inject constructor(
    private val weatherService: ServiceWeather
) {

    fun getWeather(
        city: String, units: String
    ): Single<WeatherResponse> = weatherService.getWeatherData(city, units = units)
}

