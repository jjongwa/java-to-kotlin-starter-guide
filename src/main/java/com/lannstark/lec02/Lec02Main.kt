package com.lannstark.lec02

fun main() {

    val str: String = "ABC"
    println(str.length)

//    val str2: String? = "ABC"
//    println(str2.length)  // error

    val str3: String? = "ABC"
    println(str3?.length)

    val str4: String? = null
    println(str4?.length ?: 0)  // 0

    val person = Person("굿다이노 밷다이노")
    startsWithA(person.name)
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}
