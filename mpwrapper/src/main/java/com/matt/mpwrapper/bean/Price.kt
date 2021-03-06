package com.matt.mpwrapper.bean

/**
 * ============================================================
 * 作 者 :    matt@163.com
 * 更新时间 ：2018/09/14 15:20
 * 描 述 ：所有数据请提供原始数据，不要进行任何加工
 * ============================================================
 */
data class Price(
    /**
     * 原始数据
     */
    var t: Long,//开始时间
    val o: Float,
    val h: Float,
    val l: Float,
    var c: Float
)