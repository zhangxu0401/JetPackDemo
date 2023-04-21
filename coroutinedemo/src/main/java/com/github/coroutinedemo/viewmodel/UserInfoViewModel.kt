package com.github.coroutinedemo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.coroutinedemo.api.API
import kotlinx.coroutines.launch

class UserInfoViewModel():ViewModel() {
    //定义liveData进行数据存储，以及数据变量的观察
    val userLD=MutableLiveData<String>()
    fun requestUserInfo() {
        //使用viewModelScope开启协程，协程内，可以进行耗时的异步操作
        viewModelScope.launch {
            var userinfo=API.requestUserInfo("")
            userLD.value=userinfo
        }
    }
}