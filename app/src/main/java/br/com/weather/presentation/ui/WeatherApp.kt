package br.com.weather.presentation.ui

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.weather.BuildConfig
import br.com.weather.presentation.ui.realtime.CurrentWeatherState
import br.com.weather.presentation.ui.realtime.RealtimeCurrentWeatherScreen
import br.com.weather.presentation.ui.theme.WeatherTheme

@Composable
fun WeatherApp(){
    WeatherTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background) {

            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = Screen.RealtimeCurrentWeatherScreen.route
            ) {
                composable(
                    route = Screen.RealtimeCurrentWeatherScreen.route
                ) {
                    RealtimeCurrentWeatherScreen()
                }

            }
        }

    }
}


@Preview
@Composable
private fun WeatherAppPreview(){
    WeatherApp()
}