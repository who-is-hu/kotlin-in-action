package chap04

import javax.naming.Context
import javax.print.attribute.AttributeSet

open class User(val nickname: String) //이거 소괄호 자체가 주 생성자임

//class User constructor(_nickname: String) {
//    val nickname: String
//    init {
//        nickname = _nickname
//    }
//}

/*
* class User(_nickname: String) {
*   val nickname = _nickname
* }
* */

class TwitterUser(nickname: String) : User(nickname)

open class Button // 자동으로 default 생성자 생김

class RadioButton : Button() // 상속받을땐 부모타입의 생성자를 호출해줘야함

class Secretive private constructor() {} // 주 생성자를 외부에 비공개 한것

open class View {
    // 부 생성자들
    constructor(ctx: Context) {}
    constructor(ctx: Context, attr: AttributeSet) {}
}

class MyButton : View {
    //constructor(ctx: Context) : this(ctx, MY_STYLE) {} // 클래스 내의 다른 생성자에게 위임 가능
    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {}
}