fun main() {
    var neverNull: String = "never null"
    var nullable: String? = "nullable"
    nullable = null

    var inferredNonNull = "nonNull inferred"
    // inferredNonNull = null
    // 타입 추론시 null이 됤 수 없음

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)

    // strLength(nullable)

    val res = describeString("test")
    println(res);

    val emptyString = describeString("")
    println(emptyString);
}

fun describeString(message: String?): String {
    if (message != null && message.isNotEmpty()) {
        return "Message length ${message.length}"
    } else {
        return "Empty or Null"
    }
}