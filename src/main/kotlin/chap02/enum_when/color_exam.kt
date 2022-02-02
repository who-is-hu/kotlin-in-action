package chap02.enum_when

import java.lang.Exception

fun getMnemonic(color: Color) =
    //분기마다 break 안넣어도 됨
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "OF"
        else -> "hoho"
    }

fun getWarmth(color: Color) = when(color) {
    Color.RED, Color.ORANGE -> "warm"
    Color.BLUE -> "cool"
    else -> "i dont know"
}

fun mix(c1: Color, c2: Color) = when(setOf(c1, c2)) {
    setOf(Color.RED, Color.BLUE) -> Color.PURPLE
    else -> throw Exception("dirty color")
}

// 인자 없는 when은 분기가 boolean 값이여야함
fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == Color.RED && c2 == Color.BLUE) ||
                (c2 == Color.RED && c1 == Color.BLUE) -> Color.PURPLE
        else -> throw Exception("dirty color")
    }

