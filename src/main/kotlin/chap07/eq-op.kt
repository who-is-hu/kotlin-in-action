package chap07

class Point2(val x :Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if(other === this) return true // === 는 식별자 비교 (같은 포인터인지)
        if(other !is Point2) return false
        return (this.x == other.x && this.y == other.y)
    }
}