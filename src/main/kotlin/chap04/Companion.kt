package chap04

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

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Thing {
    companion object : JSONFactory<Thing> { // 동반 객체에서 인터페이스 구현 가능
        override fun fromJSON(jsonText: String): Thing {
            TODO("Not yet implemented")
        }
    }
}
fun main() {
    val subsUser = Companion.newSubscribingUser("hi@hi.com")
    val facebookUser = Companion.newFacebookUser(12)
}
