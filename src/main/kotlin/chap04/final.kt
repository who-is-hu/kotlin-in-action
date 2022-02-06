package chap04

// 상위 클래스의 변경에따른 하위클래스에 끼치는 영향을 예상하기 힘듬
// 그래서 상속에 관한 문서를 만들거나 final로 상속자체를 막으려는 시도를 함

// java와 다르게 kotlin 의 class와 method는 기본적으로 finald임

open class RichButton: Clickable { // open 키워드로 상속열어줌
    fun disable() {}  // final
    open fun animate() {} // 오버라이드 가능
    override fun click() {
        println("clicked")
    }

    final override fun showOff() { // 오버라이딩 한 애들은 open이여서 막으려면 final 필요
        super.showOff();
    }
}
