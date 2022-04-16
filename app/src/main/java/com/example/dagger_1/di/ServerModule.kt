package com.example.dagger_1.di

import com.example.dagger_1.ServerApi
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ServerModule {

    @Named("Prod")
    @Provides
    fun provideServerApiProd(): ServerApi = ServerApi("prod.server.com")

    @Named("Dev")
    @Provides
    fun provideServerApiDev(): ServerApi = ServerApi("dev.server.com")
}