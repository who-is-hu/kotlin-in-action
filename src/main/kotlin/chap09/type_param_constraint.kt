package chap09

// 상한 Number 거나 그 자식클래스
fun <T: Number> List<T>.sum(): T {
    return sum();
}

fun <T: Number> oneHalf(value: T) : Double {
    // value 를 Number 처럼 다룰수 있음
    return value.toDouble() / 2.0
}

// Comparable을 구현한 애들만
fun <T: Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

// type parameter의 제약을 목록으로 걸수있음
fun <T> ensureTrailingPeriod(seq: T) where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
        seq.append('.')
    }
}

// 제약이 없으면 Any? 를 상한으로 두는것
// null 이 될수있음으로 안전한 호출 필요
class Processor<T> {
    fun process(value: T) {
        value?.hashCode()
    }
}


