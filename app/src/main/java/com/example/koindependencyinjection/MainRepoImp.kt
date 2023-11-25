package com.example.koindependencyinjection

import android.util.Log
import com.example.koindependencyinjection.retrofit.MyApi

class MainRepoImp(
private val api :MyApi
):MainRepo {
    override fun doNetworkCall() {
//        api.callApi()
        Log.d("Hello","api call")
    }
}