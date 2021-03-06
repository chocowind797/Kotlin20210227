package com.ktest.standard

import kotlin.random.Random

fun main() {
    // 數組陣列
    val num1 = arrayOf(1, 5, 7, 3)      // 隱式(自動尋找型別)
    val num2 = arrayOf<Int>(1, 5, 7, 3) // 顯示(手動輸入型別)

    // for
    for(i in 0 until num1.size)
        print("${num1[i]} ")

    println()

    // indices -> 數組的所有 index
    for(i in num1.indices)
        print("${num1[i]} ")

    println()

    // 使用 lambda 創建 , i 為每個 index -> index 的處理
    val num3 = Array(5) { i -> i * 2 }
    for(i in num3)
        print(i)

    println()

    // 四星彩電腦選號 (0~9)   若變數不會使用到,則可換為 _ , 以避免撞變數名
    val num4 = Array(4) { _ -> Random.nextInt(10)}
    println(num4.contentToString()) // Arrays.toString(num4)

    // setter / getter
    val n1 = num4.get(1) // num4[1]
    println(n1)

    num4.set(1, 9) // num4[1] = 9
    println(num4.contentToString())

    // for-each (印出集合內容)
    num4.forEach { n -> print("$n ") }
    println()
}