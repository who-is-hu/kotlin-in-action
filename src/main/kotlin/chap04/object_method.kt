package chap04

class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name && postalCode == other.postalCode //smart cast
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}

// 이런 메서드들을 data class로 만들면 자동으로 만들어줌
data class BetterClient(val name: String, val postalCode: Int)

fun main() {
    val client = Client("huni", 123)
    println(client)

    val client2 = Client("huni", 123)
    println(client == client2) // 동등성 비교 => 내부적으로 equals 호출

    val ref = client
    println(ref === client) // 동일성 비교

    val lee = BetterClient("leelee", 4000)
    println(lee.copy(name = "huni"))
}