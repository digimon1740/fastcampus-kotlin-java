package com.fastcampus.kotlinjava.jvmstatic

class HelloClass {

    companion object {

        @JvmStatic
        fun hello() = "hello!"

    }
}

object HiObject {

    @JvmStatic
    fun hi() = "hi!"
}

fun main() {
    val hello = HelloClass.hello()
    println(hello)

    val hi = HiObject.hi()
    println(hi)


}