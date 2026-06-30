package com.yourcompany.binarysignal

data class Candle(
    val timestamp: Long,
    val open: Double,
    val high: Double,
    val low: Double,
    val close: Double,
    val volume: Double
) {
    val bodySize: Double get() = kotlin.math.abs(close - open)
    val isBullish: Boolean get() = close > open
    val isBearish: Boolean get() = close < open
    val range: Double get() = high - low
}
