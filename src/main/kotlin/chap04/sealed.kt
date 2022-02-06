package chap04

//interface Expr
//class Num(val value: Int) : Expr
//class Sum(val left: Expr, val right: Expr) : Expr
//
//fun eval(e: Expr): Int =
//    when (e) {
//        is Num -> e.value
//        is Sum -> eval(e.right) + eval(e.left)
//        else -> throw IllegalArgumentException("unknown")
//    }


// Expr을 외부에서 상속 불가능한 클래스로 만듬
sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
        //else 분기문 없어도됨 Expr 에 inner class 늘어나면 컴파일 에러가 뜸
    }