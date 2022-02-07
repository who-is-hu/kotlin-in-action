package chap04


//singleton
object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        for (person in allEmployees) {

        }
    }
}

//상태값이 필요없는 클래스 구현에 사용하면 좋다
data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(o1: Person, o2: Person): Int = o1.name.compareTo(o2.name)
    }
}


fun main() {
    println(Payroll.allEmployees)
    val people = listOf(Person("huni"), Person("alice"))
    println(people.sortedWith(Person.NameComparator))
}

// java 에선 INSTANCE 라는 필드로 접근하면됨 