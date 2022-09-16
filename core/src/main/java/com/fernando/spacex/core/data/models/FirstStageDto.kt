package com.fernando.spacex.core.data.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FirstStageDto(
    @field:Json(name = "cores") val cores: List<CoreDto>?=null
)