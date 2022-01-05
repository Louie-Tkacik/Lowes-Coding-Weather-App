package com.tkacik.weatherapp.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/tkacik/weatherapp/api/RepositoryWeather;", "", "weatherService", "Lcom/tkacik/weatherapp/api/ServiceWeather;", "(Lcom/tkacik/weatherapp/api/ServiceWeather;)V", "getWeather", "Lio/reactivex/rxjava3/core/Single;", "Lcom/tkacik/weatherapp/model/WeatherResponse;", "city", "", "units", "app_debug"})
public final class RepositoryWeather {
    private final com.tkacik.weatherapp.api.ServiceWeather weatherService = null;
    
    @javax.inject.Inject()
    public RepositoryWeather(@org.jetbrains.annotations.NotNull()
    com.tkacik.weatherapp.api.ServiceWeather weatherService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<com.tkacik.weatherapp.model.WeatherResponse> getWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String units) {
        return null;
    }
}