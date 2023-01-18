package br.com.weather.presentation.ui.realtime

import br.com.weather.domain.model.CurrentWeather


data class CurrentWeatherState(
    val isLoading: Boolean = false,
    val current: CurrentWeather? = null,
    val error: String = ""
)