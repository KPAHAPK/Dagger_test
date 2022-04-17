package com.example.dagger_1.di

import android.app.Activity
import com.example.dagger_1.MainActivityPresenter
import dagger.BindsInstance
import dagger.Component

@Component(modules = [MainModule::class], dependencies = [AppComponent::class])
interface MainComponent{

    fun getMainActivityPresenter(): MainActivityPresenter
}