package com.example.dagger_1.di

import com.example.dagger_1.DatabaseHelper
import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @Provides
    fun providesDatabaseHelper(): DatabaseHelper {
        return DatabaseHelper()
    }
}