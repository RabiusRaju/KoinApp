package com.tutorials.koinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tutorials.koinapp.container.Component
import com.tutorials.koinapp.demo.Car
import org.koin.java.KoinJavaComponent.inject

class MainActivity : AppCompatActivity() {

    private val component = Component()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //component.car.getCar()
        //component.main.getDemo()
        component.mainViewModel.getTest()

    }
}