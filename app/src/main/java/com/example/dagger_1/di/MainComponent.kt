package com.example.dagger_1.di

import com.example.dagger_1.MainActivityPresenter
import dagger.Subcomponent

@Subcomponent(modules = [MainModule::class])
interface MainComponent {

    fun getMainActivityPresenter(): MainActivityPresenter
    fun getViewModelFactory(): ViewModelFactory
}