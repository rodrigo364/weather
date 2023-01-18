package br.com.weather.data.network.dto;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001e"}, d2 = {"Lbr/com/weather/data/network/dto/CurrentWeatherDTO;", "Landroid/os/Parcelable;", "current", "Lbr/com/weather/data/network/dto/CurrentWeatherDTO$CurrentDTO;", "location", "Lbr/com/weather/data/network/dto/CurrentWeatherDTO$LocationDTO;", "(Lbr/com/weather/data/network/dto/CurrentWeatherDTO$CurrentDTO;Lbr/com/weather/data/network/dto/CurrentWeatherDTO$LocationDTO;)V", "getCurrent", "()Lbr/com/weather/data/network/dto/CurrentWeatherDTO$CurrentDTO;", "getLocation", "()Lbr/com/weather/data/network/dto/CurrentWeatherDTO$LocationDTO;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CurrentDTO", "LocationDTO", "app_debug"})
public final class CurrentWeatherDTO implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "current")
    private final br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO current = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "location")
    private final br.com.weather.data.network.dto.CurrentWeatherDTO.LocationDTO location = null;
    public static final android.os.Parcelable.Creator<br.com.weather.data.network.dto.CurrentWeatherDTO> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.weather.data.network.dto.CurrentWeatherDTO copy(@org.jetbrains.annotations.NotNull()
    br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO current, @org.jetbrains.annotations.NotNull()
    br.com.weather.data.network.dto.CurrentWeatherDTO.LocationDTO location) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CurrentWeatherDTO(@org.jetbrains.annotations.NotNull()
    br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO current, @org.jetbrains.annotations.NotNull()
    br.com.weather.data.network.dto.CurrentWeatherDTO.LocationDTO location) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO getCurrent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.weather.data.network.dto.CurrentWeatherDTO.LocationDTO component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.weather.data.network.dto.CurrentWeatherDTO.LocationDTO getLocation() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<br.com.weather.data.network.dto.CurrentWeatherDTO> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final br.com.weather.data.network.dto.CurrentWeatherDTO createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final br.com.weather.data.network.dto.CurrentWeatherDTO[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\bC\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\\B\u00bd\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u001dJ\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\u0007H\u00c6\u0003J\t\u0010<\u001a\u00020\u0007H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0007H\u00c6\u0003J\t\u0010?\u001a\u00020\u0007H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0005H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u000eH\u00c6\u0003J\t\u0010F\u001a\u00020\u0007H\u00c6\u0003J\t\u0010G\u001a\u00020\u0007H\u00c6\u0003J\t\u0010H\u001a\u00020\u0007H\u00c6\u0003J\t\u0010I\u001a\u00020\u0007H\u00c6\u0003J\t\u0010J\u001a\u00020\u0007H\u00c6\u0003J\t\u0010K\u001a\u00020\u0007H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u000eH\u00c6\u0003J\u00ef\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u0007H\u00c6\u0001J\t\u0010P\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010TH\u00d6\u0003J\t\u0010U\u001a\u00020\u0003H\u00d6\u0001J\t\u0010V\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001fR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0016\u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0016\u0010\u0012\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0016\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0016\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0016\u0010\u001a\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0016\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0016\u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010#\u00a8\u0006]"}, d2 = {"Lbr/com/weather/data/network/dto/CurrentWeatherDTO$CurrentDTO;", "Landroid/os/Parcelable;", "cloud", "", "condition", "Lbr/com/weather/data/network/dto/CurrentWeatherDTO$CurrentDTO$ConditionDTO;", "feelslikeC", "", "feelslikeF", "gustKph", "gustMph", "humidity", "isDay", "lastUpdated", "", "lastUpdatedEpoch", "precipIn", "precipMm", "pressureIn", "pressureMb", "tempC", "tempF", "uv", "visKm", "visMiles", "windDegree", "windDir", "windKph", "windMph", "(ILbr/com/weather/data/network/dto/CurrentWeatherDTO$CurrentDTO$ConditionDTO;DDDDIILjava/lang/String;IDDDIDDIIIILjava/lang/String;DD)V", "getCloud", "()I", "getCondition", "()Lbr/com/weather/data/network/dto/CurrentWeatherDTO$CurrentDTO$ConditionDTO;", "getFeelslikeC", "()D", "getFeelslikeF", "getGustKph", "getGustMph", "getHumidity", "getLastUpdated", "()Ljava/lang/String;", "getLastUpdatedEpoch", "getPrecipIn", "getPrecipMm", "getPressureIn", "getPressureMb", "getTempC", "getTempF", "getUv", "getVisKm", "getVisMiles", "getWindDegree", "getWindDir", "getWindKph", "getWindMph", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ConditionDTO", "app_debug"})
    public static final class CurrentDTO implements android.os.Parcelable {
        @com.google.gson.annotations.SerializedName(value = "cloud")
        private final int cloud = 0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "condition")
        private final br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO.ConditionDTO condition = null;
        @com.google.gson.annotations.SerializedName(value = "feelslike_c")
        private final double feelslikeC = 0.0;
        @com.google.gson.annotations.SerializedName(value = "feelslike_f")
        private final double feelslikeF = 0.0;
        @com.google.gson.annotations.SerializedName(value = "gust_kph")
        private final double gustKph = 0.0;
        @com.google.gson.annotations.SerializedName(value = "gust_mph")
        private final double gustMph = 0.0;
        @com.google.gson.annotations.SerializedName(value = "humidity")
        private final int humidity = 0;
        @com.google.gson.annotations.SerializedName(value = "is_day")
        private final int isDay = 0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "last_updated")
        private final java.lang.String lastUpdated = null;
        @com.google.gson.annotations.SerializedName(value = "last_updated_epoch")
        private final int lastUpdatedEpoch = 0;
        @com.google.gson.annotations.SerializedName(value = "precip_in")
        private final double precipIn = 0.0;
        @com.google.gson.annotations.SerializedName(value = "precip_mm")
        private final double precipMm = 0.0;
        @com.google.gson.annotations.SerializedName(value = "pressure_in")
        private final double pressureIn = 0.0;
        @com.google.gson.annotations.SerializedName(value = "pressure_mb")
        private final int pressureMb = 0;
        @com.google.gson.annotations.SerializedName(value = "temp_c")
        private final double tempC = 0.0;
        @com.google.gson.annotations.SerializedName(value = "temp_f")
        private final double tempF = 0.0;
        @com.google.gson.annotations.SerializedName(value = "uv")
        private final int uv = 0;
        @com.google.gson.annotations.SerializedName(value = "vis_km")
        private final int visKm = 0;
        @com.google.gson.annotations.SerializedName(value = "vis_miles")
        private final int visMiles = 0;
        @com.google.gson.annotations.SerializedName(value = "wind_degree")
        private final int windDegree = 0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "wind_dir")
        private final java.lang.String windDir = null;
        @com.google.gson.annotations.SerializedName(value = "wind_kph")
        private final double windKph = 0.0;
        @com.google.gson.annotations.SerializedName(value = "wind_mph")
        private final double windMph = 0.0;
        public static final android.os.Parcelable.Creator<br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO copy(int cloud, @org.jetbrains.annotations.NotNull()
        br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO.ConditionDTO condition, double feelslikeC, double feelslikeF, double gustKph, double gustMph, int humidity, int isDay, @org.jetbrains.annotations.NotNull()
        java.lang.String lastUpdated, int lastUpdatedEpoch, double precipIn, double precipMm, double pressureIn, int pressureMb, double tempC, double tempF, int uv, int visKm, int visMiles, int windDegree, @org.jetbrains.annotations.NotNull()
        java.lang.String windDir, double windKph, double windMph) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public CurrentDTO(int cloud, @org.jetbrains.annotations.NotNull()
        br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO.ConditionDTO condition, double feelslikeC, double feelslikeF, double gustKph, double gustMph, int humidity, int isDay, @org.jetbrains.annotations.NotNull()
        java.lang.String lastUpdated, int lastUpdatedEpoch, double precipIn, double precipMm, double pressureIn, int pressureMb, double tempC, double tempF, int uv, int visKm, int visMiles, int windDegree, @org.jetbrains.annotations.NotNull()
        java.lang.String windDir, double windKph, double windMph) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getCloud() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO.ConditionDTO component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO.ConditionDTO getCondition() {
            return null;
        }
        
        public final double component3() {
            return 0.0;
        }
        
        public final double getFeelslikeC() {
            return 0.0;
        }
        
        public final double component4() {
            return 0.0;
        }
        
        public final double getFeelslikeF() {
            return 0.0;
        }
        
        public final double component5() {
            return 0.0;
        }
        
        public final double getGustKph() {
            return 0.0;
        }
        
        public final double component6() {
            return 0.0;
        }
        
        public final double getGustMph() {
            return 0.0;
        }
        
        public final int component7() {
            return 0;
        }
        
        public final int getHumidity() {
            return 0;
        }
        
        public final int component8() {
            return 0;
        }
        
        public final int isDay() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLastUpdated() {
            return null;
        }
        
        public final int component10() {
            return 0;
        }
        
        public final int getLastUpdatedEpoch() {
            return 0;
        }
        
        public final double component11() {
            return 0.0;
        }
        
        public final double getPrecipIn() {
            return 0.0;
        }
        
        public final double component12() {
            return 0.0;
        }
        
        public final double getPrecipMm() {
            return 0.0;
        }
        
        public final double component13() {
            return 0.0;
        }
        
        public final double getPressureIn() {
            return 0.0;
        }
        
        public final int component14() {
            return 0;
        }
        
        public final int getPressureMb() {
            return 0;
        }
        
        public final double component15() {
            return 0.0;
        }
        
        public final double getTempC() {
            return 0.0;
        }
        
        public final double component16() {
            return 0.0;
        }
        
        public final double getTempF() {
            return 0.0;
        }
        
        public final int component17() {
            return 0;
        }
        
        public final int getUv() {
            return 0;
        }
        
        public final int component18() {
            return 0;
        }
        
        public final int getVisKm() {
            return 0;
        }
        
        public final int component19() {
            return 0;
        }
        
        public final int getVisMiles() {
            return 0;
        }
        
        public final int component20() {
            return 0;
        }
        
        public final int getWindDegree() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component21() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWindDir() {
            return null;
        }
        
        public final double component22() {
            return 0.0;
        }
        
        public final double getWindKph() {
            return 0.0;
        }
        
        public final double component23() {
            return 0.0;
        }
        
        public final double getWindMph() {
            return 0.0;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO[] newArray(int size) {
                return null;
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lbr/com/weather/data/network/dto/CurrentWeatherDTO$CurrentDTO$ConditionDTO;", "Landroid/os/Parcelable;", "code", "", "icon", "", "text", "(ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "getIcon", "()Ljava/lang/String;", "getText", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
        public static final class ConditionDTO implements android.os.Parcelable {
            @com.google.gson.annotations.SerializedName(value = "code")
            private final int code = 0;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "icon")
            private final java.lang.String icon = null;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "text")
            private final java.lang.String text = null;
            public static final android.os.Parcelable.Creator<br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO.ConditionDTO> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO.ConditionDTO copy(int code, @org.jetbrains.annotations.NotNull()
            java.lang.String icon, @org.jetbrains.annotations.NotNull()
            java.lang.String text) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public ConditionDTO(int code, @org.jetbrains.annotations.NotNull()
            java.lang.String icon, @org.jetbrains.annotations.NotNull()
            java.lang.String text) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getIcon() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getText() {
                return null;
            }
            
            @java.lang.Override()
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override()
            public void writeToParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO.ConditionDTO> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO.ConditionDTO createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final br.com.weather.data.network.dto.CurrentWeatherDTO.CurrentDTO.ConditionDTO[] newArray(int size) {
                    return null;
                }
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\"\u001a\u00020\bH\u00d6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020\bH\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\bH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f\u00a8\u0006."}, d2 = {"Lbr/com/weather/data/network/dto/CurrentWeatherDTO$LocationDTO;", "Landroid/os/Parcelable;", "country", "", "lat", "", "localtime", "localtimeEpoch", "", "lon", "name", "region", "tzId", "(Ljava/lang/String;DLjava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "getLat", "()D", "getLocaltime", "getLocaltimeEpoch", "()I", "getLon", "getName", "getRegion", "getTzId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class LocationDTO implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "country")
        private final java.lang.String country = null;
        @com.google.gson.annotations.SerializedName(value = "lat")
        private final double lat = 0.0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "localtime")
        private final java.lang.String localtime = null;
        @com.google.gson.annotations.SerializedName(value = "localtime_epoch")
        private final int localtimeEpoch = 0;
        @com.google.gson.annotations.SerializedName(value = "lon")
        private final double lon = 0.0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "name")
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "region")
        private final java.lang.String region = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "tz_id")
        private final java.lang.String tzId = null;
        public static final android.os.Parcelable.Creator<br.com.weather.data.network.dto.CurrentWeatherDTO.LocationDTO> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.weather.data.network.dto.CurrentWeatherDTO.LocationDTO copy(@org.jetbrains.annotations.NotNull()
        java.lang.String country, double lat, @org.jetbrains.annotations.NotNull()
        java.lang.String localtime, int localtimeEpoch, double lon, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String region, @org.jetbrains.annotations.NotNull()
        java.lang.String tzId) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public LocationDTO(@org.jetbrains.annotations.NotNull()
        java.lang.String country, double lat, @org.jetbrains.annotations.NotNull()
        java.lang.String localtime, int localtimeEpoch, double lon, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String region, @org.jetbrains.annotations.NotNull()
        java.lang.String tzId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCountry() {
            return null;
        }
        
        public final double component2() {
            return 0.0;
        }
        
        public final double getLat() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLocaltime() {
            return null;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getLocaltimeEpoch() {
            return 0;
        }
        
        public final double component5() {
            return 0.0;
        }
        
        public final double getLon() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRegion() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTzId() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<br.com.weather.data.network.dto.CurrentWeatherDTO.LocationDTO> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final br.com.weather.data.network.dto.CurrentWeatherDTO.LocationDTO createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final br.com.weather.data.network.dto.CurrentWeatherDTO.LocationDTO[] newArray(int size) {
                return null;
            }
        }
    }
}