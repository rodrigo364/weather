package br.com.weather.presentation.ui.realtime

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import br.com.weather.presentation.ui.components.SearchBar

@Composable
fun  CurrentWeatherScreen(
    viewModel: CurrentWeatherViewModel = hiltViewModel()
) {
Column() {
    SearchBar(query = TextFieldValue(""),
        onQueryChange = { })

    val state = viewModel.state.value

    state.current?.let {
        Text(text = it.current.condition.icon)
    }


    if(state.error.isNotBlank()) {
        Text(
            text = state.error,
            color = MaterialTheme.colorScheme.error,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        )
    }
}
}
