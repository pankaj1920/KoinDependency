package com.example.koindependencyinjection.programing_simplified.di.module

import com.example.koindependencyinjection.programing_simplified.demo.Car
import com.example.koindependencyinjection.programing_simplified.demo.Engine
import com.example.koindependencyinjection.programing_simplified.demo.Wheel
import com.example.koindependencyinjection.programing_simplified.demo.interfaces.DemoMain
import org.koin.dsl.module

val demoModule = module {

    factory { Car(get(), get()) }
    factory { Engine() }
    factory { Wheel() }

//    single { Car() }
}