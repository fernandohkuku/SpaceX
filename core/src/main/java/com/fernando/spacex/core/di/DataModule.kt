package com.fernando.spacex.core.di

import com.fernando.spacex.core.data.remote.source.FlightRemoteDataSourceImpl
import com.fernando.spacex.core.data.repositories.FlightRemoteDataSource
import com.fernando.spacex.core.data.repositories.FlightRepositoryImpl
import com.fernando.spacex.core.domain.repositories.FlightRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    internal abstract fun provideFlightRepository(
        repositoryImpl: FlightRepositoryImpl
    ): FlightRepository

    @Binds
    internal abstract fun provideFlightRemoteDataSource(
        remoteDataSourceImpl: FlightRemoteDataSourceImpl
    ):FlightRemoteDataSource

}