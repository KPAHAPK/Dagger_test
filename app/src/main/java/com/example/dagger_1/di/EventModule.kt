package com.example.dagger_1.di

import com.example.dagger_1.DatabaseHelper
import com.example.dagger_1.events.Analytics
import com.example.dagger_1.events.EventHandler
import com.example.dagger_1.events.Logger
import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoSet

@Module
class EventModule {

    @IntoSet
    @Provides
    fun providesAnalytics(): EventHandler = Analytics()

    @IntoSet
    @Provides
    fun providesLogger(): EventHandler = Logger()

    @ElementsIntoSet
    @Provides
    fun providesDatabaseHelperEventHandlers(databaseHelper: DatabaseHelper) : Set<EventHandler> =
        databaseHelper.getEventHandlers()
}