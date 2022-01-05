package com.tkacik.weatherapp

import com.louietkacik.weatherapp.module.NetworkModule
import com.tkacik.weatherapp.api.RepositoryWeather
import com.tkacik.weatherapp.util.UnitWeather
import io.reactivex.rxjava3.disposables.CompositeDisposable
import org.assertj.core.api.Assertions.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test
import java.util.concurrent.TimeUnit

class RepositoryWeatherTest {
    private val client = NetworkModule.provideClient()
    private val retrofit = NetworkModule.provideRetrofit(client)
    private val weatherApiService = NetworkModule.provideWeatherService(retrofit)

    private lateinit var weatherRepository: RepositoryWeather

    private val disposables = CompositeDisposable()

    @Before
    fun setUp() {
        //create a mock API
        weatherRepository = RepositoryWeather(
            weatherApiService
        )
    }

    @After
    fun tearDown() {
        disposables.clear()
    }

    @Test
    fun `getWeatherObservable returns valid WeatherResponse`() {
        disposables.add(

            weatherRepository.getWeather("New York", UnitWeather.IMPERIAL.name).test()
                .awaitDone(1000, TimeUnit.MILLISECONDS)
                .assertNoErrors()
                .assertComplete()
                .assertValueCount(1)
                .apply {
                    values().single().also { response ->
                        assertThat((response.city?.name)).isEqualTo("New York")
                        assertThat((response.list)).isNotEmpty
                    }
                }
        )
    }


}