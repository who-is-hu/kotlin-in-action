package chap02.exception

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

//try 를 식으로 사용하는 방법
fun readNumber2(reader: BufferedReader){
    val number = try {
        Integer.parseInt(reader.readLine()) // try 의 값
    } catch (e: NumberFormatException){
        return
    }
    println(number) // 실행되지 않음
}

fun main() {
    val reader = BufferedReader(StringReader("1234"))
    println(readNumber(reader))

    val reader2 = BufferedReader(StringReader("12a3412412"))
    readNumber2(reader2)
}