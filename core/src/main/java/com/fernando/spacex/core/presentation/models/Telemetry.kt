package com.fernando.spacex.core.presentation.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Telemetry(
    val flightClub: String? = null
) : Parcelable {
}