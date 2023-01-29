package br.com.weather.presentation.ui.realtime.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.weather.R
import br.com.weather.presentation.Utils.toUrl
import br.com.weather.presentation.ui.theme.WeatherTypography
import coil.compose.AsyncImage
import java.net.URLEncoder

@Composable
fun CurrentMaxAndMin(tempCelsius: String, conditionWeather: String, iconUrl : String) {
    Row(verticalAlignment = Alignment.CenterVertically) {


        Column(modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = stringResource(id = R.string.temp_in_celsius,tempCelsius),
                style = WeatherTypography.headlineLarge,
                fontSize = 64.sp,
                    modifier = Modifier.wrapContentSize()
                )
        }

        Column(modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = iconUrl.toUrl(),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(88.dp)
                    .clip(CircleShape)
            )
            Text(
                text = conditionWeather,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 3.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview
@Composable
fun MaxPreview(){
    CurrentMaxAndMin(
        tempCelsius = "25",
        conditionWeather = "Possibilidade de Chuva",
        iconUrl = "20"
    )
}