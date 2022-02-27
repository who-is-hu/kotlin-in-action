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

    // if (value is List<*>) { } list인건 알지만 무슨 list인지는 모를
    // if (value is List<String>) { } 이건 컴파일 에러

    printSum(listOf(1,2,3))
    //printSum(listOf("1","2")) // 런타임에 캐스팅에러가 남 => List<Int>가 런타임에 List로 소거되기때문에 캐스팅이 가능해서 sum호출하다 에러
    //printSum(setOf(1,2)) // 기저타입 안맞아서 argumentException
}

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int>
        ?: throw IllegalArgumentException("list is expected")
    println(intList.sum())
}