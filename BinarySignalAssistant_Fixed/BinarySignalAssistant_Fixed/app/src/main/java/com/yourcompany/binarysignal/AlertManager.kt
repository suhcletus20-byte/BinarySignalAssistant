package com.yourcompany.binarysignal

import android.content.Context

class AlertManager(private val context: Context) {
    fun sendSignalAlert(signal: BinarySignal, alertLevel: AlertLevel = AlertLevel.SOUND) {
    }

    fun sendDailySummary(stats: String, winRate: Double, totalProfit: Double) {
    }
}
