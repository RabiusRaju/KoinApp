package com.tutorials.koinapp.container

import android.app.Application
import com.tutorials.koinapp.di.demoModule
import com.tutorials.koinapp.di.interfaceModule
import com.tutorials.koinapp.di.viewModelModule
import org.koin.core.context.startKoin

/**
 * Created by MD.Rabius sani raju on 7/4/22.
 */
class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(demoModule,interfaceModule, viewModelModule)
        }
    }
}