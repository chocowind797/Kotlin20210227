package com.類別與物件.繼承與多型

abstract class Human(val name: String) {
    abstract fun eat()
}

class Man(name: String): Human(name) {
    override fun eat() {
        println("$name 大口吃飯")
    }
}

class Woman(name: String): Human(name) {
    override fun eat() {
        println("$name 小口吃飯")
    }
}

fun main() {
    val man = Man("男人")
    val woman = Woman("女人")
    val list = listOf(man, woman)
    list.forEach{it.eat()}
}
