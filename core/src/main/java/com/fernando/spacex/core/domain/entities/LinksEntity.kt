package com.fernando.spacex.core.domain.entities


data class LinksEntity(
    val articleLink: String?=null,
    val flickrImages: List<String>?=null,
    val missionPatch: String?=null,
    val missionPatchSmall: String?=null,
    val presSkit: String?=null,
    val redditCampaign: String?=null,
    val redditLaunch: String?=null,
    val redditMedia: String?=null,
    val redditRecovery: String?=null,
    val videoLink: String?=null,
    val wikipedia: String?=null,
    val youtubeId: String?=null
) {
}