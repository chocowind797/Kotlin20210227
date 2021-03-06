package com.lab

var num = 8 // 目前車位數量
var p = 18   // 停車狀態

fun main() {
    println("目前停車狀態: ${p.toBinary(num)}")
}


fun Int.toBinary(len: Int): String {
    return String.format("%" + len + "s", this.toString(2)).replace(" ", "0")
}
