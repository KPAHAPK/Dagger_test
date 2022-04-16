package com.example.dagger_1.di

import android.content.Context
import android.content.SharedPreferences
import android.content.res.Resources
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun getSPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences("prefs", Context.MODE_PRIVATE)
    }

    @Provides
    fun getResources(context: Context): Resources{
        return context.resources
    }
}