package com.example.dagger_1.di

import javax.inject.Scope

class Scopes {
    @Scope
    @Retention(AnnotationRetention.RUNTIME)
    annotation class OrderScope
}