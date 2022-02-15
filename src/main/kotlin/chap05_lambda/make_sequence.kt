package chap05_lambda

import java.io.File

fun main() {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numberTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numberTo100.sum()) // 최종연산 수행전까지 계산되지않음
}

// 상위를 뒤지면서 숨김속성이 있는 디렉터리가 있나 확인
fun File.isInsideHiddenDirectory() =
    generateSequence(this) {it.parentFile}.any {it.isHidden}

