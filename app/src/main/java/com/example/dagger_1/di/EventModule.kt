package com.example.dagger_1.di

import com.example.dagger_1.events.Analytics
import com.example.dagger_1.events.EventHandler
import com.example.dagger_1.events.Logger
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
class EventModule {

    @IntoMap
    @StringKey("analytics")
    @Provides
    fun providesAnalytics(): EventHandler = Analytics()

    @IntoMap
    @StringKey("logger")
    @Provides
    fun providesLogger(): EventHandler = Logger()

}