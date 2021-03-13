package com.類別與物件.介面與抽象

interface Clickable {
    fun click()     // 一般抽象方法
    fun showOff() { // 類似 Java 8 介面的 default 方法
        println("I am clickable")
    }
}

class Button: Clickable {
    override fun click() {
        println("Button clicked!")
    }
}

fun main() {
    val btn = Button()
    btn.showOff()
    btn.click()
}