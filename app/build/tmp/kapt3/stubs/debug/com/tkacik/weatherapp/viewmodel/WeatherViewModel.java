package com.tkacik.weatherapp.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u000fH\u0014J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u000fJ\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/tkacik/weatherapp/viewmodel/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "repositoryWeather", "Lcom/tkacik/weatherapp/api/RepositoryWeather;", "(Lcom/tkacik/weatherapp/api/RepositoryWeather;)V", "dataStateWeather", "Landroidx/lifecycle/MutableLiveData;", "Lcom/tkacik/weatherapp/util/DataStateWeather;", "dataStateWeatherLD", "Landroidx/lifecycle/LiveData;", "getDataStateWeatherLD", "()Landroidx/lifecycle/LiveData;", "disposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "loadWeatherList", "", "city", "", "units", "onCleared", "onError", "throwable", "", "resetState", "weatherSuccess", "weather", "Lcom/tkacik/weatherapp/model/WeatherResponse;", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final com.tkacik.weatherapp.api.RepositoryWeather repositoryWeather = null;
    private io.reactivex.rxjava3.disposables.CompositeDisposable disposable;
    private final androidx.lifecycle.MutableLiveData<com.tkacik.weatherapp.util.DataStateWeather> dataStateWeather = null;
    
    @javax.inject.Inject()
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.tkacik.weatherapp.api.RepositoryWeather repositoryWeather) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tkacik.weatherapp.util.DataStateWeather> getDataStateWeatherLD() {
        return null;
    }
    
    public final void loadWeatherList(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    java.lang.String units) {
    }
    
    private final void weatherSuccess(com.tkacik.weatherapp.model.WeatherResponse weather) {
    }
    
    private final void onError(java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void resetState() {
    }
}