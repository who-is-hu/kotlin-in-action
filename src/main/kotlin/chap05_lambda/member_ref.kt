package chap05_lambda

fun topLambda() = println("top")

fun Person.isAdult() = age >= 21

fun main() {
    // 메서드를 람다로 바꾸는 법< 멤버 참조 >
    val lambda = Person::willBeLambda

    // 최상위 함수 람다 변경
    run(::topLambda)

    // 생성자 람다
    val createPerson = ::Person
    val p = createPerson("huni", 26)

    // 확장함수 람다
    val predicate = Person::isAdult
}