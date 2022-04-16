package com.example.dagger_1.di

import com.example.dagger_1.ConnectionManager
import com.example.dagger_1.DatabaseHelper
import com.example.dagger_1.NetworkUtils
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    @Provides
    fun provideNetworkUtils(connectionManager: ConnectionManager): NetworkUtils = NetworkUtils(connectionManager)

    @Provides
    fun provideConnectionManager() = ConnectionManager()

}