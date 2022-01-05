package com.tkacik.weatherapp.api

import com.tkacik.weatherapp.model.WeatherResponse
import com.tkacik.weatherapp.util.UnitWeather
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceWeather {


    @GET("forecast")
    fun getWeatherData(
        @Query("q") city: String,
        @Query("appid") apiKey: String = "65d00499677e59496ca2f318eb68c049",
        @Query("units") units: String = UnitWeather.IMPERIAL.name
    ): Single<WeatherResponse>
}