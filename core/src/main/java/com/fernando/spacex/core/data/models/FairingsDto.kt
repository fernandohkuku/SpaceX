package com.fernando.spacex.core.data.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FairingsDto(
    @field:Json(name = "recovered") val recovered: Boolean?=null,
    @field:Json(name = "recovery_attempt") val recoveryAttempt: Boolean?=null,
    @field:Json(name = "reused") val reused: Boolean?=null,
    @field:Json(name = "ship") val ship: String?=null
)