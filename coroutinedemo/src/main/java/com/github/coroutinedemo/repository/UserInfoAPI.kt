package com.github.coroutinedemo.api

import kotlinx.coroutines.delay

class API {
    companion object {
        suspend fun requestUserInfo(s: String): String {
            //使用delay模拟网络数据请求
            delay(1000)
            return "this is Net User info"
        }

        suspend fun requestGiftType(s: String): String {
            delay(1000)
            return "this is net gift type"
        }
    }
}