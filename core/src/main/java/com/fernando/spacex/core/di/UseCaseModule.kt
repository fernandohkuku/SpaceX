package com.fernando.spacex.core.di

import com.fernando.spacex.core.domain.repositories.FlightRepository
import com.fernando.spacex.core.domain.usecases.flight.GetFlightsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    @Singleton
    fun provideGetFlightsUseCase(
        repository: FlightRepository,
        background: CoroutineDispatcher
    ) = GetFlightsUseCase(repository, background)
}