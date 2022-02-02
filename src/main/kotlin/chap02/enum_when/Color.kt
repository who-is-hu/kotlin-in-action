package chap02.enum_when

enum class Color(val r:Int, val g: Int, val b: Int){
    //RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
    RED(255,0,0),
    ORANGE(255,165,0),
    BLUE(1,1,1),
    PURPLE(9,9,9),
    ;

    fun rgb() = (r * 256 + g) * 256 + b
}