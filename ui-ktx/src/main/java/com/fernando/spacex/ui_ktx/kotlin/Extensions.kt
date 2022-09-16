package com.fernando.spacex.ui_ktx.kotlin

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

fun Long.toFormat(pattern: String): String {
    val format = SimpleDateFormat(pattern, Locale.getDefault())
    return format.format(Date(this * 1000))
}

fun String.toDate(pattern: String): Date? {
    return try {
        val formatter = SimpleDateFormat(pattern, Locale.getDefault())
        formatter.parse(this)
    } catch (ex: Exception) {
        null
    }
}

