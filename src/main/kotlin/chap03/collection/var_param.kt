package chap03.collection

import kotlin.reflect.typeOf

fun varfun(vararg values: Int) {
    println(values)
    for (e in values) {
        println(e)
    }
}

fun main(args: Array<String>) {
    val list = listOf("args: ", *args) // * = unpack
    println(list)
    varfun(1,2,3,4)
}