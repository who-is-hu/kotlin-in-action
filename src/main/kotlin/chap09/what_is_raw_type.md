## raw type
```java
class Item<T> {
    List<String> getString() {
        return "abc";
    }
}

Item item = new Item(); // 제네릭 파라미터 안넣고 만든걸 raw type이라함
```

이러면 `List<String>` 도 `List<Object>` 로 바뀜(소거됨)

jdk1.5 에서 제네릭이 새로 생기면서 기존의 코드들과 호환성을 지켜야했기에 raw type과 소거의 개념이 나옴

## erasure
제네릭에서 컴파일 타입에만 제네릭 파라미터 검사하고 런타임엔 다 소거시키는 것

```java
// 컴파일 타임
class Item<T extends AA> {
    void print(T t) { 
        System.out.print(t); 
    }
}

//runtime
class Item<AA> {
    void print(AA t) {
        System.out.print(t);
    }
}
```



