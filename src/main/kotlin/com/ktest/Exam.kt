package com.ktest

class Exam(val name: String) {
    var score: Int = 0

    // 次要建構子, 需跟隨主要建構子使用
    constructor(name: String, score: Int = 0) : this(name) {
        if (score >= 0) {
            this.score = score
        }
    }
}

fun main() {
    val e = Exam("Math", 100)
    println(e.score)
}