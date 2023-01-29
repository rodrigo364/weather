package br.com.weather.presentation.Utils

fun String.toUrl() =  "http:$this"

fun String.tempCelsius(temp: Double)  = temp.toInt().toString()

