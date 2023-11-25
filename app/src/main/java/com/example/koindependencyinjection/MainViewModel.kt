package com.example.koindependencyinjection

import androidx.lifecycle.ViewModel

class MainViewModel(   private val repo: MainRepo):ViewModel() {


    fun doNetworkCall(){
        repo.doNetworkCall()
    }
}