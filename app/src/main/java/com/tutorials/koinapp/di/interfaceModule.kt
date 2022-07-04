package com.tutorials.koinapp.di

import com.tutorials.koinapp.demo.interfaces.*
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

/**
 * Created by MD.Rabius sani raju on 7/4/22.
 */
val interfaceModule = module {
     //factory { DemoImpl() as DemoOne }
    //factory<DemoOne> { DemoImpl() }

    /*
    * Single class bind
    * */
    //factory { DemoImplTwo() } bind DemoOne::class

    /*
    * Multiple Class binds
    * */
    factory { DemoImpl() } binds arrayOf(DemoOne::class,DemoTwo::class)

    factory { Main(get(),get()) }
}