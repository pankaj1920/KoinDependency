package com.example.koindependencyinjection.programing_simplified

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.koindependencyinjection.R
import com.example.koindependencyinjection.programing_simplified.demo.Car
import com.example.koindependencyinjection.programing_simplified.di.component.Component
import org.koin.android.ext.android.inject

class SimplifiedCodingKoinDiActivity : AppCompatActivity() {

    private val component = Component()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simplified_coding_koin_di)

        component.car.getCar()

        component.demoMain.demo()
        component.testViewModel.getNewTest()
        component.user.fName = "Kamal"
        component.user.getUser()
    }
}