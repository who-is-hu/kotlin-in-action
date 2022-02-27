package chap09

import java.util.*

// ㄱㅏ능
inline fun <reified T> isA(value: Any) = value is T

fun main() {
    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>()) // reified 임
}

// inline은 함수 바디가 호출부분에 그대로 복붙됨으로 타입인자 대신 구체적인 타입을 명시할수 있음
// 그래서 reified 는 inline 에서만
