package chap09

// 확장 프러퍼티에 제네릭
val <T> List<T>.penultimate: T
    get() = this[size-2]