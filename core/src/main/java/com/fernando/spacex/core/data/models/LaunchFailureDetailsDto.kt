package com.fernando.spacex.core.data.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LaunchFailureDetailsDto(
    @field:Json(name = "altitude") val altitude: Int,
    @field:Json(name = "reason") val reason: String,
    @field:Json(name = "reason") val time: Int
)