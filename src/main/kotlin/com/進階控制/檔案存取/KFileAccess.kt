package com.進階控制.檔案存取

import java.io.File

// 讀取檔案資料
fun read() {
    File("data.txt").bufferedReader().lines().forEach { println(it) }
}

// 寫入資料
fun write(data: String) {
    File("data.txt").appendText("$data\n")
}

// 取代資料
fun replace(data: String) {
    File("data.txt").writeText("$data\n")
}

// 批次寫入
fun batchWrite() {
    File("data.txt").bufferedWriter().use {
        it.write("Java")
        it.newLine()
        it.write("Python")
        it.newLine()
        it.write("C#")
        it.newLine()
        it.write("VB")
        it.newLine()
    }
}

fun main() {
//    read()
//    write("VB")
//    read()
//    replace("Cobol")
//    read()

    batchWrite()
    read()
}
