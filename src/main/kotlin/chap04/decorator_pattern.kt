package chap04

// 상속을 지원하지 않는 클래스에 기능을 변경/추가 해야하는경우 데코레이터 패턴을 많이 사용한다.
// 하지만 이는 준비 코드가 너무 많이 필요하다.
//
class DelegatingCollection<T> : Collection<T> {
    private val innerList = arrayListOf<T>()

    override val size: Int
        get() = innerList.size + 1 // 여기 하나만 바꿔도 아래 구현을 다만들어줘야함

    override fun contains(element: T): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<T> {
        TODO("Not yet implemented")
    }
}

class CountingSet<T> (
    val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet { // Mutablecollection의 구현은 innerSet에게 위임함

    var objectsAdded = 0

    // 이건 따로 구현함
    override fun add(element: T) : Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

}

