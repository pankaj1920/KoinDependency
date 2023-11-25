package com.example.koindependencyinjection.programing_simplified.di.container

import android.app.Application
import com.example.koindependencyinjection.programing_simplified.di.module.demoModule
import com.example.koindependencyinjection.programing_simplified.di.module.interfaceModule
import com.example.koindependencyinjection.programing_simplified.di.module.viewModuleModule
import com.example.koindependencyinjection.programing_simplified.qualifier.userModule
import org.koin.core.context.startKoin

class BaseApplication:Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(demoModule, interfaceModule, viewModuleModule,userModule)
        }
    }
}