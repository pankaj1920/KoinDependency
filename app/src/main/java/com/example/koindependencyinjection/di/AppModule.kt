package com.example.koindependencyinjection.di

import com.example.koindependencyinjection.MainRepo
import com.example.koindependencyinjection.MainRepoImp
import com.example.koindependencyinjection.MainViewModel
import com.example.koindependencyinjection.retrofit.MyApi
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val appModule = module {
    single {
        Retrofit.Builder()
            .baseUrl("http//my/url")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(MyApi::class.java)
    }

    single<MainRepo> {
        MainRepoImp(get())
    }
    /* If we use factory every time me instance will be create when we call MainRepoImp
        factory {
            MainRepoImp(get())
        }*/

    viewModel<MainViewModel> {
        MainViewModel(get())
    }
}