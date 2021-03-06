package com.ktest.standard

// 複合元素集合
fun main() {
    data class Person(val name: String, val age: Int)

    val people = listOf(
        Person("John", 18),
        Person("Mary", 20),
        Person("Helen", 19)
    )

    // 請問年紀最大的是誰?
    println(people.maxByOrNull { it.age })

    // 請問平均年齡?
    println(people.map{it.age}.average())
}