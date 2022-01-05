package com.tkacik.weatherapp.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/tkacik/weatherapp/api/ServiceWeather;", "", "getWeatherData", "Lio/reactivex/rxjava3/core/Single;", "Lcom/tkacik/weatherapp/model/WeatherResponse;", "city", "", "apiKey", "units", "app_debug"})
public abstract interface ServiceWeather {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "forecast")
    public abstract io.reactivex.rxjava3.core.Single<com.tkacik.weatherapp.model.WeatherResponse> getWeatherData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appid")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "units")
    java.lang.String units);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}