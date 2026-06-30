package com.yourcompany.binarysignal

data class BinarySignal(
    val direction: Direction,
    val confidence: Double,
    val suggestedExpiry: String,
    val setupType: String,
    val entryZone: Pair<Double, Double>,
    val strategyVotes: Map<String, StrategyVote>,
    val marketType: MarketType,
    val session: Session,
    val timestamp: Long,
    val riskLevel: String,
    val winProbability: Double,
    val assetSymbol: String
)

data class StrategyVote(
    val direction: Direction,
    val emoji: String,
    val weight: Double = 1.0
)

data class TradeResult(
    val signal: BinarySignal,
    val outcome: Outcome,
    val actualProfit: Double,
    val timestamp: Long,
    val notes: String = ""
)

data class AssetConfig(
    val symbol: String,
    val displayName: String,
    val isOTC: Boolean = false,
    val isActive: Boolean = true,
    val priority: Int = 5
)
