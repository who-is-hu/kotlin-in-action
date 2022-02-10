package chap05_lambda

data class Person(val name: String, val age: Int) {
    fun willBeLambda() {}
}


fun main() {
    val people = listOf(Person("Huni", 26), Person("Guni", 27))

    val sum = {x: Int, y: Int -> x+y} // 람다를 저장할땐 매개변수 타입을 추론할수 없으니 명시해줘야함
    val multiLineLambda = {x: Int ->
        println("line1")
        x // 마지막 평가식이 리턴값
    }
    println(sum(1,2));
    { println("in lambda") }();
    run { println("in run") }

    // 생략 과정
    val r1 = people.maxOf({p: Person -> p.age})
    val r2 = people.maxOf() { p: Person -> p.age } // 맨 뒤의 인자가 람다면 밖으로 뺄수 있다.
    val r3 = people.maxOf { p: Person -> p.age }   // 람다가 유일한 인자면 괄호 제거
    val r4 = people.maxOf { p -> p.age}            // 타입 추론 가능
    val r5 = people.maxOf { it.age }


}