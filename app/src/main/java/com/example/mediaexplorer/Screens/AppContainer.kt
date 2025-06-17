package com.example.mediaexplorer.Screens

import android.app.Application
import com.example.mediaexplorer.data.AppContainer
import com.example.mediaexplorer.data.AppDataContainer

class MainActivity : Application() {

    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}