package com.fernando.spacex.core.data.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TelemetryDto(
    @field:Json(name =  "flight_club") val flightClub: String?=null
)