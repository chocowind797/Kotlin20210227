// Java code 的調用請參考 com.jtest.CallTopFun
@file:JvmName("Calc") // java 可以透過Calc名稱調用此類別(KTopFun)
package com.函式呼叫.頂層函式

var count = 0   // 頂層屬性

@JvmName("myAdd") // java 可以透過myAdd名稱調用此方法(add)
fun add(x: Int, y: Int): Int {  // 頂層函式
    ++count
    return x + y
}