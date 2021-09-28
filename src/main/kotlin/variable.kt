fun main() {
    var a: String = "initial"
    val b: Int = 1
    var c = 3
    var d: Int = 4
    println(a)
    println(b)
    println(c)
    println(d)

    val f: Int

    if (someCondition()) {
        f = 3
    } else {
        f = 4
    }
    println(f);
}

fun someCondition() = true
