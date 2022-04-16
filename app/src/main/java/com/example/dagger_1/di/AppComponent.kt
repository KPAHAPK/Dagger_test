package com.example.dagger_1.di

import android.content.Context
import com.example.dagger_1.MainActivity
import com.example.dagger_1.MainActivityPresenter
import com.example.dagger_1.NetworkUtils
import com.example.dagger_1.ServerApi
import com.example.dagger_1.events.EventHandler
import dagger.BindsInstance
import dagger.Component
import dagger.Lazy
import javax.inject.Provider

@Component(modules = [AppModule::class,
    ServerModule::class,
    EventModule::class])
interface AppComponent {
    fun injectMainActivity(mainActivity: MainActivity)

    @Component.Factory
    interface AppCompFactory{
        fun create(@BindsInstance context: Context, serverModule: ServerModule): AppComponent
    }

    fun getMainActivityPresenter(): MainActivityPresenter
    fun getNetworkUtilsLazy(): Lazy<NetworkUtils>
    fun getNetworkUtilsProvider(): Provider<NetworkUtils>
    @ServerModule.Prod("1")
    fun getServerApiProd(): ServerApi
    fun getEventHandlers(): Map<EventModule.EventHandlerType, EventHandler>
}