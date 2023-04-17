package com.github.coroutinedemo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.coroutinedemo.R
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        MainScope().launch {
            delay(10000)
            "second global".e()
        }
    }
}