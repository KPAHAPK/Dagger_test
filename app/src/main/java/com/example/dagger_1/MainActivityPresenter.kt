package com.example.dagger_1

import javax.inject.Inject

class MainActivityPresenter @Inject constructor(
    val databaseHelper: DatabaseHelper,
    val networkUtils: NetworkUtils
) {
}