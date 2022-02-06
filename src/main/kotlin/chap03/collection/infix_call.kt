package chap03.collection

// infix call 의 예
val map = mapOf(
    1 to "one", // 1.to("one")
    2 to "two"  // 2.to("two")
)
// mapOf 선언
// fun <K,V> mapOf(vararg values: Pair<K,V>): Map<K,V>

infix fun Any.to(other: Any) = Pair(this, other) // destructuring

fun main(args: Array<String>) {
    val (number, name) = 1 to "one"
}



