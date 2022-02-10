package chap04

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

// 팩토리 패턴 편하게 만들기
class Companion {
    // factory pattern 을 만들기에 매우 유용하다.
    // Companion의 private에도 접근 가능
    private val p = 10
    // companion object Loader 이름 설정 가능
    companion object {
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))
    }
}

// 동반 객체에서 인터페이스 구현하기
interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Thing {
    companion object : JSONFactory<Thing> {
        override fun fromJSON(jsonText: String): Thing {
            TODO("Not yet implemented")
        }
    }
}

// 동반 객체 확장함수 정의하기
class Human(val firstName: String, val lastName: String) {
    companion object {}
}

fun Human.Companion.fromJSON(json: String){
    println(json)
}

// 객체를 식으로 쓰기 익명 객체
val listener = object : MouseAdapter() {
    // 주의 >> 익명 객체 구현은 싱글턴이 아니라 매번 생성됨
    override fun mouseClicked(e: MouseEvent?) {
        super.mouseClicked(e)
    }
}


fun main() {
    val subsUser = Companion.newSubscribingUser("hi@hi.com")
    val facebookUser = Companion.newFacebookUser(12)

    val p = Human.fromJSON("json string");
}
