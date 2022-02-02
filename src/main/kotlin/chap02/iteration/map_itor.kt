package chap02.iteration

import java.util.*

val binaryReps = TreeMap<Char, String>()

fun main() {
    for (c in 'A'..'F') {
        binaryReps[c] = Integer.toBinaryString(c.toInt())
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}
