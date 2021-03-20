package com.類別與物件.巢狀與內部類別

/**
 *  巢狀類別(位於某類別內) :
 *       Java  -> static class A
 *      Kotlin -> class A
 *
 *  內部類別(位於某類別內) :
 *       Java  -> class B
 *      Kotlin -> inner class B
 **/

class Outer {   // 一般類別,外部類別
    companion object {  // 類別成員宣告區
        val sx = 200
    }

    val x = 100 // 物件成員變數

    class A {   // 巢狀類別(static)
        fun print() {
            println("A $this")
            println("A -> Outer.sx ${Outer.sx}")
        }
    }

    inner class B { // 內部類別
        fun print() {
            println("B $this")
            println("B -> Outer.x ${this@Outer.x}")
            println("B -> Outer.sx ${Outer.sx}")
        }
    }
}

fun main() {
    val a = Outer.A()
    a.print()
    val b = Outer().B()
    b.print()
}