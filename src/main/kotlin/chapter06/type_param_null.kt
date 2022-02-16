package chapter06

fun <T> printHashCode(t: T) {
    println(t?.hashCode()) // t 는 null 일수 있음
}

fun <T: Any> printHashCode2(t: T) {
    println(t.hashCode()) // null 일수 없음
}