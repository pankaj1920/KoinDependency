package com.example.koindependencyinjection.programing_simplified.qualifier

import org.koin.core.qualifier.named
import org.koin.dsl.module

class User(var fName: String, var lName: String) {
    fun getUser() {
        println("My name is $fName and last name is $lName")
    }
}

fun provideFirstName(): String = "Pankaj"
fun provideLastName(): String = "Bohra"

val userModule = module {

    factory(named("fName")) { provideFirstName() }
    factory(named("lName")) { provideLastName() }
    factory { User(get(named("fName")), get(named("lName"))) }

}