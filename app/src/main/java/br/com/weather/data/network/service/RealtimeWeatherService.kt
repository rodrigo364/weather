package br.com.weather.data.network.service

import br.com.weather.data.network.dto.CurrentWeatherDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface RealtimeWeatherService {

    @GET("current.json?")
    suspend fun getCurrentRealTimeWeather(@Query("q") location: String, @Query("lang") lang: String = "pt" ): CurrentWeatherDTO
}