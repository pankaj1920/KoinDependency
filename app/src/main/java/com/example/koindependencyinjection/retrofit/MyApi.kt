package com.example.koindependencyinjection.retrofit

import retrofit2.http.GET

interface MyApi {

    @GET("my/endpoint")
    fun callApi()
}