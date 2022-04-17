package com.example.dagger_1.di

import android.content.Context
import com.example.dagger_1.DatabaseHelper
import com.example.dagger_1.Repository
import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @Provides
    fun getDatabaseHelper(repository: Repository, context: Context) = DatabaseHelper(repository, context)

}
