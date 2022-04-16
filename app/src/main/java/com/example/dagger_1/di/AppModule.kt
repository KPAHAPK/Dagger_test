package com.example.dagger_1.di

import android.content.Context
import android.content.SharedPreferences
import android.content.res.Resources
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val context: Context) {

    @Provides
    fun getAppContext(): Context = context

    @Provides
    fun getSPreferences(): SharedPreferences {
        return context.getSharedPreferences("prefs", Context.MODE_PRIVATE)
    }

    @Provides
    fun getResources(): Resources{
        return context.resources
    }
}