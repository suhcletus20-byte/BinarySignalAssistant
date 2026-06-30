package com.yourcompany.binarysignal

import java.time.LocalDateTime
import java.time.ZoneOffset

class SessionFilter {
    fun getCurrentSession(): Session {
        val now = LocalDateTime.now(ZoneOffset.UTC)
        val hour = now.hour
        return when {
            hour in 12..13 -> Session.OVERLAP
            hour in 9..11 -> Session.LONDON
            hour in 14..16 -> Session.NEW_YORK
            else -> Session.LOW_VOLATILITY
        }
    }

    fun shouldTrade(session: Session, marketType: MarketType): Boolean {
        return session != Session.LOW_VOLATILITY
    }

    fun getSessionQuality(session: Session): Int {
        return when (session) {
            Session.OVERLAP -> 10
            Session.LONDON, Session.NEW_YORK -> 8
            else -> 5
        }
    }
}
