package com.example.dagger_1

import com.example.dagger_1.events.EventHandler
import javax.inject.Inject

class DatabaseHelper @Inject constructor(private val repository: Repository) {
    fun getEventHandlers(): Set<EventHandler> = setOf()
}