package com.example.dagger_1

import android.app.Application
import com.example.dagger_1.di.AppComponent
import com.example.dagger_1.di.DaggerAppComponent

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()

    }
}