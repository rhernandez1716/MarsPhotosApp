package me.rodolfohernandez.marsphotosapp

import android.app.Application
import me.rodolfohernandez.marsphotosapp.data.AppContainer
import me.rodolfohernandez.marsphotosapp.data.DefaultAppContainer

class MarsPhotosApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
