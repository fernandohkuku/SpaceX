package com.fernando.spacex.core.domain.repositories

import com.fernando.spacex.core.data.models.FlightDto
import com.fernando.spacex.core.domain.entities.FlightEntity

interface FlightRepository {
    suspend fun getFlights():List<FlightEntity>
}