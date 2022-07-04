package com.tutorials.koinapp.di

import com.tutorials.koinapp.demo.Car
import com.tutorials.koinapp.demo.Engine
import com.tutorials.koinapp.demo.Wheel
import org.koin.dsl.module

/**
 * Created by MD.Rabius sani raju on 7/4/22.
 */
val demoModule = module {

    factory { Wheel() }
    factory { Engine() }

    factory { Car(get(),get()) }
    //single { Car() }
}