package com.example.dagger_1.di

import android.content.Context
import com.example.dagger_1.MainActivity
import com.example.dagger_1.MainActivityPresenter
import com.example.dagger_1.NetworkUtils
import com.example.dagger_1.events.EventHandler
import dagger.BindsInstance
import dagger.Component
import dagger.Lazy
import javax.inject.Provider

@Component(modules = [AppModule::class,
    EventModule::class])
interface AppComponent {

    @Component.Factory
    interface AppCompFactory {
        fun create(@BindsInstance context: Context): AppComponent
    }
    fun getMainComponent(): MainComponent
}