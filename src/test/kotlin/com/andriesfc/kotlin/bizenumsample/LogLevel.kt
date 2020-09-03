package com.andriesfc.kotlin.bizenumsample

enum class LogLevel(val label: String, val level: Int) {

    NONE("none", 0),
    INFO("info", 1),
    WARN("warn", 2),
    ERROR("error", 3),
    DEBUG("debug", 4);

    companion object : EnumMappedLookup<LogLevel, Int> by enumFromMapped(LogLevel::level) {
        val fromLevel = this
        val fromLabel = enumFromMapped(LogLevel::label)
    }
}