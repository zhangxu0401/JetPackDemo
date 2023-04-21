package com.github.coroutinedemo.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.coroutinedemo.databinding.ActivityMainBinding

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
            it.btnNextDemo.setOnClickListener {
                startActivity(Intent(this@MainActivity, CoroutineDemoActivity::class.java))
            }
            it.btnNextAsync.setOnClickListener{
                startActivity(Intent(this@MainActivity, AsyncAndLaunchActivity::class.java))
            }
        }
    }
}

val Tag = "MainActivity"

fun String.e() {
    Log.e(Tag, this)
}