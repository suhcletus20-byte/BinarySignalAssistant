package com.yourcompany.binarysignal

class OTCMarketDetector {
    fun detectMarketType(symbol: String, candles: List<Candle>): MarketType {
        return MarketType.NORMAL
    }

    fun getOTCAdjustedParameters(marketType: MarketType): OTCParameters {
        return OTCParameters(0.80, 1.0, true, true)
    }

    data class OTCParameters(
        val minConfidence: Double,
        val expiryMultiplier: Double,
        val useVolume: Boolean,
        val useOrderFlow: Boolean
    )
}
