package com.example.koindependencyinjection.programing_simplified.di.component

import com.example.koindependencyinjection.programing_simplified.demo.Car
import com.example.koindependencyinjection.programing_simplified.demo.Engine
import com.example.koindependencyinjection.programing_simplified.demo.Wheel
import com.example.koindependencyinjection.programing_simplified.demo.interfaces.DemoMain
import com.example.koindependencyinjection.programing_simplified.demo.viewmodel.TestViewModel
import com.example.koindependencyinjection.programing_simplified.qualifier.User
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject

class Component : KoinComponent {

    //lazy
    val car: Car by inject()

    val engine:Engine by inject()
    val wheel: Wheel by inject()

    val demoMain:DemoMain by inject()

    val testViewModel:TestViewModel by inject()
    val user:User by inject()

    //eagrely
//    val car1: Car = get()


}