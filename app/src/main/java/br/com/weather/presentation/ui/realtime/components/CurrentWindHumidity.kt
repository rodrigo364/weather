package br.com.weather.presentation.ui.realtime.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.weather.R
import br.com.weather.presentation.ui.theme.WeatherTypography

@Composable
fun CurrentWindHumidity(humidity: String, windkph : String) {
    Row(horizontalArrangement =  Arrangement.Center, modifier = Modifier.padding(8.dp)) {
        Row(modifier = Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End

        ) {
            Column() {
                Image(
                    painter = painterResource(id = R.drawable.windy_wind_palm_icon),
                    contentDescription = "",
                    modifier = Modifier
                        .size(32.dp)
                )
                Spacer(modifier = Modifier.padding(8.dp))

                Image(
                    painter = painterResource(id = R.drawable.ic_humidity_weather_icon),
                    contentDescription = "",
                    modifier = Modifier
                        .size(32.dp)
                )
            }

            Column{
                Text(
                    text = "Vento",
                    style = WeatherTypography.bodyLarge,
                    modifier = Modifier
                        .padding(start = 8.dp)
                )
                Spacer(modifier = Modifier.padding(8.dp))
                Text(
                    text = "Umidade",
                    style = WeatherTypography.bodyLarge,
                    modifier = Modifier
                        .padding(start = 8.dp)
                )
            }

        }

        Row(modifier = Modifier
            .weight(1f)
            .padding(start = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally){
                Spacer(modifier = Modifier.padding(4.dp))
                Text(
                    text = "$windkph km/h",
                    style = WeatherTypography.bodyLarge,
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.padding(8.dp))

                Text(
                    text = "$humidity %",
                    style = WeatherTypography.bodyLarge,
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .align(Alignment.CenterHorizontally)
                )
            }

        }
    }
}