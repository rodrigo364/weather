package br.com.weather.presentation.ui


sealed class Screen(val route: String) {
    object RealtimeCurrentWeatherScreen: Screen("current")
}