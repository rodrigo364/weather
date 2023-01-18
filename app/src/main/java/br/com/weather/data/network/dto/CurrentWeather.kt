package br.com.weather.data.network.dto


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
 data class CurrentWeatherDTO(
    @SerializedName("current")
    val current: CurrentDTO,
    @SerializedName("location")
    val location: LocationDTO
) : Parcelable {
    @Parcelize
     data class CurrentDTO(
        @SerializedName("cloud")
        val cloud: Int,
        @SerializedName("condition")
        val condition: ConditionDTO,
        @SerializedName("feelslike_c")
        val feelslikeC: Double,
        @SerializedName("feelslike_f")
        val feelslikeF: Double,
        @SerializedName("gust_kph")
        val gustKph: Double,
        @SerializedName("gust_mph")
        val gustMph: Double,
        @SerializedName("humidity")
        val humidity: Int,
        @SerializedName("is_day")
        val isDay: Int,
        @SerializedName("last_updated")
        val lastUpdated: String,
        @SerializedName("last_updated_epoch")
        val lastUpdatedEpoch: Int,
        @SerializedName("precip_in")
        val precipIn: Double,
        @SerializedName("precip_mm")
        val precipMm: Double,
        @SerializedName("pressure_in")
        val pressureIn: Double,
        @SerializedName("pressure_mb")
        val pressureMb: Int,
        @SerializedName("temp_c")
        val tempC: Double,
        @SerializedName("temp_f")
        val tempF: Double,
        @SerializedName("uv")
        val uv: Int,
        @SerializedName("vis_km")
        val visKm: Int,
        @SerializedName("vis_miles")
        val visMiles: Int,
        @SerializedName("wind_degree")
        val windDegree: Int,
        @SerializedName("wind_dir")
        val windDir: String,
        @SerializedName("wind_kph")
        val windKph: Double,
        @SerializedName("wind_mph")
        val windMph: Double
    ) : Parcelable {
        @Parcelize
         data class ConditionDTO(
            @SerializedName("code")
            val code: Int,
            @SerializedName("icon")
            val icon: String,
            @SerializedName("text")
            val text: String
        ) : Parcelable
    }

    @Parcelize
     data class LocationDTO(
        @SerializedName("country")
        val country: String,
        @SerializedName("lat")
        val lat: Double,
        @SerializedName("localtime")
        val localtime: String,
        @SerializedName("localtime_epoch")
        val localtimeEpoch: Int,
        @SerializedName("lon")
        val lon: Double,
        @SerializedName("name")
        val name: String,
        @SerializedName("region")
        val region: String,
        @SerializedName("tz_id")
        val tzId: String
    ) : Parcelable
}