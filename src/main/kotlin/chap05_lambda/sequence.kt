package chap05_lambda

// map, filter 등 바로바로 새로운 리스트를 만드는데 이를 효율적으로 하기위해서

fun main() {
    val people = listOf(Person("hi", 12))

    people.asSequence()
        .map(Person::name)
        .filter { it.startsWith("A")}
        .toList()


}