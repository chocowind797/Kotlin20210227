package com.類別與物件.代理與委託

interface BuyCoffee {
    fun buy()
}

class Son : BuyCoffee {
    override fun buy() {
        println("兒子去買咖啡")
    }
}

// by Son 使用 Son 覆寫 BuyCoffee 的方法
class Father : BuyCoffee by Son() {

}

fun main() {
    val f = Father()
    f.buy()
}
