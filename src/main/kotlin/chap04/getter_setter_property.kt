package chap04

class User3(val name: String){
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".
            """.trimIndent())
            field = value
        }
}

class LengthCounter {
    var counter: Int = 0
        private set //외부에서 값 변경 불가능
    fun addWord(word: String) {
        counter += word.length
    }
}
fun main() {
    val user = User3("Alice")
    user.address = "Edfadsfsdaa 123 213213"

    val lengthCounter = LengthCounter()
    lengthCounter.addWord("hihi")
    println(lengthCounter.counter)
}