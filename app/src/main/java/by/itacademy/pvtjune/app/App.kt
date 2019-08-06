package by.itacademy.pvtjune.app

import android.app.Application
import android.util.Log

class App : Application() {

    companion object {
        @JvmStatic
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()

        instance = this

        Log.e("AAA", "App.create()")
    }
}