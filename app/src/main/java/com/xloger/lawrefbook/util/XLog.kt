package com.xloger.lawrefbook.util

import android.util.Log
import java.lang.Exception

/**
 * Created on 2022/3/20 19:33.
 * Author: xloger
 * Email:phoenix@xloger.com
 */
object XLog {

    fun d(msg: String) {
        Log.d("lrb", msg)
    }

    fun e(exception: Exception) {
        Log.e("lrb", exception.toString())
    }
}