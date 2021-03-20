package com.類別與物件.代理與委託

// SingleTon & By

interface BuyTea {
    fun buy()
}

object Daughter : BuyCoffee {
    override fun buy() {
        println("女兒去買茶")
    }
}

class Mother : BuyCoffee by Daughter {
//    override fun buy() {
//        println("媽媽叫女兒去買茶")
//    }
}

fun main() {
    val mother = Mother()
    mother.buy()
}
