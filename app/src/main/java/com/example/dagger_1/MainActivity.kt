package com.example.dagger_1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as App).appComponent
        val mainComponent = appComponent.getMainComponent()
        val mainActivityPresenter = mainComponent.getMainActivityPresenter()
        mainActivityPresenter.postInit()
        mainComponent.getDataBaseHelper()
    }

    @Inject
    fun postInit(networkUtils: NetworkUtils) {
        Log.d("VVVV", "MainActivity.postInit networkutils = ${networkUtils}")
    }

}