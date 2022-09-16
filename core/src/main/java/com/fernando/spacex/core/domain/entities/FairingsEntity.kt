package com.fernando.spacex.core.domain.entities

data class FairingsEntity(
    val recovered: Boolean?=null,
    val recoveryAttempt: Boolean?=null,
    val reused: Boolean?=null,
    val ship: String?=null
)