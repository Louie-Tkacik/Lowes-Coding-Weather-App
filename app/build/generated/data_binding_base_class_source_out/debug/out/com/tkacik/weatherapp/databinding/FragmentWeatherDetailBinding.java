// Generated by view binder compiler. Do not edit!
package com.tkacik.weatherapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textview.MaterialTextView;
import com.tkacik.weatherapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentWeatherDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline glCenter;

  @NonNull
  public final MaterialTextView tvForecast;

  @NonNull
  public final MaterialTextView tvForecastDescription;

  @NonNull
  public final MaterialTextView tvTemp;

  @NonNull
  public final MaterialTextView tvTempDescription;

  private FragmentWeatherDetailBinding(@NonNull ConstraintLayout rootView,
      @NonNull Guideline glCenter, @NonNull MaterialTextView tvForecast,
      @NonNull MaterialTextView tvForecastDescription, @NonNull MaterialTextView tvTemp,
      @NonNull MaterialTextView tvTempDescription) {
    this.rootView = rootView;
    this.glCenter = glCenter;
    this.tvForecast = tvForecast;
    this.tvForecastDescription = tvForecastDescription;
    this.tvTemp = tvTemp;
    this.tvTempDescription = tvTempDescription;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWeatherDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWeatherDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_weather_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWeatherDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.gl_center;
      Guideline glCenter = rootView.findViewById(id);
      if (glCenter == null) {
        break missingId;
      }

      id = R.id.tv_forecast;
      MaterialTextView tvForecast = rootView.findViewById(id);
      if (tvForecast == null) {
        break missingId;
      }

      id = R.id.tv_forecast_description;
      MaterialTextView tvForecastDescription = rootView.findViewById(id);
      if (tvForecastDescription == null) {
        break missingId;
      }

      id = R.id.tv_temp;
      MaterialTextView tvTemp = rootView.findViewById(id);
      if (tvTemp == null) {
        break missingId;
      }

      id = R.id.tv_temp_description;
      MaterialTextView tvTempDescription = rootView.findViewById(id);
      if (tvTempDescription == null) {
        break missingId;
      }

      return new FragmentWeatherDetailBinding((ConstraintLayout) rootView, glCenter, tvForecast,
          tvForecastDescription, tvTemp, tvTempDescription);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}