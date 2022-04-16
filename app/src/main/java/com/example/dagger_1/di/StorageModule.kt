package com.example.dagger_1.di

import com.example.dagger_1.DatabaseHelper
import com.example.dagger_1.Repository
import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @Provides
    fun providesDatabaseHelper(repository: Repository): DatabaseHelper = DatabaseHelper(repository)

    @Provides
    fun providesRepository(): Repository = Repository()
}