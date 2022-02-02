package chap02.geometry.shapes

import java.util.*

class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean // 값을 저장하지 않는 프로퍼티
        get () {
            return height == width
        }
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}