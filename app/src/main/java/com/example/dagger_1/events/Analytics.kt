package com.example.dagger_1.events

import android.util.Log

class Analytics : EventHandler {
    override fun handle(event: Event) {
        Log.d("VVVV", "Analytics")
    }
}