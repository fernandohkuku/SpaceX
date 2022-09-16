package com.fernando.spacex.core.presentation.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FirstStage(
    val cores: List<Core>? = null
) : Parcelable