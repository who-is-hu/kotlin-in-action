package chap04

class Outer {
    class StaticInner {} //코틀린은 기본적으로 static class 임
    inner class Inner {
        fun getOuterRef(): Outer = this@Outer
    } //inner 써야 outer 참조를 가지는 inner class 임
}