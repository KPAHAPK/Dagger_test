package com.example.dagger_1.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component(modules = [AppModule::class,
    EventModule::class,
    StorageModule::class])
interface AppComponent {

    @Component.Factory
    interface AppCompFactory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun getMainComponentBuilder(): MainComponent.Builder
}