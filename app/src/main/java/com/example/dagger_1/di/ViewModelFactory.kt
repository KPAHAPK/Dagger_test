package com.example.dagger_1.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dagger_1.DatabaseHelper
import com.example.dagger_1.NetworkUtils
import com.example.dagger_1.ViewModel1
import com.example.dagger_1.ViewModel2
import java.lang.IllegalArgumentException
import javax.inject.Inject

class ViewModelFactory @Inject constructor(
    val networkUtils: NetworkUtils,
    val databaseHelper: DatabaseHelper
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when(modelClass){
            ViewModel1::class.java ->ViewModel1(networkUtils)
            ViewModel2::class.java -> ViewModel2(databaseHelper)
            else -> throw IllegalArgumentException("Unknown ViewModel class")
        } as T
    }
}