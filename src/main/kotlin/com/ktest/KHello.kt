package com.ktest

import com.jtest.JHello

class KHello {
    fun callMe(){
        print("It's me, Luigi!")
    }
}

fun main(args: Array<String>) {
    println("Hello Kotlin")

    val j = JHello()
    j.callMe()

    val k = KHello()
    k.callMe()
}