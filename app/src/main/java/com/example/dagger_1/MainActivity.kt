package com.example.dagger_1

import android.app.Application
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger_1.di.AppComponent
import com.example.dagger_1.di.DaggerAppComponent
import com.example.dagger_1.di.DaggerMainComponent
import com.example.dagger_1.di.MainComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as App).appComponent
        val mainComponent = DaggerMainComponent.builder()
            .appComponent(appComponent)
            .build()
    }

}