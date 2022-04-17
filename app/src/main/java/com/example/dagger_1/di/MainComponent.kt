package com.example.dagger_1.di

import android.app.Activity
import com.example.dagger_1.DatabaseHelper
import com.example.dagger_1.MainActivityPresenter
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [MainModule::class])
interface MainComponent{
    fun getMainActivityPresenter(): MainActivityPresenter
    fun getDataBaseHelper(): DatabaseHelper//У саба нет storagemodule но он знает о DatabaseHelper

    @Subcomponent.Builder
    interface Builder{
        @BindsInstance fun activity(activity: Activity): Builder
        fun build(): MainComponent
    }
}