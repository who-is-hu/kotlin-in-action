package chap04

interface IUser {
    val nickname: String // getter를 정의해야한다는 뜻
}

class PrivateUser(override val nickname: String) : IUser

class SubscribingUser(val email: String) : IUser {
    override val nickname: String
        get () = email.substringBefore('@') // 호출마다 substring 연산
}

class FacebookUser(val accountId: Int) : IUser {
    override val nickname = getFacebookName(accountId) // 변수에 저장했다가 불러오는 방식
}

fun getFacebookName(accountId: Int) = "facebookuser_$accountId"

interface CustomProperty {
    val email: String // 하위에서 무조건 오버라이드 해야함
    val nickname: String // 오버라이드 안해도 가능
        get() = email.substringBefore('@')
}