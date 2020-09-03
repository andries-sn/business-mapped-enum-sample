package com.andriesfc.kotlin.bizenumsample

enum class LinkMode(private val code: String, private val position: Int) {

    UNI_DIRECTION("uni", 1),
    NONE("none", 0),
    BI_DIRECTION("bi", 3);

    companion object : EnumMappedLookup<LinkMode, Int> by enumFromMapped(LinkMode::position)  {
        val fromPosition = this
        val fromCode = enumFromMapped(LinkMode::code)
    }
}

