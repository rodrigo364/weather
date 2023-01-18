package br.com.weather.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\bB\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00bd\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u001dJ\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\u0007H\u00c6\u0003J\t\u0010<\u001a\u00020\u0007H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0007H\u00c6\u0003J\t\u0010?\u001a\u00020\u0007H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0005H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u000eH\u00c6\u0003J\t\u0010F\u001a\u00020\u0007H\u00c6\u0003J\t\u0010G\u001a\u00020\u0007H\u00c6\u0003J\t\u0010H\u001a\u00020\u0007H\u00c6\u0003J\t\u0010I\u001a\u00020\u0007H\u00c6\u0003J\t\u0010J\u001a\u00020\u0007H\u00c6\u0003J\t\u0010K\u001a\u00020\u0007H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u000eH\u00c6\u0003J\u00ef\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010S\u001a\u00020\u0003H\u00d6\u0001J\t\u0010T\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0011\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0011\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\u0015\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0011\u0010\u001b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0011\u0010\u001c\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010#\u00a8\u0006U"}, d2 = {"Lbr/com/weather/domain/model/Current;", "", "cloud", "", "condition", "Lbr/com/weather/domain/model/Condition;", "feelslikeC", "", "feelslikeF", "gustKph", "gustMph", "humidity", "isDay", "lastUpdated", "", "lastUpdatedEpoch", "precipIn", "precipMm", "pressureIn", "pressureMb", "tempC", "tempF", "uv", "visKm", "visMiles", "windDegree", "windDir", "windKph", "windMph", "(ILbr/com/weather/domain/model/Condition;DDDDIILjava/lang/String;IDDDIDDIIIILjava/lang/String;DD)V", "getCloud", "()I", "getCondition", "()Lbr/com/weather/domain/model/Condition;", "getFeelslikeC", "()D", "getFeelslikeF", "getGustKph", "getGustMph", "getHumidity", "getLastUpdated", "()Ljava/lang/String;", "getLastUpdatedEpoch", "getPrecipIn", "getPrecipMm", "getPressureIn", "getPressureMb", "getTempC", "getTempF", "getUv", "getVisKm", "getVisMiles", "getWindDegree", "getWindDir", "getWindKph", "getWindMph", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Current {
    private final int cloud = 0;
    @org.jetbrains.annotations.NotNull()
    private final br.com.weather.domain.model.Condition condition = null;
    private final double feelslikeC = 0.0;
    private final double feelslikeF = 0.0;
    private final double gustKph = 0.0;
    private final double gustMph = 0.0;
    private final int humidity = 0;
    private final int isDay = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String lastUpdated = null;
    private final int lastUpdatedEpoch = 0;
    private final double precipIn = 0.0;
    private final double precipMm = 0.0;
    private final double pressureIn = 0.0;
    private final int pressureMb = 0;
    private final double tempC = 0.0;
    private final double tempF = 0.0;
    private final int uv = 0;
    private final int visKm = 0;
    private final int visMiles = 0;
    private final int windDegree = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String windDir = null;
    private final double windKph = 0.0;
    private final double windMph = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.weather.domain.model.Current copy(int cloud, @org.jetbrains.annotations.NotNull()
    br.com.weather.domain.model.Condition condition, double feelslikeC, double feelslikeF, double gustKph, double gustMph, int humidity, int isDay, @org.jetbrains.annotations.NotNull()
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
    
    public Current(int cloud, @org.jetbrains.annotations.NotNull()
    br.com.weather.domain.model.Condition condition, double feelslikeC, double feelslikeF, double gustKph, double gustMph, int humidity, int isDay, @org.jetbrains.annotations.NotNull()
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
    public final br.com.weather.domain.model.Condition component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.weather.domain.model.Condition getCondition() {
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
}