package com.tkacik.weatherapp.view.fragments

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.tkacik.weatherapp.R
import com.tkacik.weatherapp.databinding.FragmentSearchWeatherBinding
import com.tkacik.weatherapp.model.WeatherContainer
import com.tkacik.weatherapp.util.DataStateWeather
import com.tkacik.weatherapp.view.MainActivity
import com.tkacik.weatherapp.viewmodel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchWeatherFragment : Fragment(R.layout.fragment_search_weather) {

    private lateinit var binding: FragmentSearchWeatherBinding
    private val weatherViewModel by viewModels<WeatherViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSearchWeatherBinding.bind(view).apply {
            weatherSearchBtn.setOnClickListener {
                val cityName = etSearch.text.toString()
                (requireActivity() as MainActivity).setTitle(cityName)
                weatherViewModel.loadWeatherList(cityName)
            }
        }

        weatherViewModel.dataStateWeatherLD.observe(viewLifecycleOwner) { state ->
            when (state) {
                is DataStateWeather.Success -> toggleSuccess(state.data)
                is DataStateWeather.Error -> toggleError(state.msg)
                is DataStateWeather.Loading -> toggleLoader(true)
                is DataStateWeather.Idle -> {

                }
            }
        }
    }

    private fun toggleSuccess(data: List<WeatherContainer>) = with(binding) {
        toggleLoader(false)
        findNavController().navigate(SearchWeatherFragmentDirections.goToList(data.toTypedArray()))
        weatherViewModel.resetState()
        weatherSearchBtn.isEnabled = true
    }

    private fun toggleError(msg: String) = with(binding) {
        toggleLoader(false)
        ilSearch.error = msg
        ilSearch.isErrorEnabled = true
        weatherSearchBtn.isEnabled = true
    }

    private fun toggleLoader(isLoading: Boolean) = with(binding) {
        loader.isVisible = isLoading
        ilSearch.isErrorEnabled = false
        weatherSearchBtn.isEnabled = false
    }
}
