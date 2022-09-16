package com.fernando.spacex.core.domain.entities

import com.fernando.spacex.ui_ktx.kotlin.toFormat


data class FlightEntity(
    val crew: List<Any>?=null,
    val details: String?=null,
    val flightNumber: Int?=null,
    val isTentative: Boolean?=null,
    val lastDateUpdate: String?=null,
    val lastLlLaunchDate: String?=null,
    val lastLlUpdate: String?=null,
    val lastWikiLaunchDate: String?=null,
    val lastWikiRevision: String?=null,
    val lastWikiUpdate: String?=null,
    val launchDateLocal: String?=null,
    val launchDateSource: String?=null,
    val launchDateUnix: Int?=null,
    val launchDateUtc: String?=null,
    val launchSite: LaunchSiteEntity?=null,
    val launchSuccess: Boolean?=null,
    val launchWindow: Int?=null,
    val launchyear: String?=null,
    val links: LinksEntity?=null,
    val missionId: List<String>?=null,
    val missionName: String?=null,
    val rocket: RocketEntity?=null,
    val ships: List<String>?=null,
    val staticFireDateUnix: Int?=null,
    val staticFireDateUtc: String?=null,
    val tbd: Boolean?=null,
    val telemetry: TelemetryEntity?=null,
    val tentativeMaxPrecision: String?=null,
    val upcoming: Boolean?=null
){
    companion object {
        private const val DATE_PATTERN = "dd/MM/yyyy"
    }

    val launchDateUnixAsString: String?
        get() = launchDateUnix?.toLong()?.toFormat(DATE_PATTERN)

}