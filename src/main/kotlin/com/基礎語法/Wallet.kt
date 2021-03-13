package com.基礎語法

// data 為自動覆寫 toString(), 但僅限建構子內變數
// data class 使用於存儲資料(只有建構子[和init], ex: 資料庫), 常不含商業方法(if-else)
data class Wallet(val name: String, var money: Int) {

    init {
//        money = if(money > 0) money else 0

        money = try {
            require(money >= 0) // 檢驗函式,若邏輯判斷為false,則拋出一個例外,可省略if-else
            money
        }catch (e: Exception){
            0
        }
    }
}

fun main() {
    val w1 = Wallet("John", 100)
    println(w1)
    val w2 = Wallet("Mary", -100)
    println(w2)
}