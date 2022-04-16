package com.example.dagger_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.Lazy
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseHelper: DatabaseHelper
    @Inject
    lateinit var networkUtils: NetworkUtils
    //Only one object
    private lateinit var networkUtilsLazy: Lazy<NetworkUtils>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as App).appComponent
        appComponent.injectMainActivity(this)
        val mainActivityPresenter = appComponent.getMainActivityPresenter()
        networkUtilsLazy = appComponent.getNetworkUtils()
        val networkUtils = networkUtilsLazy.get()
    }
}