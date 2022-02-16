package chapter06

class Address(val streetAddress: String, val zipCode: Int,
    val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person(val name: String, val company: Company?)

fun printShippingLabel(person: Person) {
    val address = person.company?.address
        ?: throw IllegalArgumentException("no address")
    with (address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

val address = Address("Elsestr 49", 1234, "nin", "Korea")
val jetbrains = Company("jetbrain", address)
val person = Person("dmitry", jetbrains)

fun main() {
    printShippingLabel(person)
}