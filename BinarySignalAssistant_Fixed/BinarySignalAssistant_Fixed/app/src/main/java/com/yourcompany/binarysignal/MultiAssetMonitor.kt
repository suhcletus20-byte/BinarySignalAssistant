package com.yourcompany.binarysignal

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MultiAssetMonitor {
    private val _allSignals = MutableStateFlow<Map<String, BinarySignal>>(emptyMap())
    val allSignals: StateFlow<Map<String, BinarySignal>> = _allSignals

    fun startMonitoring(selectedAssets: List<String> = listOf("EURUSD")) {
    }

    fun getBestSignal(): BinarySignal? = null
    fun getActiveAssets(): List<String> = emptyList()
}
