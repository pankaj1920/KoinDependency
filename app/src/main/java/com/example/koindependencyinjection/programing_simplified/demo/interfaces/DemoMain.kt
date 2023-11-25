package com.example.koindependencyinjection.programing_simplified.demo.interfaces

class DemoMain(private val demoOne:DemoOne,private val demoTwo: DemoTwo) {

    fun demo(){
        demoOne.getDemo()
        demoTwo.getDemoTwo()
    }
}