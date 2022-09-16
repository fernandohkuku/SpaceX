package com.fernando.spacex.core.data.repositories

import com.fernando.spacex.core.data.mappers.toEntity
import com.fernando.spacex.core.data.models.FlightDto
import com.fernando.spacex.core.domain.entities.FlightEntity
import com.fernando.spacex.core.domain.repositories.FlightRepository
import javax.inject.Inject

internal class FlightRepositoryImpl @Inject constructor(
    private val remoteDataSource: FlightRemoteDataSource
) : FlightRepository {
    override suspend fun getFlights(): List<FlightEntity> =
        remoteDataSource.getFlights().map { it.toEntity() }
}

internal interface FlightRemoteDataSource {
    suspend fun getFlights(): List<FlightDto>
}