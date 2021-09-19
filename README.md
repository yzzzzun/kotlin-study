# kotlin-study
Kotlin Study Repository

## Function

`fun` 키워드를 통해 함수를 선언합니다.

void함수는 Unit을 반환해서 만들어 줍니다.

```kotlin
fun 함수명(param1: 타입, param2: 타입) : return타입
```

단일 표현식 함수에서는 리턴 타입을 설정하지 않으면 타입 추론을 합니다.

```kotlin
fun sum(x: Int, y: Int) = x + y
```

#### Default Parameter

파라미터 기본값을 설정할 수 있습니다.

함수 호출시 값을 설정하지 않으면 기본값으로 설정한 값을 사용합니다.

```kotlin
fun printMessageWithPrefix(message: String, prefix: String = "Info")
```

#### Named Arguments

```kotlin
fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message")
}

printMessageWithPrefix(prefix = "Log", message = "Hello") 
```

함수 호출시 파라미터 명과 함께 셋팅하면 파라미터 순서와 상관없이 함수를 호출 할 수 있습니다.

> 개인적인 생각으로 타입 추론이 가능 하지만 되도록 return 타입을 선언하는게 가독성 측면에서 좋지 않을까 하는 생각을 하게 됩니다.

