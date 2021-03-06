package com.ktest

class Account(val name: String) {
    var balance: Int = 0
        get() = field       // field 代替變數名
        set(value) {
            if (value > 0)
                field = value
        }
}

fun main() {
    val act = Account("John")
    println(act.balance)
    act.balance = -100
    println(act.balance)
    println(act.toString())
}