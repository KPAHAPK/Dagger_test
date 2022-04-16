package com.example.dagger_1

import android.util.Log
import com.example.dagger_1.di.ServerModule
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(
    val databaseHelper: DatabaseHelper,
    val networkUtils: NetworkUtils,
    @ServerModule.Dev val serverApi: ServerApi
){
    @Inject
    fun postInit(networkUtils: NetworkUtils){
        Log.d("VVVV", "MainActivityPresenter.postInit networkutils = ${networkUtils}")
    }
}