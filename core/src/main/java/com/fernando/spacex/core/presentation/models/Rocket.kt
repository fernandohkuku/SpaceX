package com.fernando.spacex.core.presentation.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Rocket(
    val fairings: Fairings?=null,
    val firstStage: FirstStage?=null,
    val rocketId: String?=null,
    val rocketName: String?=null,
    val rocketType: String?=null,
):Parcelable