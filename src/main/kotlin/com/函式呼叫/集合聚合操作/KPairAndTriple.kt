package com.函式呼叫.集合聚合操作

// Pair 和 Triple

fun main() {
    // Pair
    // p = Pair(1, "A")
    val p = 1 to "A" // 利用中序(infix)指令建構

    println("p: $p")
    println("class: ${p.javaClass}")
    println("toList: ${p.toList()}")
    println("first: ${p.first}(${p.first.javaClass}), second: ${p.second}(${p.second.javaClass})")

    // Triple
    // 置入單一型別元素
    // val t = Triple(4, 5, 6)
    // 置入不同型別元素
    val t = Triple("I'm a string", listOf(1, 2, 3), 10)

    println("first: ${t.first}(${t.first.javaClass}), second: ${t.second}(${t.second.javaClass}), third: ${t.third}(${t.third.javaClass})")

    // 解構 Pair, Triple
    val (a, b) = p
    println("$a, $b")

    val (i, j, k) = t
    println("$i, $j, $k")

    val (name, score) = Pair("小明", 100)
    println("$name, $score")

    println()
    // 應用
    var scores = mapOf(Pair("小明", 100), "小華" to 80, "小英" to 90)
    // 在 scores 中新增 小美 成績: Pair("小美", 70)
    // 由於 mapOf 預設為 immutable 因此不可加入新元素
    // 若要加入新元素則必須變為可變型別
    scores = scores.toMutableMap()
    scores["小美"] = 70
    // scores.put("小美", 70)
    for(entry in scores) {
        println("${entry.key}, ${entry.value}")
    }
    val stat = scores.entries.stream().mapToInt { it.value }.summaryStatistics()
    println(stat)
    println(stat.sum)

    // 可增加元素的集合
    val scores2 = mutableMapOf(Pair("小明", 100), "小華" to 80, "小英" to 90)
    scores2.put("小美", 70)
}