package com.tutorials.koinapp.demo.viewmodel

import android.util.Log

/**
 * Created by MD.Rabius sani raju on 7/4/22.
 */

interface Test{
    fun getTest()
}

class TestImp : Test{
    override fun getTest() {
        Log.d("main", "Hey ViewModel..")

    }

}