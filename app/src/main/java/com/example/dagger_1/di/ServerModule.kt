package com.example.dagger_1.di

import com.example.dagger_1.ServerApi
import dagger.Module
import dagger.Provides
import javax.inject.Qualifier

@Module
class ServerModule {
    @Qualifier
    @Retention(AnnotationRetention.RUNTIME)
    annotation class Prod(val value: String = "prod1.server.com")

    @Qualifier
    @Retention(AnnotationRetention.RUNTIME)
    annotation class Dev

    @Prod("1")
    @Provides
    fun provideServerApiProd1(): ServerApi = ServerApi("prod1.server.com")

    @Prod("2")
    @Provides
    fun provideServerApiProd2(): ServerApi = ServerApi("prod2.server.com")

    @Dev
    @Provides
    fun provideServerApiDev(): ServerApi = ServerApi("dev.server.com")
}