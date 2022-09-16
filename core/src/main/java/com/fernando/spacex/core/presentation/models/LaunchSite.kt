package com.fernando.spacex.core.presentation.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LaunchSite(
    val siteId: String,
    val siteName: String,
    val siteNameLong: String
) : Parcelable