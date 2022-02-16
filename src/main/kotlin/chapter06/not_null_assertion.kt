package chapter06

fun ignoreNulls(s: String?) {
    // 어떤 값이든 null 이 안되는 값으로 만듬
    // s 가 null 이면 npe
    val sNotNull: String = s!!
    println(sNotNull.length)
}

fun main() {
    ignoreNulls(null)
}