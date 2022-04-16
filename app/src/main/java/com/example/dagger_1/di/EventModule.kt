package com.example.dagger_1.di

import com.example.dagger_1.events.Analytics
import com.example.dagger_1.events.EventHandler
import com.example.dagger_1.events.Logger
import dagger.MapKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import javax.inject.Qualifier

@Module
class EventModule {

    enum class EventHandlerType {
        ANALYTICS, LOGGER
    }

    @MapKey
    @Retention(AnnotationRetention.RUNTIME)
    annotation class EvenHandlerKey(val value: EventHandlerType)

    @IntoMap
    @EvenHandlerKey(EventHandlerType.ANALYTICS)
    @Provides
    fun providesAnalytics(): EventHandler = Analytics()

    @IntoMap
    @EvenHandlerKey(EventHandlerType.LOGGER)
    @Provides
    fun providesLogger(): EventHandler = Logger()

}