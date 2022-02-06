package chap04

interface Clickable {
    fun click()
    fun showOff() = println("im clickable") // default method
}

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if(b) "got" else "lost"} focus")
    fun showOff() = println("I'm focusable!")
}

class DupImplement :Clickable, Focusable {
    override fun click(){
        println("click!")
    }
    // default method 가 충돌 할때 재정의 하지않으면 컴파일 에러
    override fun showOff(){
        super<Clickable>.showOff(); // super 지정 가능
    }
}
