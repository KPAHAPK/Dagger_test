package com.example.dagger_1.di

import android.app.Activity
import com.example.dagger_1.DatabaseHelper
import com.example.dagger_1.MainActivityPresenter
import com.example.dagger_1.NetworkUtils
import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @Provides
    fun provideMainActivityPresenter(
        databaseHelper: DatabaseHelper,
        networkUtils: NetworkUtils
    ) =
        MainActivityPresenter(databaseHelper, networkUtils)

}
