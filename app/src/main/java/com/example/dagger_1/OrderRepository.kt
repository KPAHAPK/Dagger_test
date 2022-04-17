package com.example.dagger_1

import com.example.dagger_1.di.Scopes
import javax.inject.Inject

@Scopes.AppScope
class OrderRepository @Inject constructor() {
}