package br.com.weather.presentation.ui.realtime

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
//import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.weather.domain.model.CurrentWeather
import br.com.weather.presentation.Utils.tempCelsius
import br.com.weather.presentation.ui.realtime.components.CurrentDataAndFells
import br.com.weather.presentation.ui.realtime.components.CurrentLocalWeather
import br.com.weather.presentation.ui.realtime.components.CurrentMaxAndMin
import br.com.weather.presentation.ui.realtime.components.CurrentWindHumidity

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CurrentWeatherDetails(currentWeather: CurrentWeather) {

        Card(
            modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            Surface(
                color = MaterialTheme.colorScheme.primaryContainer
            ) {

                Column() {

                    CurrentLocalWeather(currentWeather.location)
                    CurrentMaxAndMin(
                        tempCelsius = String().tempCelsius(currentWeather.current.tempC),
                        conditionWeather = currentWeather.current.condition.text,
                        iconUrl = currentWeather.current.condition.icon
                    )
                    CurrentDataAndFells(Modifier.align(Alignment.CenterHorizontally),
                        currentWeather.location.localtime,
                   String().tempCelsius(currentWeather.current.feelslikeC)
                        )
                    CurrentWindHumidity(
                        currentWeather.current.humidity.toString(),
                        currentWeather.current.windKph.toInt().toString()
                    )

                }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CurrentWeatherDetailsPreview(){
//    CurrentWeatherDetails(CurrentWeather())
}


