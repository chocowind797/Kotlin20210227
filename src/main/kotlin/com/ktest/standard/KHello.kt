package com.ktest.standard

import com.jtest.JHello

class KHello {
    fun callMe(){
        print("It's me, Luigi!")
    }
}

typealias MyHandler = (Int, String, Any) -> Unit

fun main(args: Array<String>) {
    println("Hello Kotlin")
    Thread.sleep(1000)  // kotlin 不強迫使用 try-catch
    println("Hello Kotlin")
    val j = JHello()
    j.callMe()

    val k = KHello()
    k.callMe()
}