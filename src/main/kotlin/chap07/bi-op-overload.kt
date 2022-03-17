package chap04

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

operator fun Point.minus(other: Point): Point {
    return Point(x - other.x, y - other.y)
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

// a * b == b * a 를 자동으로 해주지는 않음 정의해야함
operator fun Double.times(point: Point): Point {
    return Point((this * point.x).toInt(), (this * point.y).toInt())
}

fun main() {
    val point = Point(10, 10)
    val other = Point(2,2)
    println(point - other)
    println(point + other)

    println(point * 3.0)
    println(3.0 * point)

    var sumPoint = Point(10, 10)
    sumPoint += Point(2,2)
    println(sumPoint)
}