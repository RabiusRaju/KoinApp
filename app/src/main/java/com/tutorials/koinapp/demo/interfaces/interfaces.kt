package com.tutorials.koinapp.demo.interfaces

import android.util.Log

/**
 * Created by MD.Rabius sani raju on 7/4/22.
 */
interface DemoOne{
    fun getDemoOne()
}

interface DemoTwo{
    fun getDemoTwo()
}

class DemoImpl : DemoOne, DemoTwo{
    override fun getDemoOne() {
        Log.d("main", "This is demo one...")
    }

    override fun getDemoTwo() {
        Log.d("main", "This is demo tow...")

    }
}


class Main(private val demoOne: DemoOne, private val demoTwo: DemoTwo){
    fun getDemo(){
        demoOne.getDemoOne()
        demoTwo.getDemoTwo()
    }
}