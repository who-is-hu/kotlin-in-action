package chap06

fun sendEmailTo(email: String) {
    println("sending email to $email")
}

fun greetTo(name: String) {
    println("hello $name")
}

fun getPerson(): Person{
    return Person("hi", null)
}

fun main() {
    val email: String? = null
    // sendEmailTo(email) 바로 컴파일 에러

    // null 체크해야함
    if (email != null) sendEmailTo(email)

    // let 사용
    // null 이면 아무것도 안함
    // null 아니면 잘 실행
    email?.let { email -> sendEmailTo(email) }
    email?.let { sendEmailTo(it)}

    // 좀더 좋은 예
    // 이거 대신
    val person: Person? = getPerson()
    if (person != null) greetTo(person.name)
    // 이렇게
    getPerson()?.let { greetTo(it.name) }
}