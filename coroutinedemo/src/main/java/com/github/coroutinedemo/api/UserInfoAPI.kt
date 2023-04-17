package com.github.coroutinedemo.api

import kotlinx.coroutines.delay

class API {
    companion object {
        suspend fun requestAppVersion(s: String) :Int{
            delay(1000)
            return 2
        }

        suspend fun requestUserInfo(s: String): String {
            delay(1000)
            return "this is Net User info"
        }

        suspend fun requestGiftType(s: String): String {
            delay(1000)
            return "this is net gift type"
        }
    }
}