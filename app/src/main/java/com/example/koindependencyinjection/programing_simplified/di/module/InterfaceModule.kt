package com.example.koindependencyinjection.programing_simplified.di.module

import com.example.koindependencyinjection.programing_simplified.demo.interfaces.DemoImpl
import com.example.koindependencyinjection.programing_simplified.demo.interfaces.DemoMain
import com.example.koindependencyinjection.programing_simplified.demo.interfaces.DemoOne
import com.example.koindependencyinjection.programing_simplified.demo.interfaces.DemoTwo
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

val interfaceModule = module {

//    factory { DemoImpl() as DemoOne }
//    factory<DemoOne> { DemoImpl() }

//    factory{ DemoImpl() } bind DemoOne::class
    factory{ DemoImpl() } binds arrayOf(DemoOne::class,DemoTwo::class)

    factory { DemoMain(get(),get()) }
}