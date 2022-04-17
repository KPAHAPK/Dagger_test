package com.example.dagger_1

import android.content.Context
import com.example.dagger_1.events.EventHandler
import javax.inject.Inject

class DatabaseHelper (private val repository: Repository, val context: Context) {
    fun getEventHandlers(): Set<EventHandler> = setOf()
}