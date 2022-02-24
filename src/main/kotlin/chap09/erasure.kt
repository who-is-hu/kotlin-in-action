package chap09

// List<String> 객체를 만들어도 실행시점에는 String임을 모르고 List로써 다룸

fun main() {
    // 실행시점엔 단지 List임
    val list1: List<String> = listOf("a","b")
    val list2: List<Int> = listOf(1,2,3)

    // list1 에는 문자열만 들어있을거라 인식할 수 있는건 컴파일 타임에
    // String만 들어가게 타입 안전성을 제공해서?

    // erasure 의 한계
    // 실행시점에 인스턴스의 타입검사 못함
    // if (value is List<String>) { }
}