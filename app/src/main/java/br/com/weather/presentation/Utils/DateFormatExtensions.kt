package br.com.weather.presentation.Utils

import java.text.SimpleDateFormat
import java.util.*

fun getDateMonthExtension(date: String) : String {

    val dateFormatyyyyMMddHH = SimpleDateFormat(
        "yyyy-MM-dd", Locale.ENGLISH
    )

    val dateFormatExtensive = SimpleDateFormat(
        "dd 'de' MMMM 'de' yyyy",Locale("pt","BR")
    )
    val dateR = dateFormatyyyyMMddHH.parse(date)

    return dateFormatExtensive.format(dateR)
}