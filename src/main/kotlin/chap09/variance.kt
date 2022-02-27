package chap09

import strings.joinToString

// 변성 : List<String> 과 List<Any> 처럼 기저타입이 같고 타입인자가 다른 타입이 어떤 관계인지 설명하는 개념

fun printContents(list: List<Any>) { // safe
    println(list.joinToString())
}

fun addAnswer(list: MutableList<Any>) { // unsafe
    list.add(42)
}

fun main(args: Array<String>) {
    printContents(listOf("abc", "bac"))
    val strings = mutableListOf("abc", "bac")
    // addAnswer(strings) // compile error

}
