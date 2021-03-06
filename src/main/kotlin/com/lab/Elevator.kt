package com.lab

fun main() {
    val bottomFloor = -1
    val topFloor = 8
    var myPos = 0
    var elevator = 5
    println("---電梯系統---")

    while (true) {
        println("電梯目前位置: $elevator 樓")
        print("請選擇進入的樓層(B1~$topFloor):")

        // 將 try 作為表達式 (try 表達式)
        var toFloor = try {
            readLine()!!.toInt()
        } catch (e: NumberFormatException) {
            if(e.message!!.contains("B1")) -1 else Int.MIN_VALUE
        }

//        println(toFloor)

        try {
            toFloor = if (toFloor in bottomFloor..topFloor) toFloor else throw Exception("樓層錯誤")
        } catch (e: java.lang.Exception) {
            println(e.message)
            continue
        }

        if (elevator != myPos) {
            if (elevator > myPos) {
                println("電梯下樓")
                for (i in (elevator - 1) downTo 0) {
                    println(i)
                    Thread.sleep(1000)
                }
            } else {
                println("電梯上樓")
                for (i in (elevator + 1)..0) {
                    println(i)
                    Thread.sleep(1000)
                }
            }
            elevator = 0
            println("電梯抵達 Lobby")
            Thread.sleep(1000)
        }

        if (toFloor > elevator) {
            println("電梯上樓")
            for (i in (elevator + 1)..toFloor) {
                println(i)
                Thread.sleep(1000)
            }
        } else {
            println("電梯下樓")
            for (i in (elevator - 1) downTo toFloor) {
                println(i)
                Thread.sleep(1000)
            }
        }
        println("電梯抵達 $toFloor 樓")
        elevator = toFloor
        myPos = elevator
        println("===========")
    }
}