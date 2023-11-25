package com.example.koindependencyinjection.programing_simplified.demo.interfaces

class DemoImpl:DemoOne,DemoTwo {
    override fun getDemo() {
        println("This is Demo One Interfcae")
    }

    override fun getDemoTwo() {
        println("This is Demo Two Interfcae")
    }
}