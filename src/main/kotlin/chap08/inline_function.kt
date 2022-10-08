package chap08

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock


// 캡처링 람다 -> 새로운 클래스 생성 의 비효울을 줄이기 위해서
// 호출부를 바이트코드로 박아버리는 기능 cpp inline 생각나는구만

inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    // 저장을 하려하면 inline 을 못함 이런 경우는 애초에 막고
    // val temp = action
    // val lr = LambdaRunner<T>()
    // lr.run(action)

    lock.lock()
    try {
       return action()
    } finally {
        lock.unlock()
    }
}

// TransformingSequence 는 internal class 임
// 아래는 map 의 본문
fun <T,R> Sequence<T>.map(transform: (T) -> R): Sequence<R> {
    // 이런식으로 전달해야할때는 새로 익명클래스 만들어짐
    return TransformingSequence(this, transform)
}

class LambdaRunner<T>() {
    fun run(lambda: () -> T) {
        lambda()
    }
}


fun testSync(lock: Lock) {
    val body = { println("im body") }

    println("before")
    synchronized(lock) { println("action") } // 전달받은 람다 본문도 인라이닝됨
    synchronized(lock, body) // 전달받은 람다는 인라이닝 되지 않음
    println("after")
}

fun main() {
    val lock: Lock = ReentrantLock()
    testSync(lock)
}