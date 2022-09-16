package com.fernando.spacex.core.data.remote.api

import com.fernando.spacex.core.data.models.FlightDto
import com.fernando.spacex.core.data.models.envelope.ListEnvelope
import retrofit2.http.GET

interface SpaceXService {

    companion object {
        const val VERSION = "v3"
    }

    @GET("${VERSION}/launches")
    suspend fun getFlights(): List<FlightDto>
}