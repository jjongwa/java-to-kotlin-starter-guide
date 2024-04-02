package com.lannstark.lec03

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0L

    printAgeIfPerson(Person("", 100))

    val person = Person("신종화", 100)
    println("이름: ${person.name}")

    val str = """
        ABC
        EFG
        ${person.name}
    """.trimIndent()

    println(str)
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}
