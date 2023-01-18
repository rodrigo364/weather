package br.com.weather;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = WeatherApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface WeatherApplication_GeneratedInjector {
  void injectWeatherApplication(WeatherApplication weatherApplication);
}
