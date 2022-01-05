package com.tkacik.weatherapp.view.fragments

import android.os.Bundle
import androidx.navigation.NavDirections
import com.tkacik.weatherapp.R
import com.tkacik.weatherapp.model.WeatherContainer
import kotlin.Array
import kotlin.Int

public class SearchWeatherFragmentDirections private constructor() {
  private data class GoToList(
    public val weatherContainerList: Array<WeatherContainer>
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.goToList

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putParcelableArray("weatherContainerList", this.weatherContainerList)
      return result
    }
  }

  public companion object {
    public fun goToList(weatherContainerList: Array<WeatherContainer>): NavDirections =
        GoToList(weatherContainerList)
  }
}
