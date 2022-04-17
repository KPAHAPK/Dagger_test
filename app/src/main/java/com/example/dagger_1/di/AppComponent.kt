package com.example.dagger_1.di

import android.content.Context
import com.example.dagger_1.DatabaseHelper
import com.example.dagger_1.MainActivity
import dagger.BindsInstance
import dagger.Component

@Scopes.AppScope
@Component(modules = [AppModule::class,
    EventModule::class,
    StorageModule::class])
interface AppComponent {
    @Component.Factory
    interface AppCompFactory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun getMainComponent(): MainComponent
    fun getDatabaseHelper(): DatabaseHelper
    fun getOrderComponent(): OrderComponent
}