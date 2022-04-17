package com.example.dagger_1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger_1.di.MainComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainComponentBuilder: MainComponent.Builder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as App).appComponent
        val mainComponent = mainComponentBuilder.activity(this).build()
        val mainActivityPresenter = mainComponent.getMainActivityPresenter()
        mainActivityPresenter.postInit()
        mainComponent.getDataBaseHelper()
    }

}