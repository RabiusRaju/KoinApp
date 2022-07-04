package com.tutorials.koinapp.demo.viewmodel

import androidx.lifecycle.ViewModel

/**
 * Created by MD.Rabius sani raju on 7/4/22.
 */
class MainViewModel constructor(private val test: Test) : ViewModel() {
    fun getTest(){
        test.getTest()
    }
}