package br.com.weather.presentation.ui.realtime;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lbr/com/weather/presentation/ui/realtime/CurrentWeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "getCoinsUseCase", "Lbr/com/weather/domain/usecases/realtimeweather/GetCurrentRealTimeWeatherUseCase;", "(Lbr/com/weather/domain/usecases/realtimeweather/GetCurrentRealTimeWeatherUseCase;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lbr/com/weather/presentation/ui/realtime/CurrentWeatherState;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getRealTimeCurrent", "", "local", "", "app_debug"})
public final class CurrentWeatherViewModel extends androidx.lifecycle.ViewModel {
    private final br.com.weather.domain.usecases.realtimeweather.GetCurrentRealTimeWeatherUseCase getCoinsUseCase = null;
    private final androidx.compose.runtime.MutableState<br.com.weather.presentation.ui.realtime.CurrentWeatherState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<br.com.weather.presentation.ui.realtime.CurrentWeatherState> state = null;
    
    @javax.inject.Inject()
    public CurrentWeatherViewModel(@org.jetbrains.annotations.NotNull()
    br.com.weather.domain.usecases.realtimeweather.GetCurrentRealTimeWeatherUseCase getCoinsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<br.com.weather.presentation.ui.realtime.CurrentWeatherState> getState() {
        return null;
    }
    
    public final void getRealTimeCurrent(@org.jetbrains.annotations.NotNull()
    java.lang.String local) {
    }
}