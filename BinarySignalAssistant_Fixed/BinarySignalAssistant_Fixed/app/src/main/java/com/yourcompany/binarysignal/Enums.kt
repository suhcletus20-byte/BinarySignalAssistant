package com.yourcompany.binarysignal

enum class Direction { CALL, PUT, NEUTRAL }
enum class MarketType { NORMAL, OTC_ASIAN, OTC_MORNING, OTC_EVENING }
enum class Session { ASIAN, LONDON, NEW_YORK, OVERLAP, LOW_VOLATILITY, WEEKEND }
enum class AlertLevel { SILENT, VIBRATE, SOUND, CRITICAL }
enum class Outcome { WIN, LOSS, TIE }
