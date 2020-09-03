# Handling business mapped values as Enums

Sample how to use and declare custom lookups on enums based business codes. 

This enables code patterns such as: 

```kotlin

fun main() {
    println(LinkMode.fromCode("bi"))
    println(LinkMode.fromPosition(2))
}

enum class LinkMode(private val code: String, private val position: Int) {

    UNI_DIRECTION("uni", 1),
    NONE("none", 0),
    BI_DIRECTION("bi", 3);

    companion object  {
        val fromPosition = enumFromMapped(LinkMode::position)
        val fromCode = enumFromMapped(LinkMode::code)
    }
}
```

 