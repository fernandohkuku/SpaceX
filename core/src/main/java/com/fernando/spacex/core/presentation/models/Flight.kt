package com.fernando.spacex.core.presentation.models

import android.os.Parcelable
import com.fernando.spacex.ui_ktx.kotlin.toDate
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class Flight(
    val details: String? = null,
    val flightNumber: Int? = null,
    val isTentative: Boolean? = null,
    val lastDateUpdate: String? = null,
    val lastLlLaunchDate: String? = null,
    val lastLlUpdate: String? = null,
    val lastWikiLaunchDate: String? = null,
    val lastWikiRevision: String? = null,
    val lastWikiUpdate: String? = null,
    val launchDateLocal: String? = null,
    val launchDateSource: String? = null,
    val launchDateUnix: Int? = null,
    val launchDateUtc: String? = null,
    val launchSite: LaunchSite? = null,
    val launchSuccess: Boolean? = null,
    val launchWindow: Int? = null,
    val launchyear: String? = null,
    val links: Links? = null,
    val missionId: List<String>? = null,
    val missionName: String? = null,
    val rocket: Rocket? = null,
    val ships: List<String>? = null,
    val staticFireDateUnix: Int? = null,
    val staticFireDateUtc: String? = null,
    val tbd: Boolean? = null,
    val telemetry: Telemetry? = null,
    val tentativeMaxPrecision: String? = null,
    val upcoming: Boolean? = null
) : Parcelable {
    companion object {
        const val PATTERN = "yyyy-MM-dd'T'HH:mm:ss"
    }

    val updateDateAsString: String
        get() = lastDateUpdate?.toDate(PATTERN).toString()


}