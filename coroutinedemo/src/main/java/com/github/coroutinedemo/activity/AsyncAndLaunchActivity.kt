package com.github.coroutinedemo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.github.coroutinedemo.R
import com.github.coroutinedemo.databinding.ActivityAsyncAndLaunchBinding
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class AsyncAndLaunchActivity : AppCompatActivity() {
    private val binding :ActivityAsyncAndLaunchBinding by lazy {  ActivityAsyncAndLaunchBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btn1.setOnClickListener{
            asyncAndLaunchDiffer()
        }
    }
    fun asyncAndLaunchDiffer(){
        lifecycleScope.launch {
            val jobLaunch = launch {
                delay(3000)
                "test launch after".e()
                "test launch end str"
            }
            jobLaunch.join().toString().e()
            val jobAsync = async {
                delay(2000)
                "test async after".e()
                "test async end str"
            }
            jobAsync.await().toString().e()
        }
    }
}