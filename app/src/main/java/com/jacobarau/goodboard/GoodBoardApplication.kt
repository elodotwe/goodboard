package com.jacobarau.goodboard

import android.app.Application
import android.util.Log

class GoodBoardApplication: Application() {
    private val tag = this.javaClass.simpleName

    override fun onCreate() {
        super.onCreate()
        Log.i(tag, "GoodBoard onCreate")
    }
}