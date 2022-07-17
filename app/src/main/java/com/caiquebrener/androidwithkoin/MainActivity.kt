package com.caiquebrener.androidwithkoin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.caiquebrener.androidwithkoin.presenter.MySimplePresenter
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val firstPresenter: MySimplePresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val myText = findViewById<TextView>(R.id.my_text)

        myText.text = firstPresenter.sayHello()
    }
}