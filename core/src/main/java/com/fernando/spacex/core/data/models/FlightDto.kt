package com.fernando.spacex.core.data.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FlightDto(
    @field:Json(name = "crew") val crew: List<Any>?=null,
    @field:Json(name = "details") val details: String?=null,
    @field:Json(name = "flight_number") val flightNumber: Int?=null,
    @field:Json(name = "is_tentative") val isTentative: Boolean?=null,
    @field:Json(name = "last_date_update") val lastDateUpdate: String?=null,
    @field:Json(name = "last_ll_launch_date") val lastLlLaunchDate: String?=null,
    @field:Json(name = "last_ll_update") val lastLlUpdate: String?=null,
    @field:Json(name = "last_wiki_launch_date") val lastWikiLaunchDate: String?=null,
    @field:Json(name = "last_wiki_revision") val lastWikiRevision: String?=null,
    @field:Json(name = "last_wiki_update") val lastWikiUpdate: String?=null,
    @field:Json(name = "launch_date_local") val launchDateLocal: String?=null,
    @field:Json(name = "launch_date_source") val launchDateSource: String?=null,
    @field:Json(name = "launch_date_unix") val launchDateUnix: Int?=null,
    @field:Json(name = "launch_date_utc") val launchDateUtc: String?=null,
    //@field:Json(name = "launch_failure_details") val launchFailureDetails: LaunchFailureDetailsDto?=null,
    @field:Json(name = "launch_site") val launchSite: LaunchSiteDto?=null,
    @field:Json(name = "launch_success") val launchSuccess: Boolean?=null,
    @field:Json(name = "launch_window") val launchWindow: Int?=null,
    @field:Json(name = "launch_year") val launchyear: String?=null,
    @field:Json(name = "links") val links: LinksDto?=null,
    @field:Json(name = "mission_id") val missionId: List<String>?=null,
    @field:Json(name = "mission_name") val missionName: String?=null,
    @field:Json(name = "rocket") val rocket: RocketDto?=null,
    @field:Json(name = "ships") val ships: List<String>?=null,
    @field:Json(name = "static_fire_date_unix") val staticFireDateUnix: Int?=null,
    @field:Json(name = "static_fire_date_utc") val staticFireDateUtc: String?=null,
    @field:Json(name = "tbd") val tbd: Boolean?=null,
    @field:Json(name = "telemetry") val telemetry: TelemetryDto?=null,
    @field:Json(name = "tentative_max_precision") val tentativeMaxPrecision: String?=null,
    @field:Json(name = "upcoming") val upcoming: Boolean?=null
)