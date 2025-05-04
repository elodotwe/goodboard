package com.jacobarau.goodboard

import android.app.Service
import android.content.Intent
import android.inputmethodservice.InputMethodService
import android.os.IBinder
import android.util.Log
import android.view.View

class GoodBoardIME : InputMethodService() {

    private val tag = this.javaClass.simpleName

    override fun onCreateInputView(): View {
        Log.i(tag, "onCreateInputView")
        return layoutInflater.inflate(R.layout.layout, null)
    }
}