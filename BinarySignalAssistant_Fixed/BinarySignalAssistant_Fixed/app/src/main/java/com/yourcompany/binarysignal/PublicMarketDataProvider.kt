package com.yourcompany.binarysignal

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class PublicMarketDataProvider {
    private val _candles = MutableStateFlow<List<Candle>>(emptyList())
    val candles: StateFlow<List<Candle>> = _candles

    fun connect(symbol: String) {
    }

    fun disconnect() {
    }
}
