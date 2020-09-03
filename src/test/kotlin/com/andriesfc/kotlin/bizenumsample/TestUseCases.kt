package com.andriesfc.kotlin.bizenumsample

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestUseCases {

    @Test
    fun accessingViaLabel() {
        assertEquals(LogLevel.NONE, LogLevel.fromLabel("none"))
    }

    @Test
    fun accessViaLevelOnTopLevel() {
        assertEquals(LogLevel.WARN, LogLevel(2))
    }
}