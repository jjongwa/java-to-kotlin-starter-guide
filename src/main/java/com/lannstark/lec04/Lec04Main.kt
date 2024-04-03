package com.lannstark.lec04

fun main() {

    val money1 = JavaMoney(2_000L)
    val money2 = money1
    val money3 = JavaMoney(2_000L)

    println(money1 === money3)  // false
    println(money1 == money3)   // true

    val money4 = Money(4_000L)
    val money5 = Money(5_000L)
    println(money4 + money5)
}
