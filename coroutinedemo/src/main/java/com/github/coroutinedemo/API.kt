package com.github.coroutinedemo

class API {
    companion object {
        fun requestAppVersion(s: String) :Int{
            return 0;
        }

        fun requestUserInfo(s: String): Int {
            return 1
        }

        fun requestGiftType(s: String): Int {
            return 1
        }
    }
}