package com.fernando.spacex.core.presentation.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Core(
    val block: Int? = null,
    val core_serial: String? = null,
    val flight: Int? = null,
    val gridFins: Boolean? = null,
    val landSuccess: Boolean? = null,
    val landingIntent: Boolean? = null,
    val landingType: String? = null,
    val landingVehicle: String? = null,
    val legs: Boolean? = null,
    val reused: Boolean? = null
) : Parcelable