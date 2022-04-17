package com.example.dagger_1

import com.example.dagger_1.di.ServerApiFactory
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(
    private  val serverApiFactory: ServerApiFactory
) {
    var serverApi = serverApiFactory.create("dev1.server.com", "80")
}