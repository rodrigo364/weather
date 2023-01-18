package br.com.weather.domain.model

data class Current(

    val cloud: Int,
    val condition: Condition,
    val feelslikeC: Double,
    val feelslikeF: Double,
    val gustKph: Double,
    val gustMph: Double,
    val humidity: Int,
    val isDay: Int,
    val lastUpdated: String,
    val lastUpdatedEpoch: Int,
    val precipIn: Double,
    val precipMm: Double,
    val pressureIn: Double,
    val pressureMb: Int,
    val tempC: Double,
    val tempF: Double,
    val uv: Int,
    val visKm: Int,
    val visMiles: Int,
    val windDegree: Int,
    val windDir: String,
    val windKph: Double,
    val windMph: Double
)
