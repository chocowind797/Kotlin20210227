package com.類別與物件.列舉與印章

/**
 *  enum(列舉) 著重於數據資料
 *  sealed(密封/印章) 著重於類型
 **/

/*
abstract class Employee {
    abstract fun job()
}

class Developer: Employee() {
    override fun job() {
        println("寫程式")
    }
}

class Manager: Employee() {
    override fun job() {
        println("管人事")
    }
}
*/

// Employee 類透過 sealed 告知 Employee 物件的建立只能透過 Developer & Manager 來建立
sealed class Employee {
    abstract fun job()

    class Developer : Employee() {
        override fun job() {
            println("寫程式")
        }
    }

    class Manager : Employee() {
        override fun job() {
            println("管人事")
        }
    }
}

fun main() {
    val emp1 = Employee.Developer()
    emp1.job()
    val emp2 = Employee.Manager()
    emp2.job()
}
