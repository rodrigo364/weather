package br.com.weather.presentation.ui.realtime.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.weather.domain.model.Location
import br.com.weather.presentation.ui.theme.WeatherTypography

@Composable
fun CurrentLocalWeather(location: Location) {
    Text(text = "${location.name}, ${location.region} ",
        style = WeatherTypography.bodyLarge,
        modifier = Modifier
            .padding(start = 21.dp, top = 21.dp)
    )
}