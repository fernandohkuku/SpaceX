package com.fernando.spacex.core.data.remote.source

import com.fernando.spacex.core.data.models.FlightDto
import com.fernando.spacex.core.data.remote.api.SpaceXService
import com.fernando.spacex.core.data.repositories.FlightRemoteDataSource
import javax.inject.Inject

class FlightRemoteDataSourceImpl @Inject constructor(
    private val spaceXService: SpaceXService
) : FlightRemoteDataSource {
    override suspend fun getFlights(): List<FlightDto> =
        spaceXService.getFlights()
}