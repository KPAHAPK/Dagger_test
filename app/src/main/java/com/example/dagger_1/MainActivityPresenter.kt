package com.example.dagger_1

import android.app.Activity
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(
    val databaseHelper: DatabaseHelper,
    val networkUtils: NetworkUtils,
    activity: Activity
){
    fun postInit(){

    }
}