package com.類別與物件.進階控制.內聯函式

val sum: (Int, Int) -> Int = { x, y -> x + y }
val action: () -> Unit = { println("kotlin") }   // Unit -> void

// 內聯函式多用在高階函式中
// 高階函式: 將函式作用於參數或返回值的函式

inline fun doCal(a: Int, b: Int, cal: (a: Int, b: Int) -> Int): Int {
    return cal(a, b)
}

fun main() {
    // lambda 為內部類別,所以若是多次調用,會產生過多物件
    // 所以若使用內聯函式(inline)則可以增加效能
    val value = doCal(10, 20, sum)
    println(value)
}