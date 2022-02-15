package chap05_lambda

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun alphabet2() : String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) { // 중괄호 람다임 with(sb, lambda)
        for (letter in 'A'..'Z') {
            this.append(letter) // this 명시
        }
        append("\n Now i know") // this 생략
        this.toString()
        // this@OuterClass.toString() 이름 충돌시 바깥의 함수 호출하는법
    }
}

fun alphabet3(postfix: String) = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\n now ~~~~~~~~~~~~~")
    append(postfix)
    toString()
}

// apply 는 수신객체를 반환함 StringBuilder 를 반환
fun alphabetApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\n apply")
}.toString()

fun main() {
    println(alphabet())
    println(alphabet2())
    println(alphabet3("???"))
}