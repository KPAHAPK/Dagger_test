package com.example.dagger_1.di

import com.example.dagger_1.ServerApi
import dagger.assisted.AssistedFactory

@AssistedFactory
interface ServerApiFactory {
    fun create(host: String): ServerApi
}