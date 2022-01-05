package com.tkacik.weatherapp.view.fragments

import android.os.Bundle
import androidx.navigation.NavArgs
import com.tkacik.weatherapp.model.WeatherContainer
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ListWeatherFragmentArgs(
  public val weatherContainerList: Array<WeatherContainer>
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putParcelableArray("weatherContainerList", this.weatherContainerList)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun fromBundle(bundle: Bundle): ListWeatherFragmentArgs {
      bundle.setClassLoader(ListWeatherFragmentArgs::class.java.classLoader)
      val __weatherContainerList : Array<WeatherContainer>?
      if (bundle.containsKey("weatherContainerList")) {
        __weatherContainerList = bundle.getParcelableArray("weatherContainerList")?.map { it as
            WeatherContainer }?.toTypedArray()
        if (__weatherContainerList == null) {
          throw IllegalArgumentException("Argument \"weatherContainerList\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"weatherContainerList\" is missing and does not have an android:defaultValue")
      }
      return ListWeatherFragmentArgs(__weatherContainerList)
    }
  }
}
