package extend

import java.lang.StringBuilder

// 클래스 밖에 선언된 함수를 클래스의 것 처럼 호출하게 해주는 기능
// 하지만 캡슐화를 깨지는 않는다.
// ex ) String class 에 정의된 private, protected 같은 애들에는 접근할 수 없음

// java 에서는 수신객체(String)을 첫번째 인자로 받는 static method로 컴파일 됨
// ExtendFunctionKt.lastChar("abcd") 같은 방식으로 사용 가능


//String에다가 lastChar()를 추가한다.
//this가 String 객체다.
fun String.lastChar(): Char = this.get(this.length - 1)

// 확장 프로퍼티
val String.lastChar: Char
    get() = get(length - 1)

// 변경 가능한 확장 프로퍼티
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length-1, value)
    }

fun main() {
    println("extended functionF".lastChar())
    println("extended PropertyP".lastChar)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}