package com.example.dagger_1.events

import android.util.Log

class Logger : EventHandler {
    override fun handle(event: Event) {
        Log.d("VVVV", "Logger")
    }
}