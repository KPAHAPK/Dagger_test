package com.example.dagger_1

import javax.inject.Inject

class NetworkUtils @Inject constructor(private val connectionManager: ConnectionManager) {
}