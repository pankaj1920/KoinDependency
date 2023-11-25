package com.example.koindependencyinjection.programing_simplified.demo

class Car(private val engine: Engine,private val wheel: Wheel) {

    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        println("Car is runnig")
    }
}