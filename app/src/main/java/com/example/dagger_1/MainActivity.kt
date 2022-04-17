package com.example.dagger_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as App).appComponent
        val mainComponent = appComponent.getMainComponent()
        val viewModelFactory = mainComponent.getViewModelFactory()
        val viewModel1 = ViewModelProvider(this, viewModelFactory).get(ViewModel1::class.java)
        val viewModel2 = ViewModelProvider(this, viewModelFactory).get(ViewModel2::class.java)
    }

}