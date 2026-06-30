package com.yourcompany.binarysignal

import android.content.Context
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class TradeLogPanel(private val context: Context) {
    fun createLogPanel(signal: BinarySignal): View {
        return TextView(context).apply {
            text = "Trade logging panel"
        }
    }
}
