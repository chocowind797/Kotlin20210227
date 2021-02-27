package com.ktest

/** 存儲修飾字(預設為public) 方法名稱(arg1: type1, arg2: type2...): 回傳型態 {
 *      方法實作內容
 *      return 回傳結果
 *  }
 */

fun add(x: Int, y: Int): Int{
    val sum = x + y
    return sum
}

fun sub(x: Int, y: Int = 0): Int{
    val sum = x - y
    return sum
}

fun mul(x: Int = 0, y: Int = 0): Int{
    val sum = x * y
    return sum
}

fun div(x: Int = 0, y: Int = 0): Int {
    val sum = x / y
    return sum
}

fun main() {
    println(add(10, 20))
    println(sub(10, 20))
    println(sub(10))
    println(mul(10, 20))
    println(mul())
    println(div(y=1))
}
