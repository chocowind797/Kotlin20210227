package com.類別與物件.進階控制.內聯函式

/**
 *  內聯函式: inline / noinline
 **/

fun test() {
    val x = 1
    hello()
    println(x)
}

// inline 如同拆解方法, 與*拆解陣列類似
inline fun hello() {
    val a = 1
    val b = 1
    val c = a + b
    println(c)
}

/*
*   實際編譯後,會將inline內的程式碼全部搬移,而不是呼叫方法
*   fun test() {
    val x = 1
    val a = 1
    val b = 1
    val c = a + b
    println(x)
}
**/

fun main() {
    test()
}