package com.ktest

import com.jtest.JHello

class KHello {
    fun callMe(){
        print("It's me, Luigi!")
    }
}

typealias MyHandler = (Int, String, Any) -> Unit

fun main(args: Array<String>) {
    println("Hello Kotlin")

    val j = JHello()
    j.callMe()

    val k = KHello()
    k.callMe()
}