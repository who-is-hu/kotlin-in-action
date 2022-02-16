package chapter06_2

class Person(val firstName: String, val lastName: String) {
    override fun equals(o: Any?): Boolean {
        // as? 는 CastException 뱉는대신 null 을 반환
        val otherPerson = o as? Person ?: return false

        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode() : Int = firstName.hashCode() * 37 + lastName.hashCode()
}

