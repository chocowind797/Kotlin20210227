package com.基礎語法.standard

fun getPrice(): Int {
    return 100
}

fun main(args: Array<String>) {
    // 宣告變數
    var x = 10               // var 為可讀寫
    x += 1
    println(x)

    val y = 20                // val 為只讀(final)
//    y += 1
    println(y)

    // var/val 變數名 [: 變數型態] = 初始值
    val pi: Double = 3.14    // val pi = 3.14

    // BMI 練習
    val h = 170.0
    val w = 60.0
    val bmi = w / Math.pow(h / 100, 2.0)
    println("BMI = %.2f".format(bmi))
    println("BMI = $bmi")
    println("BMI = ${bmi * 2}")     // 加大括號為可運算(EL language)

    val price = 100
    println("cost = ${price * 0.4}")
    println("cost = ${getPrice() * 0.4}")

    // 簡單轉型
    var a: Int = 10
    var b: Short = a.toShort()
    println("$a $b")
    var e: Float = 1.23f
    var intMax = Int.MAX_VALUE      // Int -> Integer


    // 動動腦
    var chinese: String = "100"
    var english = "90"
    var math: String? = "88"
    math = null
    //  請算出總分?
    var sum = chinese.toInt() + english.toInt() + (math?.toIntOrNull() ?: 0)
    println("sum = $sum")
    println(sum)


    // 動動腦 2
    val c: Int = "100".toInt()
    println(c)
    val d: Int = "abc".toIntOrNull() ?: 0 // 如果為 null 則設為 0
    println(d)
    val f: Int = null?.toIntOrNull() ?: -1
    println(f)

}
