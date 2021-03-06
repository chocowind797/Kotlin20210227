package com.ktest.standard

fun main() {
    // 集合 Set, List, Map
    val set = hashSetOf<Int>(1, 5, 2, 9, 6, 3)
    val list = arrayListOf<Int>(1, 5, 2, 7, 6, 3)
    val map = hashMapOf<Int, String>(1 to "One", 5 to "Five", 7 to "Seven", 3 to "Three")
    println(set)
    println(list)
    println(map)

    println(set.maxOrNull())

    val nums = hashSetOf<Int>(10, 42, 5, 4) // 除 3 餘數: 1, 0, 2, 1
    // nums 除以 3 餘數的最大值 , it 代替 n -> n
    println(nums.maxByOrNull { it % 3 }) // { n -> n % 3 }
    // nums 除以 3 餘數的最小值
    println(nums.minByOrNull { it % 3 }) // { n -> n % 3 }

    val set2 = hashSetOf<Int>(1, 5, 2, 7, 6, 3)
    // set2 中偶數最大值與基數最大值
    println(set2.filter { it % 2 == 0 }.maxOrNull())

    // 動動腦, 請問誰的明茲最常
    val names = hashSetOf<String>("Helen", "John", "Jackson", "Anita")
    println(names.maxByOrNull { it.length })
    println(names.maxWithOrNull(compareBy { it.length }))

}
