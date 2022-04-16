package com.example.dagger_1

import android.app.Application
import com.example.dagger_1.di.AppComponent
import com.example.dagger_1.di.AppModule
import com.example.dagger_1.di.DaggerAppComponent
import com.example.dagger_1.di.ServerModule

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .context(this)
            .serverModule(ServerModule())
            .buildAppComp()

    }
}