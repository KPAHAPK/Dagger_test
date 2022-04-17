package com.example.dagger_1.di

import androidx.lifecycle.ViewModel
import com.example.dagger_1.DatabaseHelper
import com.example.dagger_1.NetworkUtils
import com.example.dagger_1.ViewModel1
import com.example.dagger_1.ViewModel2
import dagger.MapKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass

@Module
class ViewModelModule {

    @MapKey
    @Retention(AnnotationRetention.RUNTIME)
    annotation class ViewModelKey(val value: KClass<out ViewModel>)

    @IntoMap
    @ViewModelKey(ViewModel1::class)
    @Provides
    fun provideViewModel1(networkUtils: NetworkUtils): ViewModel {
        return ViewModel1(networkUtils)
    }

    @IntoMap
    @ViewModelKey(ViewModel2::class)
    @Provides
    fun provideViewModel2(databaseHelper: DatabaseHelper): ViewModel {
        return ViewModel2(databaseHelper)
    }

}