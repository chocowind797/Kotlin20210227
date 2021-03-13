package com.函式呼叫.繼承函式

// 類別預設為不可繼承(final), 若要繼承須加上 open
open class View {
    // 方法預設為不可覆寫(final), 若要覆寫須加上 open
    open fun click() = println("View Clicked")
    // 若此成員函式與繼承函式有相同的方法簽章, 則成員函式優先執行
    fun show() = println("空白")
}

class Button: View() {
    override fun click() = println("Button Clicked")
}

fun main() {
    val view: View = Button()
    view.click()
    view.show()     // 可以知道我按的元件型別
}

// 繼承函式是靜態的(static), 所以沒有覆寫機制
fun View.show() = println("View")
fun Button.show() = println("Button")