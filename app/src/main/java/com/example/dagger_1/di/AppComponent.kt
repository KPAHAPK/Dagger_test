package com.example.dagger_1.di

import com.example.dagger_1.MainActivity
import com.example.dagger_1.MainActivityPresenter
import dagger.Component

@Component(modules = [
    StorageModule::class,
    NetworkModule::class,
    MainModule::class])
interface AppComponent {
    fun injectMainActivity(mainActivity: MainActivity)
    fun getMainActivityPresenter(): MainActivityPresenter
}