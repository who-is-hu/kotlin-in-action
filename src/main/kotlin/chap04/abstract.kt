package chap04

abstract class Animated {
    abstract fun animate()

    // 비추상 함수는 final 이여서 재정의하려면 얼여줘야함
    open fun stopAnimating() {
        println("stop")
    }
    fun animateTwice() {}
}