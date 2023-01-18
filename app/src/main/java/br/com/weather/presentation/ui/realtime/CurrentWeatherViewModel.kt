package br.com.weather.presentation.ui.realtime

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.core.network.Resource
import br.com.weather.domain.usecases.realtimeweather.GetCurrentRealTimeWeatherUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject


@HiltViewModel
class CurrentWeatherViewModel @Inject constructor(
    private val getCoinsUseCase: GetCurrentRealTimeWeatherUseCase
) : ViewModel() {

    private val _state = mutableStateOf(CurrentWeatherState())
    val state: State<CurrentWeatherState> = _state


    init {
        getRealTimeCurrent("Ipatinga")
    }


    fun getRealTimeCurrent(local:String) {
        getCoinsUseCase(local).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = CurrentWeatherState(current = result.data)
                }
                is Resource.Error -> {
                    _state.value = CurrentWeatherState(
                        error = result.message ?: "An unexpected error occured"
                    )
                }
                is Resource.Loading -> {
                    _state.value = CurrentWeatherState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}