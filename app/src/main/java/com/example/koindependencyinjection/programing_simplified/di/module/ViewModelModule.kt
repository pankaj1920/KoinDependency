package com.example.koindependencyinjection.programing_simplified.di.module


import com.example.koindependencyinjection.MainViewModel
import com.example.koindependencyinjection.programing_simplified.demo.viewmodel.Test
import com.example.koindependencyinjection.programing_simplified.demo.viewmodel.TestImp
import com.example.koindependencyinjection.programing_simplified.demo.viewmodel.TestViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

val viewModuleModule = module {

    factory { TestImp ()} bind Test::class

    viewModel{
        TestViewModel(get())
    }
}