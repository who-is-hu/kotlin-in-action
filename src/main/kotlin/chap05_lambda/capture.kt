package chap05_lambda

fun printProblemCounts(responses: Collection<String>) {
    // 이 변수들을 forEach에 넘기는 람다가 캡쳐링 함
    // Java 에서는 final 만 가능함
    // 캡처링이 있으면 람다 만들때 새로운 클래스를 만듦
    var clientErrors = 0
    var serverErrors = 0

    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("client : $clientErrors, server : $serverErrors")
}

fun main() {
    val responses = listOf("200", "500", "200")
    printProblemCounts(responses)
}