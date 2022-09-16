package com.fernando.spacex.core.data.models.envelope

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListEnvelope<T>(
    val data:List<T>
)