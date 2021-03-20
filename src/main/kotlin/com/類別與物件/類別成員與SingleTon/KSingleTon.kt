package com.類別與物件.類別成員與SingleTon

import kotlin.random.Random

// class -> 可創建許多物件
// object -> SingleTon
object KSingleTon {
    private var num: Int = 0

    init {
        num = Random.nextInt(100)
    }

    fun getNum(): Int = this.num
}

fun main() {
    val a1 = KSingleTon
    println(a1.getNum())

    val a2 = KSingleTon
    println(a2.getNum())

}
