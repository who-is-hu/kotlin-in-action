package chap02.enum_when

interface Expr
class Num(val value: Int) :Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        return e.value

    //        val n = e
    //        val n = e as Num  => 명시적 타입 캐스팅
    //        "as" 는 불필요한 중복임 is에서 smart cast 됨
    //        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("unknown expression")
}

fun eval2(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval(e.right) + eval(e.left)
    } else {
        throw IllegalArgumentException("unknown expression")
    }

fun eval3(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else -> throw IllegalArgumentException("unknown")
    }

fun evalWithLogging(e :Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("unknown")
    }

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}
