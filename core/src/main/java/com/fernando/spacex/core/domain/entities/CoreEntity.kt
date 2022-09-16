package com.fernando.spacex.core.domain.entities

data class CoreEntity(
    val block: Int?=null,
    val core_serial: String?=null,
    val flight: Int?=null,
    val gridFins: Boolean?=null,
    val landSuccess: Boolean?=null,
    val landingIntent: Boolean?=null,
    val landingType: String?=null,
    val landingVehicle: String?=null,
    val legs: Boolean?=null,
    val reused: Boolean?=null
)