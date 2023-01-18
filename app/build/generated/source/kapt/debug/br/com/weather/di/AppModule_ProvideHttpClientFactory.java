// Generated by Dagger (https://dagger.dev).
package br.com.weather.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideHttpClientFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return provideHttpClient();
  }

  public static AppModule_ProvideHttpClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient provideHttpClient() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideHttpClient());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideHttpClientFactory INSTANCE = new AppModule_ProvideHttpClientFactory();
  }
}