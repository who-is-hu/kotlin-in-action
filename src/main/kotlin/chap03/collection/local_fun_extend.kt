package chap03.collection

// 기존의 중복성 코드
class User(val id: Int, val name: String, val address: String)

fun oldSaveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id} : empty Name"
        )
    }
    if (user.address.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty address"
        )
    }
}

//validate 가 클래스 내부로 들어간다면 이러한 작은 메서드들이 많아져서 함수간 관계를 파악하기 어려워질 수 있음
//별도의 inner class 에 넣으면 더 좋지만 준비 코드가 늘어남 => (Todo: inner class 이야기 예시를 모르겠음)
fun saveUser(user: User) {

    // 로컬 펑션으로 중복을 제거
    // 바깥 스코프의 변수 사용가능함
    fun validate(value: String, filedName: String){
        if(value.isEmpty()){
            throw IllegalArgumentException(
                "Can't save user ${user.id} : empty $filedName"
            )
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")
}

// validate 는 saveUser 말고 다른곳에 사용하지 않는다 치면 user에 포함시키고 싶지 않을 수 있음
// 이럴 때 확장 함수로 분리할수도 있음
fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String){
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user $id: empty $fieldName"
            )
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser2(user: User){
    user.validateBeforeSave()
}