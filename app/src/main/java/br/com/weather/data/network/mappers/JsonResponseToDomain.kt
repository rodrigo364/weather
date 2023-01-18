package br.com.weather.data.network.mappers

import br.com.weather.data.network.dto.CurrentWeatherDTO
import br.com.weather.domain.model.Condition
import br.com.weather.domain.model.Current
import br.com.weather.domain.model.CurrentWeather
import br.com.weather.domain.model.Location

internal fun CurrentWeatherDTO.toDomain() : CurrentWeather {
    return CurrentWeather(this.current.toDomain(), this.location.toDomain())
}

internal fun CurrentWeatherDTO.CurrentDTO.toDomain() : Current {
    return Current(
        this.cloud,
        this.condition.toDomain(),
        this.feelslikeC,
        this.feelslikeF,
        this.gustKph,
        this.gustMph,
        this.humidity,
        this.isDay,
        this.lastUpdated,
        this.lastUpdatedEpoch,
        this.precipIn,
        this.precipMm,
        this.pressureIn,
        this.pressureMb,
        this.tempC,
        this.tempF,
        this.uv,
        this.visKm,
        this.visMiles,
        this.windDegree,
        this.windDir,
        this.windKph,
        this.windMph
        )
}

internal fun CurrentWeatherDTO.LocationDTO.toDomain() : Location{
    return Location(
        this.country,
        this.lat,
        this.localtime,
        this.localtimeEpoch,
        this.lon,
        this.name,
        this.region,
        this.tzId
    )
}

internal fun CurrentWeatherDTO.CurrentDTO.ConditionDTO.toDomain() : Condition {
    return Condition(
        this.code,
        this.icon,
        this.text
    )
}


