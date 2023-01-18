package br.com.weather.domain.repository

import br.com.weather.data.network.dto.CurrentWeatherDTO

interface RealTimeWeatherRepository {
    suspend fun getCurrentWeather(local: String) : CurrentWeatherDTO
}