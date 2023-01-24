package br.com.weather.presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.weather.R


@Composable
fun SearchBar(
    query: TextFieldValue,
    onQueryChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("") }


    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 24.dp, bottom = 16.dp, start = 16.dp, end = 16.dp)
            .background(MaterialTheme.colorScheme.surfaceVariant, CircleShape),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = stringResource(id = R.string.search),
            modifier = Modifier.padding(start = 16.dp),
            tint = MaterialTheme.colorScheme.outline
        )
        BasicTextField(
            value = query,
            onValueChange = onQueryChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .background(MaterialTheme.colorScheme.surfaceVariant)
        )
    }
}


@Preview
@Composable
fun JetchatAppBarPreview() {
    SearchBar( query = TextFieldValue(""),
        onQueryChange = { },)
}

