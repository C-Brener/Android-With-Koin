package com.caiquebrener.androidwithkoin.presenter

import com.caiquebrener.androidwithkoin.hello.HelloRepository

class MySimplePresenter(val repo: HelloRepository) {

    fun sayHello() = "${repo.giveHello()} from MySimplePresenter"
}