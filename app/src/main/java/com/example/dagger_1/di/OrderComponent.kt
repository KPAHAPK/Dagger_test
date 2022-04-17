package com.example.dagger_1.di

import com.example.dagger_1.OrderRepository
import dagger.Subcomponent

@Scopes.OrderScope
@Subcomponent(modules = [OrderModule::class])
interface OrderComponent {
    fun getOrderRepository(): OrderRepository
}