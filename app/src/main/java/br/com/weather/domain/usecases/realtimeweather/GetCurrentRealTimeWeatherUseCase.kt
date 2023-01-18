package br.com.weather.domain.usecases.realtimeweather

import br.com.core.network.Resource
import br.com.weather.data.network.mappers.toDomain
import br.com.weather.domain.model.CurrentWeather
import br.com.weather.domain.repository.RealTimeWeatherRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCurrentRealTimeWeatherUseCase @Inject constructor(
    private val repository: RealTimeWeatherRepository
) {
    operator fun invoke(local: String): Flow<Resource<CurrentWeather>> = flow {
        try {
            emit(Resource.Loading<CurrentWeather>())
            val coin = repository.getCurrentWeather(local).toDomain()
            emit(Resource.Success<CurrentWeather>(coin))
        } catch(e: HttpException) {
            emit(Resource.Error<CurrentWeather>(e.localizedMessage ?: "An unexpected error occured"))
        } catch(e: IOException) {
            emit(Resource.Error<CurrentWeather>("Couldn't reach server. Check your internet connection."))
        }
    }
}