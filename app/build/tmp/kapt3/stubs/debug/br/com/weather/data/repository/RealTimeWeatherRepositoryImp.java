package br.com.weather.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lbr/com/weather/data/repository/RealTimeWeatherRepositoryImp;", "Lbr/com/weather/domain/repository/RealTimeWeatherRepository;", "service", "Lbr/com/weather/data/network/service/RealtimeWeatherService;", "(Lbr/com/weather/data/network/service/RealtimeWeatherService;)V", "getCurrentWeather", "Lbr/com/weather/data/network/dto/CurrentWeatherDTO;", "local", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RealTimeWeatherRepositoryImp implements br.com.weather.domain.repository.RealTimeWeatherRepository {
    private final br.com.weather.data.network.service.RealtimeWeatherService service = null;
    
    @javax.inject.Inject()
    public RealTimeWeatherRepositoryImp(@org.jetbrains.annotations.NotNull()
    br.com.weather.data.network.service.RealtimeWeatherService service) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCurrentWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String local, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super br.com.weather.data.network.dto.CurrentWeatherDTO> continuation) {
        return null;
    }
}