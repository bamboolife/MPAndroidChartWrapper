package com.matt.sample_zm.config

/**
 * ============================================================
 * 作 者 :    matt
 * 更新时间 ：2020/03/11 10:14
 * 描 述 ：
 * ============================================================
 */
object GlobalConfig {
    fun getTradeUrl(): String {
        return "https://api-trade.tradeode.com"
    }

    fun getMarketUrl(): String {
        return "https://api-market.tradeode.com"
    }
}