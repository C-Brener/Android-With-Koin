package com.caiquebrener.androidwithkoin.di

import com.caiquebrener.androidwithkoin.hello.HelloRepository
import com.caiquebrener.androidwithkoin.hello.HelloRepositoryImpl
import com.caiquebrener.androidwithkoin.presenter.MySimplePresenter
import org.koin.dsl.module

object Di {

    val appModule = module {
        single<HelloRepository> { HelloRepositoryImpl() }

        factory { MySimplePresenter(get()) }
    }
}