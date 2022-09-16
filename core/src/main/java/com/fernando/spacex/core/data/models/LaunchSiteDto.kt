package com.fernando.spacex.core.data.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LaunchSiteDto(
    @field:Json(name = "site_id") val siteId: String,
    @field:Json(name = "site_name") val siteName: String,
    @field:Json(name = "site_name_long") val siteNameLong: String
)