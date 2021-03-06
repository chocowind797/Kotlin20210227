package com.ktest.standard

import kotlin.random.Random as r

// 方法等於邏輯計算結果
fun getLevel(score: Int) = when (score) {
    in 90..100 -> "A"
    in 80..89 -> "B"
    in 70..79 -> "C"
    in 60..69 -> "D"
    else -> "E"
}


// if, when, for, while, do-while
fun main() {
    val score = r.nextInt(100)+1

    // if-else
    val pass = if (score >= 60) "Pass" else "Fail"
    println("$score is $pass")

    // when
    // 100~90 "A", 89~80 "B", 79~70 "C", 69~60 "D", 59~0 "E"
    when (score) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("E")
    }

    var level = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "E"
    }
    println(level)

    level = when (score / 10) {
        9, 10 -> "A"
        8 -> "B"
        7 -> "C"
        6 -> "D"
        else -> "E"
    }
    println(level)

    println(getLevel(score))
    println("====================")

    // for(1~10)
    for (i in 1..10) {
        print("$i ")
    }
    println()

    // step 為 += (初始為 1)
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println()

    for(i in 10 downTo 1) {
        print("$i ")
    }
    println()

    // (1~9)
    for(i in 1 until 10) {
        print("$i ")
    }
    println()


    // 動動腦
    // 有一亂數(1~10) ans, 給使用者來猜, 猜對 Bingo, 有五次機會
    val ran = r.nextInt(11)+1
    val max = 5
    for(i in 1..max) {
        print("第 $i/$max 次, 請輸入數字(1~10): ")
        val guess = readLine()!!.toInt()
        if(guess == ran) {
            println("Bingo")
            break
        }else if(guess > ran)
            println("猜錯囉!太大了!")
        else
            println("猜錯囉!太小了!")
    }
}
