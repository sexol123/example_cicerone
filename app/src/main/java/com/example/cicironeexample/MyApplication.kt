package com.example.cicironeexample

import android.app.Application
import com.example.cicironeexample.di.appModule
import org.koin.android.ext.android.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        //start Koin
        startKoin(this, listOf(appModule))
    }
}