package chap09

open class Animal {
    fun feed() {

    }
}

//out 키워드로 공변으로 만듬
// get(t : T): T 에서 파라미터가 in 위치고 반환 타입이 out 위치임
// out 으로두면 T를 out 위치에서만 사용하게해서 안전성 확보
// ex setAnimal(t: T) 를 막아서 변경하지 못하게 하는것
// 생성자는 나중에 불릴수 없음으로 괜찮음 ** 생성자 안의 var는 setter를 만듦으로 안됨
class Herd<out T: Animal>(val leader: T, vararg animals: T){
    val list: List<T> = listOf()
    val size: Int get() = 10
    operator fun get(i: Int): T {
        return list[i]
    }
}

fun feedAll(animals: Herd<Animal>){
    for (i in 0..animals.size) {
        animals[i].feed();
    }
}

class Cat : Animal() {

}

fun takeCareCats(cats: Herd<Cat>) {
    // feedAll(cats) // Herd 의 T에 아무런 변성을 지정하지 않아서 다른 타입으로 인식
    feedAll(cats as Herd<Animal>) // 가능하지만 실수하기 쉬움
    feedAll(cats)
}

fun main() {

}