package com.tkacik.weatherapp.view.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.tkacik.weatherapp.R
import com.tkacik.weatherapp.databinding.FragmentWeatherDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailWeatherFragment : Fragment(R.layout.fragment_weather_detail) {

    private val args by navArgs<DetailWeatherFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        FragmentWeatherDetailBinding.bind(view).apply {
            val weatherContainer = args.weatherContainer
            val na = root.context.getString(R.string.na)

            tvTemp.text = weatherContainer.main?.temp?.toString() ?: na
            tvTempDescription.text =
                "Feels Like: " + weatherContainer.main?.feelsLike?.toString() ?: na
            tvForecast.text = weatherContainer.weather?.firstOrNull()?.main ?: na
            tvForecastDescription.text = weatherContainer.weather?.firstOrNull()?.description ?: na

        }
    }
}
