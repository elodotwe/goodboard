package com.jacobarau.goodboard

import android.app.Service
import android.content.Intent
import android.inputmethodservice.InputMethodService
import android.os.IBinder
import android.util.Log
import android.view.View
import android.widget.TextView

class GoodBoardIME : InputMethodService() {

    private val tag = this.javaClass.simpleName

    override fun onCreateInputView(): View {
        Log.i(tag, "onCreateInputView")
        val view = layoutInflater.inflate(R.layout.layout, null)
        view.findViewById<TextView>(R.id.test_text_view).setOnClickListener {
            testInput()
        }
        return view
    }

    private fun testInput() {
        currentInputConnection.commitText("HELLO WORLD!", 1)
    }
}