package com.tkacik.weatherapp.view.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.tkacik.weatherapp.R
import com.tkacik.weatherapp.adapter.AdapterWeather
import com.tkacik.weatherapp.databinding.FragmentWeatherListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListWeatherFragment : Fragment(R.layout.fragment_weather_list) {

    private val args by navArgs<ListWeatherFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        FragmentWeatherListBinding.bind(view).apply {
            rvWeather.adapter = AdapterWeather(args.weatherContainerList.toList()) {
                findNavController().navigate(ListWeatherFragmentDirections.goToDetail(it))
            }
        }
    }
}