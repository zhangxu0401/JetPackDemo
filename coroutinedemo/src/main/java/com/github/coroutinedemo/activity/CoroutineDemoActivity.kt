package com.github.coroutinedemo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.github.coroutinedemo.databinding.ActivitySecondBinding
import com.github.coroutinedemo.viewmodel.UserInfoViewModel

class CoroutineDemoActivity : AppCompatActivity() {
    //自动实现ViewModel
    val userViewModel:UserInfoViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //使用databinding进行映射布局。命名规则一般是：XML文件的名称+binding。
        // (如果没有找到，首先看app的gradle是否添加了databinding=true，或者build一下，一般就出来了)
        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //给布局文件的变量进行赋值
        binding.userVM=userViewModel
        //设置lifecycleOwner 就不用给数据添加observe了。可以实现自动观察liveData的变化，自动更新数据
        binding.lifecycleOwner=this
        binding.button.setOnClickListener{
            //通过viewModel进行网络请求
            userViewModel.requestUserInfo()
        }
    }
}

