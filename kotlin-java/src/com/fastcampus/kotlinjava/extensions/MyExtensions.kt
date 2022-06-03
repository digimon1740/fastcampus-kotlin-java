package com.fastcampus.kotlinjava.extensions

fun String.first(): Char {
    return this[0]
}

@JvmName("addFirstChar")
fun String.addFirst(char: Char): String {
    return char + this.substring(0)
}

fun main() {
    println("ABCD".first())		// 출력 : A

    println("ABCD".addFirst('Z'))   // 출력 : ZABCD
}