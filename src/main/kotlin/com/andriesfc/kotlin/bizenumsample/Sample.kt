package com.andriesfc.kotlin.bizenumsample

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

