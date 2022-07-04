package com.tutorials.koinapp.di

import com.tutorials.koinapp.demo.viewmodel.MainViewModel
import com.tutorials.koinapp.demo.viewmodel.Test
import com.tutorials.koinapp.demo.viewmodel.TestImp
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

/**
 * Created by MD.Rabius sani raju on 7/4/22.
 */

val viewModelModule = module {

    factory { TestImp() } bind Test::class
    viewModel{MainViewModel(get())}
}