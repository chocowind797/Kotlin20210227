package com.lab

import kotlin.math.log2
import kotlin.math.pow

var num = 8     // 目前車位數量
var p = 18      // 停車狀態

fun main() {
    while(true) {
        println("目前停車狀態: ${p.toBinary(num)}")
        print("請選擇功能, 停車(0), 移車(1): ")
        val k = readLine()!!.toInt()

        if(k !in 0..1){
            println("功能錯誤!")
            continue
        }

        print("請選擇車位(0~7): ")
        var n = readLine()!!.toInt()

        if(n !in 0 until num){
            println("車位錯誤!")
            continue
        }

        n = 2.0.pow(n).toInt()
        val isPass: Boolean = p.and(n) == 0

        if (k == 0){
            if (isPass) {
                p += n
                println("最新車位狀態: ${p.toBinary(num)}, p=$p")
            } else {
                println("${log2(n.toDouble()).toInt()} 號車位已有車!")
            }
        }else{
            if (!isPass) {
                p -= n
                println("最新車位狀態: ${p.toBinary(num)}, p=$p")
            } else {
                println("${log2(n.toDouble()).toInt()} 號車位沒有車!")
            }
        }
    }
}

fun Int.toBinary(len: Int): String {
    return String.format("%" + len + "s", this.toString(2)).replace(" ", "0")
}
