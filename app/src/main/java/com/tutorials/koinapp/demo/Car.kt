package com.tutorials.koinapp.demo

import android.util.Log

/**
 * Created by MD.Rabius sani raju on 7/4/22.
 */
class Car constructor(private val engine: Engine,private val wheel: Wheel) {

    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d("main", "car is running...")
    }
}

class Engine(){
    fun getEngine(){
        Log.d("main", "engine is running...")
    }
}

class Wheel(){
    fun getWheel(){
        Log.d("main", "wheel is running...")
    }
}