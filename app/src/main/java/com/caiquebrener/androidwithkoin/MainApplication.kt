package com.caiquebrener.androidwithkoin

import android.app.Application
import com.caiquebrener.androidwithkoin.di.Di
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MainApplication)
            modules(Di.appModule)
        }
    }
}