package com.tkacik.weatherapp.view.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.tkacik.weatherapp.model.WeatherContainer
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetailWeatherFragmentArgs(
  public val weatherContainer: WeatherContainer
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailWeatherFragmentArgs {
      bundle.setClassLoader(DetailWeatherFragmentArgs::class.java.classLoader)
      val __weatherContainer : WeatherContainer?
      if (bundle.containsKey("weatherContainer")) {
        if (Parcelable::class.java.isAssignableFrom(WeatherContainer::class.java) ||
            Serializable::class.java.isAssignableFrom(WeatherContainer::class.java)) {
          __weatherContainer = bundle.get("weatherContainer") as WeatherContainer?
        } else {
          throw UnsupportedOperationException(WeatherContainer::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__weatherContainer == null) {
          throw IllegalArgumentException("Argument \"weatherContainer\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"weatherContainer\" is missing and does not have an android:defaultValue")
      }
      return DetailWeatherFragmentArgs(__weatherContainer)
    }
  }
}
