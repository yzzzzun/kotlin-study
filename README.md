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

## Variable

Kotlin은 강력한 타입 추론을 제공합니다. 

반드시 초기화 작업을 해야합니다.(Compile 오류 발생)

```kotlin
var a: String = "initial"
val b: Int = 1
var c = 3 // 컴파일러가 Int 타입으로 추론
var d: Int = 4

println(a)
println(b)
println(c)
println(d)
```

var : 읽기/쓰기 가능

val : 불변

## Null Safety

Kotlin 은 NullPointerException을 예방하기위해 Null 할당을 허용하지 않습니다.

Null을 할당하고 싶다면 선언 끝에 ?를 붙여줍니다.

```kotlin
var neverNull: String = "never null"
// neverNull = null -> 컴파일 오류

var nullable: String? = "nullable"
nullable = null

var inferredNonNull = "nonNull inferred"
//추론된 타입도 null을 할당할 수 없음(컴파일 오류)
```

Null과 함께 동작해야 하는 경우는 다음과 같이 구현하지만, Kotlin에서는 우아하게 Null처리를 하는 방식을 제공합니다.

```kotlin
fun describeString(message: String?): String {
    if (message != null && message.isNotEmpty()) {
        return "Message length ${message.length}"
    } else {
        return "Empty or Null"
    }
}
```

