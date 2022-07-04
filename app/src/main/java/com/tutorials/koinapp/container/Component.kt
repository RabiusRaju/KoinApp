package com.tutorials.koinapp.container

import com.tutorials.koinapp.demo.Car
import com.tutorials.koinapp.demo.Engine
import com.tutorials.koinapp.demo.interfaces.Main
import com.tutorials.koinapp.demo.viewmodel.MainViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

/**
 * Created by MD.Rabius sani raju on 7/4/22.
 */

class Component : KoinComponent {

    //lazily
    val car : Car by inject()
    val engine: Engine by inject()
    val main:Main by inject()
    val mainViewModel:MainViewModel by inject()

}