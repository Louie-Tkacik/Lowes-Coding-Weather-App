package com.tkacik.weatherapp.view.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.tkacik.weatherapp.R
import com.tkacik.weatherapp.model.WeatherContainer
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class ListWeatherFragmentDirections private constructor() {
  private data class GoToDetail(
    public val weatherContainer: WeatherContainer
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.goToDetail

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(WeatherContainer::class.java)) {
        result.putParcelable("weatherContainer", this.weatherContainer as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(WeatherContainer::class.java)) {
        result.putSerializable("weatherContainer", this.weatherContainer as Serializable)
      } else {
        throw UnsupportedOperationException(WeatherContainer::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun goToDetail(weatherContainer: WeatherContainer): NavDirections =
        GoToDetail(weatherContainer)
  }
}
