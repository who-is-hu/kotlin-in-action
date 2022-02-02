package chap02

class Person(
    val name: String, // 읽기 전용으로 비공개 필드와 게터
    var isMarried: Boolean // 쓸수 있는 프로퍼티 비공개 필드, 게터, 세터
)

