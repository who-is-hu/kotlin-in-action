package chap07

class Person(val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
    }
}

fun main() {
    val p1 = Person("hi", "mi")
    val p2 = Person("ai", "mi")
    println(p1 > p2)
}