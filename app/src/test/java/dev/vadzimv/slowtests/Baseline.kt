package dev.vadzimv.slowtests

import org.junit.Assert.assertEquals
import org.junit.Test

class Baseline {
    @Test
    fun baseline() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `baseline copy`() {
        assertEquals(4, 2 + 2)
    }
}