package com.ktest

class Student {
    // val 自動產生 getter, var 則產生 getter/setter
    // 若變數名 is 開頭, 以is...代換getter
    val subject: String = "Kotlin"
    var name: String = ""
    var isPass: Boolean = false // 產生 isPass()、getPass(), 不產生getIsPass()
}