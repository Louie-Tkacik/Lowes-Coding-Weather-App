// Generated by Dagger (https://dagger.dev).
package com.louietkacik.weatherapp.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideClientFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return provideClient();
  }

  public static NetworkModule_ProvideClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient provideClient() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideClient());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideClientFactory INSTANCE = new NetworkModule_ProvideClientFactory();
  }
}