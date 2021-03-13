package com.函式呼叫.集合聚合操作

fun main() {
    val numbers = listOf(5, 42, 10, 4)

    println("Count: ${numbers.count()}")
    println("Sum: ${numbers.sum()}")
    println("Avg: ${numbers.average()}")
    println("Max: ${numbers.maxOrNull()}")
    println("Min: ${numbers.minOrNull()}")

    // numbers 中 %3 的最小值
    // (5, 42, 10, 4) -> (2, 0, 1, 1)
    println("%3 的最小值: ${numbers.minByOrNull { it % 3 }}")

    val strings = listOf("one", "two", "three", "four")
    val longestString = strings.maxWithOrNull ( compareBy { it.length } )
    println("longest string: $longestString")
}
