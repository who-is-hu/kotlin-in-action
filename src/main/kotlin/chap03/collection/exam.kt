package chap03.collection
import extend.lastChar
// import extend.*
import extend.lastChar as extendedLastChar
import strings.*

fun main() {
    println("hohoX".lastChar()) // import는 해야 사용할 수 있다.
    println("hohoC".extendedLastChar()) // 이름을 바꾸는게 이름충돌을 피하는 좋은 방법중 하나

    val list = listOf(1,2,3)
    println(list.joinToString(":","<",">")) // 확장 함수 사용
}