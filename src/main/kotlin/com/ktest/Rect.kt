package com.ktest

class Rect(val h: Int, val w: Int) {
    val area : Int = h * w
    val isSquare: Boolean
        get() {
            return h == w
        }

    override fun toString(): String {
        return "Rect:{ h: $h, w: $w, area: $area, isSquare: $isSquare }"
    }
}

fun main() {
    val rect = Rect(10, 10)
    println(rect.isSquare)
    println(rect.toString())
}