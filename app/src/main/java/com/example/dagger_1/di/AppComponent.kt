package com.example.dagger_1.di

import com.example.dagger_1.MainActivity
import com.example.dagger_1.MainActivityPresenter
import com.example.dagger_1.NetworkUtils
import com.example.dagger_1.ServerApi
import dagger.Component
import dagger.Lazy
import javax.inject.Named
import javax.inject.Provider

@Component(modules = [
    StorageModule::class,
    NetworkModule::class,
    MainModule::class,
    ServerModule::class])
interface AppComponent {
    fun injectMainActivity(mainActivity: MainActivity)
    fun getMainActivityPresenter(): MainActivityPresenter
    fun getNetworkUtilsLazy(): Lazy<NetworkUtils>
    fun getNetworkUtilsProvider(): Provider<NetworkUtils>
    @ServerModule.Prod("1")
    fun getServerApiProd(): ServerApi
}