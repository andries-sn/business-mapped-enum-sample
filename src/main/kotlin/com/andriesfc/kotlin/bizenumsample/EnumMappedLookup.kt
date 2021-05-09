package com.andriesfc.kotlin.bizenumsample


fun interface EnumMappedLookup<E, T> where E : Enum<E> {
    operator fun invoke(mappedBy: T): E
}

inline fun <reified E, T> enumFromMapped(enumToMappedValue: (E) -> T): EnumMappedLookup<E, T> where E : Enum<E> {
    val enums = E::class.java.enumConstants.associateBy { enumToMappedValue(it) }
    return EnumMappedLookup { requireNotNull(enums[it]) }
}
