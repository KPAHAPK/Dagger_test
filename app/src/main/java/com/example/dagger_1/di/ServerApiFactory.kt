package com.example.dagger_1.di

import com.example.dagger_1.ServerApi
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory

@AssistedFactory
interface ServerApiFactory {
    fun create(@Assisted("host") host: String, @Assisted("port") port: String = "80"): ServerApi
}