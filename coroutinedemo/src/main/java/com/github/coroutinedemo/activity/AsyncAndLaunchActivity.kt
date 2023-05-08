package com.github.coroutinedemo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.github.coroutinedemo.R
import com.github.coroutinedemo.databinding.ActivityAsyncAndLaunchBinding
import kotlinx.coroutines.*

class AsyncAndLaunchActivity : AppCompatActivity() {
    private val binding :ActivityAsyncAndLaunchBinding by lazy {  ActivityAsyncAndLaunchBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btn1.setOnClickListener{
            asyncAndLaunchDiffer()
        }
        val exceptionHandler = CoroutineExceptionHandler() { context, exception ->
            print(exception.message)
        }
        GlobalScope.launch(context = Job() +
                Dispatchers.Default +
                CoroutineName("DemoName") +
                exceptionHandler) {}
        runBlocking {
            val job = launch {
                delay(3000)
                Log.e("tag", "launch finish")
            }
            job.join()
            val deferred = async {
                delay(2000)
                Log.e("tag", "async1 finish")
            }
            async {
                delay(1000)
                Log.e("tag","async2 finish")
            }
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
    fun test1(){
        runBlocking {
            val job = launch {
                delay(3000)
                Log.e("tag", "launch finish")
            }
            job.join()
            async {
                delay(2000)
                Log.e("tag","async finish")
            }
        }
    }
}