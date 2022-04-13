package com.example.dagger_1.di

import com.example.dagger_1.DatabaseHelper
import com.example.dagger_1.NetworkUtils
import dagger.Component

@Component(modules = [
    StorageModule::class,
    NetworkModule::class])
interface AppComponent {
    fun getDatabaseHelper(): DatabaseHelper
    fun getNetworkUtils(): NetworkUtils
}