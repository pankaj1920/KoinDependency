package com.example.koindependencyinjection.programing_simplified.demo.viewmodel

import androidx.lifecycle.ViewModel

class TestViewModel(
    private val test: Test
) : ViewModel() {

    fun getNewTest(){
        test.getTest()
    }
}