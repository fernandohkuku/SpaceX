package com.fernando.spacex.core.domain.entities


data class RocketEntity(
    val fairings: FairingsEntity?=null,
    val firstStage: FirstStageEntity?=null,
    val rocketId: String?=null,
    val rocketName: String?=null,
    val rocketType: String?=null,
)