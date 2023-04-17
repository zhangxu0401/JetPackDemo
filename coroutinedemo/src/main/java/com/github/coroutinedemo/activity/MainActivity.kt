package com.github.coroutinedemo.activity

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.coroutinedemo.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.coroutines.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        initView()

    }

    private fun initView() {
        binding?.let {
            it.btnNext.setOnClickListener {
                startActivity(Intent(this@MainActivity, SecondActivity::class.java))
            }
        }
    }
}

val Tag = "MainActivity"

fun String.e() {
    Log.e(Tag, this)
}