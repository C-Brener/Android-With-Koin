package com.caiquebrener.androidwithkoin.presenter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.caiquebrener.androidwithkoin.R
import com.caiquebrener.androidwithkoin.hello.HelloRepository

class MySimplePresenter(val repo: HelloRepository) : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sayHello() = "${repo.giveHello()} from $this"
}