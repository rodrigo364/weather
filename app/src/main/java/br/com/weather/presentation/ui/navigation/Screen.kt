package br.com.weather.presentation.ui.navigation


sealed class Screen(val route: String) {
    object RealtimeCurrentWeatherScreen: Screen("current")
}