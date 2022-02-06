package chap04

//java 의 기본 접근제어인 default는 코틀린에 없음
//코틀린은 패키지를 네임스페이스 관리용으로만 사용하기 때문

// 모듈 내부 접근자인 internal이 생김
// 최상위 선언에 private을 제공함 => 파일 내부에서만 사용할 수 있게 가능

internal open class TalkativeButton : Focusable {
    private fun yell() = println("hey")
    protected fun whisper() = println("lets talk")
}

// 확장함수는 캡슐화를 깨지 않는 다는것 다시 복기!
//fun TalkativeButton.giveSpeech() { //public 인 확장함수가 internal인 TalkativeButton을 노출
//    yell() // private
//    whisper() // protected
//}