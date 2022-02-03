package extend

// 클래스 밖에 선언된 함수를 클래스의 것 처럼 호출하게 해주는 기능

fun String.lastChar(): Char = this.get(this.length - 1)
/*
String에다가 lastChar()를 추가한다.
this가 String 객체다.
 */

// 하지만 캡슐화를 깨지는 않는다.
// ex ) String class 에 정의된 private, protected 같은 애들에는 접근할 수 없음

// java 에서는 수신객체(String)을 첫번째 인자로 받는 static method로 컴파일 됨
// ExtendFunctionKt.lastChar("abcd") 같은 방식으로 사용 가능

fun main() {
    println("hello".lastChar())
}