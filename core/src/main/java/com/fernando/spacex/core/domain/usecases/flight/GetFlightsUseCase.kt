package com.fernando.spacex.core.domain.usecases.flight

import com.fernando.spacex.core.domain.entities.FlightEntity
import com.fernando.spacex.core.domain.repositories.FlightRepository
import com.fernando.spacex.core.domain.usecases.base.UseCase
import kotlinx.coroutines.CoroutineDispatcher

class GetFlightsUseCase(
    private val repository: FlightRepository,
    background: CoroutineDispatcher
) : UseCase<List<FlightEntity>, Unit>(background) {
    override suspend fun run(input: Unit?): List<FlightEntity> =
        repository.getFlights().sortedByDescending { it.launchyear }
}