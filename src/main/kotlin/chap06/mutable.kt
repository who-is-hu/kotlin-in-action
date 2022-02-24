package chap06

fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>){
    for (item in source) {
        target.add(item)
    }
}

// kotlin은 컬렉션에서 읽기 쓰기 인터페이스를 분리함

fun main() {
    val source: Collection<Int> = arrayListOf(3,5,6)
    val target: MutableCollection<Int> = arrayListOf(1)

    copyElements(source, target)
    println(target)
}