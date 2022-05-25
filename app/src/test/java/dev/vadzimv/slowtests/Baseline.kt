package dev.vadzimv.slowtests

import org.junit.Assert.assertEquals
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class Baseline {
    @Test
    fun `a - baseline`() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun `b - baseline copy`() {
        assertEquals(4, 2 + 2)
    }
}