package com.yourcompany.binarysignal

interface BinaryStrategy {
    fun evaluate(candles: List<Candle>, otcParams: OTCMarketDetector.OTCParameters): StrategyVote
}

class LiquiditySweepStrategy : BinaryStrategy {
    override fun evaluate(candles: List<Candle>, otcParams: OTCMarketDetector.OTCParameters): StrategyVote {
        return StrategyVote(Direction.NEUTRAL, "⚪", 0.0)
    }
}

class OrderBlockStrategy : BinaryStrategy {
    override fun evaluate(candles: List<Candle>, otcParams: OTCMarketDetector.OTCParameters): StrategyVote {
        return StrategyVote(Direction.NEUTRAL, "⚪", 0.0)
    }
}

class FairValueGapStrategy : BinaryStrategy {
    override fun evaluate(candles: List<Candle>, otcParams: OTCMarketDetector.OTCParameters): StrategyVote {
        return StrategyVote(Direction.NEUTRAL, "⚪", 0.0)
    }
}

class BreakerBlockStrategy : BinaryStrategy {
    override fun evaluate(candles: List<Candle>, otcParams: OTCMarketDetector.OTCParameters): StrategyVote {
        return StrategyVote(Direction.NEUTRAL, "⚪", 0.0)
    }
}

class InducementStrategy : BinaryStrategy {
    override fun evaluate(candles: List<Candle>, otcParams: OTCMarketDetector.OTCParameters): StrategyVote {
        return StrategyVote(Direction.NEUTRAL, "⚪", 0.0)
    }
}
