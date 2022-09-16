package com.fernando.spacex.core.di

import com.fernando.spacex.core.data.remote.api.SpaceXService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {

    @Provides
    @Singleton
    fun provideSpaceXService(retrofit: Retrofit): SpaceXService =
        retrofit.create(SpaceXService::class.java)

}