package com.example.dagger_1.di

import com.example.dagger_1.ServerApi
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Qualifier

@Module
class ServerModule {

    @Qualifier
    @Retention(AnnotationRetention.RUNTIME)
    annotation class Prod

    @Qualifier
    @Retention(AnnotationRetention.RUNTIME)
    annotation class Dev


    @Prod
    @Provides
    fun provideServerApiProd(): ServerApi = ServerApi("prod.server.com")

    @Dev
    @Provides
    fun provideServerApiDev(): ServerApi = ServerApi("dev.server.com")
}