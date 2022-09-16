package com.fernando.spacex.core.data.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LinksDto(
    @field:Json(name = "article_link") val articleLink: String?=null,
    @field:Json(name = "flickr_images") val flickrImages: List<String>?=null,
    @field:Json(name = "mission_patch") val missionPatch: String?=null,
    @field:Json(name = "mission_patch_small") val missionPatchSmall: String?=null,
    @field:Json(name = "presskit") val presSkit: String?=null,
    @field:Json(name = "reddit_campaign") val redditCampaign: String?=null,
    @field:Json(name = "reddit_launch") val redditLaunch: String?=null,
    @field:Json(name = "reddit_media") val redditMedia: String?=null,
    @field:Json(name = "reddit_recovery") val redditRecovery: String?=null,
    @field:Json(name = "video_link") val videoLink: String?=null,
    @field:Json(name = "wikipedia") val wikipedia: String?=null,
    @field:Json(name = "youtube_id") val youtubeId: String?=null
)