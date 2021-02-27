package com.ktest

fun main() {
    val chinese: Int? = null
    val english: Int? = 90
    val math: Int? = 80
    // 若沒考過則放入 null, 計算總分的時候以 0 分代之
    // 請計算總分?
    val sum = (chinese ?: 0) + (english ?: 0) + (math ?: 0)
    //       |<------------>| |<------------>| |<--------->|
    // val sum = chinese ?: 0 + (english ?: 0) + (math ?: 0)
    //          |<----->|  |<------------------------------>|
    println("sum = $sum")

    val sum2 = chinese?.plus(english ?: 0) ?: 0
    // 若有 chinese 則加 english, 反之則為 0


}