package com.fernando.spacex.core.presentation.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Fairings(
    val recovered: Boolean? = null,
    val recoveryAttempt: Boolean? = null,
    val reused: Boolean? = null,
    val ship: String? = null
) : Parcelable