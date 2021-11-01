package com.bytedance.compicatedcomponent.homework

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.bytedance.compicatedcomponent.R
import com.bytedance.compicatedcomponent.homework.ClockView.Companion.UPDATE_SECOND_POINTER

/**
 *  author : neo
 *  time   : 2021/10/30
 *  desc   :
 */
class ClockActivity : Activity() {

    lateinit var clock: ClockView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clock)
        clock.findViewById<ClockView>(R.id.clock)
    }

    val handler: Handler = Handler(Looper.getMainLooper()) { msg ->
        when(msg.what) {
            UPDATE_SECOND_POINTER -> {
                clock.invalidate()
            }
        }
        true
    }
}