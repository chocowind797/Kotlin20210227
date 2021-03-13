package com.函式呼叫.繼承函式

import com.函式呼叫.繼承函式.endChar as end

fun main() {
    val s = "abc"
    // 想要得到最後一個字
    println(s.end())
}

fun String.endChar(): Char {
//    return this[this.length-1]
    return get(length-1)    // this.get(this.lenght-1)
}