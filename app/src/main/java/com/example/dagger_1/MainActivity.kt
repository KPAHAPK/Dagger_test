package com.example.dagger_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.Lazy
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Provider

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseHelper: DatabaseHelper
    @Inject
    lateinit var networkUtils: NetworkUtils
    //Only one object
    private lateinit var networkUtilsLazy: Lazy<NetworkUtils>
    //Same as Lazy but each call = new Object
    private lateinit var networkUtilsProvider: Provider<NetworkUtils>
    //Named get/inject
    private lateinit var serverApi: ServerApi
    @Inject
    @Named("Prod")
    lateinit var serverApi2: ServerApi


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as App).appComponent
        appComponent.injectMainActivity(this)
        val mainActivityPresenter = appComponent.getMainActivityPresenter()
        networkUtilsLazy = appComponent.getNetworkUtilsLazy()
        val networkUtils = networkUtilsLazy.get()
        networkUtilsProvider = appComponent.getNetworkUtilsProvider()
        val networkUtils2 = networkUtilsProvider.get()
        serverApi = appComponent.getServerApiProd()
    }
}