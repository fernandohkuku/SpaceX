package com.fernando.spacex.core.data.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CoreDto(
    @field:Json(name = "block") val block: Int?=null,
    @field:Json(name = "core_serial") val core_serial: String?=null,
    @field:Json(name = "flight") val flight: Int?=null,
    @field:Json(name = "gridfins") val gridFins: Boolean?=null,
    @field:Json(name = "land_success") val landSuccess: Boolean?=null,
    @field:Json(name = "landing_intent") val landingIntent: Boolean?=null,
    @field:Json(name = "landing_type") val landingType: String?=null,
    @field:Json(name = "landing_vehicle") val landingVehicle: String?=null,
    @field:Json(name = "legs") val legs: Boolean?=null,
    @field:Json(name = "reused") val reused: Boolean?=null
)