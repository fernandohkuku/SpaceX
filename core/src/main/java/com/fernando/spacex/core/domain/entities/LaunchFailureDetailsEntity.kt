package com.fernando.spacex.core.domain.entities


data class LaunchFailureDetailsEntity(
    val altitude: Int,
    val reason: String,
    val time: Int
) {
}