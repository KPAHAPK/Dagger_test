package com.example.dagger_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger_1.di.OrderComponent

class OrderActivity : AppCompatActivity() {

    lateinit var orderComponent: OrderComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val orderComponent = (application as App).appComponent.getOrderComponent()
        val orderRepository = orderComponent.getOrderRepository()
    }
}