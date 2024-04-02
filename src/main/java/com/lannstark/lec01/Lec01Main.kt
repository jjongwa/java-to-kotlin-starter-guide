package com.lannstark.lec01

fun main() {

    var number1: Long = 10L
    var number3: Long = 1_000L

    println(number1)

    val number2: Long = 10L

//    var number4: Long = 1_00L
//    number4 = null    // error

    var number5: Long? = 1_00L
    number5 = null

    var person = Person("신종화")
}