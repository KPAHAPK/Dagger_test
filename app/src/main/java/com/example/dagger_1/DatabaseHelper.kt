package com.example.dagger_1

import com.example.dagger_1.events.EventHandler

class DatabaseHelper(private val repository: Repository) {
    fun getEventHandlers(): Set<EventHandler> = setOf()
}