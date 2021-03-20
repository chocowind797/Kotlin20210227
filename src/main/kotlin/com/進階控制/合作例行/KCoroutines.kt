package com.進階控制.合作例行

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun case1() {
    val startTime = System.currentTimeMillis()

    // repeat -> for 迴圈
    repeat(10000) {
        Thread {
            // do something
        }.start()
    }

    val endTime = System.currentTimeMillis()
    println("case1: ${endTime - startTime} ms")
}

fun case2() {
    // 運用 coroutines
    // 要先安裝 implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9"
    // 以 runBlocking 與 launch 取代 Thread 的重複執行, 效能會增加
    runBlocking {
        val startTime = System.currentTimeMillis()
        val job = launch {
            repeat(10000) {
                launch {

                }
            }
        }
        job.invokeOnCompletion {
            val endTime = System.currentTimeMillis()
            println("case2: ${endTime - startTime} ms")
        }
    }

}

fun main() {
    case1()
    case2()
}
