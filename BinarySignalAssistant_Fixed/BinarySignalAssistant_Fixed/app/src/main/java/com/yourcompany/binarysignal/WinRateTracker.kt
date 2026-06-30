package com.yourcompany.binarysignal

class WinRateTracker {
    fun recordTrade(result: TradeResult) {}
    fun getSetupWinRate(setupType: String): Double = 0.5
    fun getBestSetups(): List<SetupStats> = emptyList()
    fun getBestAssets(): List<AssetStats> = emptyList()
    fun getSessionRecommendation(): Session? = null
    fun shouldTakeSignal(signal: BinarySignal): Boolean = true
    fun getConsecutiveLosses(): Int = 0
    fun getRiskAdjustment(): Double = 1.0
    fun getOverallWinRate(): Double = 0.0
    fun getRecentTradesText(count: Int): String = "No trades yet"
    fun predictWinProbability(signal: BinarySignal): Double = signal.confidence
    fun getOverallStats(): String = "No data yet"

    data class SetupStats(val setupName: String, val wins: Int = 0, val losses: Int = 0) {
        val winRate: Double get() = if (wins + losses > 0) wins.toDouble() / (wins + losses) else 0.5
        val totalTrades: Int get() = wins + losses
    }

    data class AssetStats(val symbol: String, val wins: Int = 0, val losses: Int = 0) {
        val winRate: Double get() = if (wins + losses > 0) wins.toDouble() / (wins + losses) else 0.5
    }
}
