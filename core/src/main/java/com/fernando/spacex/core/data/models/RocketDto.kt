package com.fernando.spacex.core.data.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RocketDto(
    @field:Json(name =  "fairings") val fairings: FairingsDto?=null,
    @field:Json(name =  "first_stage") val firstStage: FirstStageDto?=null,
    @field:Json(name =  "rocket_id") val rocketId: String?=null,
    @field:Json(name =  "rocket_name") val rocketName: String?=null,
    @field:Json(name =  "rocket_type") val rocketType: String?=null,
)