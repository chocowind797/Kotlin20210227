package com.函式呼叫.DRY

// DRY (Don't Repeat Yourself)
// 減少重複的程式碼

data class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    println("Save $user")
}

fun main() {
    val user = User(1, "", "Taoyuan")

    // 驗證是否每個欄位都有資料
    user.validateBeforeSave()
    saveUser(user)
}

fun User.validateBeforeSave() {
//    println("$id, $name, $address")
    // 驗證
    fun valid(value: String, fieldName: String) {
        if(value.isEmpty()){
            throw Exception("Cannot Save user $id empty $fieldName")
        }
    }
    valid(name, "Name")
    valid(address, "Address")
}