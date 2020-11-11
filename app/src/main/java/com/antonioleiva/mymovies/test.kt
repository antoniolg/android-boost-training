package com.antonioleiva.mymovies

data class Person(val name: String, val age: Int)

fun main() {
    val p = Person("John", 20)
    println(p)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}