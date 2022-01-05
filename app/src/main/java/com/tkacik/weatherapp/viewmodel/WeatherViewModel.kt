package com.tkacik.weatherapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tkacik.weatherapp.api.RepositoryWeather
import com.tkacik.weatherapp.model.WeatherResponse
import com.tkacik.weatherapp.util.DataStateWeather
import com.tkacik.weatherapp.util.UnitWeather
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val repositoryWeather: RepositoryWeather
) : ViewModel() {

    private var disposable: CompositeDisposable = CompositeDisposable()

    private val dataStateWeather: MutableLiveData<DataStateWeather> = MutableLiveData()
    val dataStateWeatherLD: LiveData<DataStateWeather>
        get() = dataStateWeather


    fun loadWeatherList(city: String, units: String = UnitWeather.IMPERIAL.name) {
        disposable.add(
            repositoryWeather.getWeather(city, units)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::weatherSuccess, this::onError)
        )
    }

    private fun weatherSuccess(weather: WeatherResponse) {
        val state = weather.list?.let { DataStateWeather.Success(it) }
            ?: DataStateWeather.Error("No data found")
        dataStateWeather.value = state
        //Log.d("_log", "Weather success")
    }

    private fun onError(throwable: Throwable) {
        val errorMsg = throwable.message ?: "Something went wrong."
        dataStateWeather.value = DataStateWeather.Error(errorMsg)
        //Log.d("_log", "this is an error" + throwable.message)
    }


    override fun onCleared() {
        disposable.dispose()
        super.onCleared()
    }

    fun resetState() {
        dataStateWeather.value = DataStateWeather.Idle
    }
}


