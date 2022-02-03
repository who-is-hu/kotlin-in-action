@file:JvmName("StringUtil") //JoinKt => StringUtil 로 클래스 이름 변경 가능

package strings

/*
static method가진 java class로 컴파일됨
JoinKt.class 로 컴파일
 */

fun greeting(): String {
    return "Hi"
}

// joinToString을 확장함수로 만들어보기
// fun Collection<String>.joinToString 처럼 명확한 명시도 가능
fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for((index, element) in this.withIndex()) {
        if (index >0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString();
}


