package com.tkacik.weatherapp

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.tkacik.weatherapp.api.RepositoryWeather
import com.tkacik.weatherapp.model.WeatherContainer
import com.tkacik.weatherapp.model.WeatherResponse
import com.tkacik.weatherapp.util.DataStateWeather
import com.tkacik.weatherapp.util.UnitWeather
import com.tkacik.weatherapp.viewmodel.WeatherViewModel
import io.mockk.every
import io.mockk.mockk
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.plugins.RxJavaPlugins
import io.reactivex.rxjava3.schedulers.Schedulers
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class WeatherViewModelTest {
    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()


    private val weatherRepository: RepositoryWeather = mockk()

    private val cityName: String = "New York"
    private val units: String = UnitWeather.IMPERIAL.name
    private val emptyWeatherContainerList: List<WeatherContainer> = emptyList()

    private lateinit var weatherViewModel: WeatherViewModel

    @Before
    fun setUp() {
        RxAndroidPlugins.setInitMainThreadSchedulerHandler { Schedulers.trampoline() }

        RxJavaPlugins.setIoSchedulerHandler { Schedulers.trampoline() }


        weatherViewModel = WeatherViewModel(weatherRepository)


        every { weatherRepository.getWeather(cityName, units) } returns Single.just(
            WeatherResponse(
                list = emptyWeatherContainerList
            )
        )
    }

    @Test
    fun `loadWeather with valid name returns WeatherResponse`() {
        weatherViewModel.loadWeatherList(cityName)
        weatherViewModel.dataStateWeatherLD.observeForever {}
        assertThat(weatherViewModel.dataStateWeatherLD.value).isInstanceOf(DataStateWeather.Success::class.java)

    }

    @Test
    fun `loadWeather with empty name returns error`() {
        every { weatherRepository.getWeather("", units) } returns Single.error(Throwable())

        weatherViewModel.loadWeatherList("")
        weatherViewModel.dataStateWeatherLD.observeForever {}
        assertThat(weatherViewModel.dataStateWeatherLD.value).isInstanceOf(DataStateWeather.Error::class.java)
    }

}