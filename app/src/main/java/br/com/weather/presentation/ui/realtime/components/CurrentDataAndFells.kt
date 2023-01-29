package br.com.weather.presentation.ui.realtime.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import br.com.weather.R
import br.com.weather.presentation.Utils.getDateMonthExtension
import br.com.weather.presentation.ui.theme.WeatherTypography

@Composable
fun CurrentDataAndFells(modifier: Modifier, datetime: String, fellLike: String) {
    Text(text = getDateMonthExtension(datetime) ,
        style = WeatherTypography.bodyLarge,
        modifier = modifier
            .padding(start = 21.dp, top = 21.dp)

    )
    Text(text = stringResource(id = R.string.feel_like_c,fellLike),
        style = WeatherTypography.bodyLarge,
        modifier = modifier
            .padding(start = 21.dp, top = 21.dp, bottom = 21.dp)

    )
}