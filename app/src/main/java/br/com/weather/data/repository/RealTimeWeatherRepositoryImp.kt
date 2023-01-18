package br.com.weather.data.repository

import br.com.weather.data.network.dto.CurrentWeatherDTO
import br.com.weather.data.network.service.RealtimeWeatherService
import br.com.weather.domain.model.CurrentWeather
import br.com.weather.domain.repository.RealTimeWeatherRepository
import javax.inject.Inject

class RealTimeWeatherRepositoryImp @Inject constructor(
    private val service: RealtimeWeatherService
) : RealTimeWeatherRepository {

    override suspend fun getCurrentWeather(local: String): CurrentWeatherDTO {
        return service.getCurrentRealTimeWeather(local)
    }

}