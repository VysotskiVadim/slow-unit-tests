package dev.vadzimv.slowtests

import org.junit.Assert.assertEquals
import org.junit.Test

class ObjectMockingMockk {

    val plus = object : Plus {
        override fun doPlus(a: Int, b: Int): Int = a + b
    }

    @Test
    fun `two plus two`() {
        assertEquals(4, plus.doPlus(2, 2))
    }

    @Test
    fun `two plus two copy 2`() {
        assertEquals(4, plus.doPlus(2, 2))
    }

    @Test
    fun `two plus two copy 3`() {
        assertEquals(4, plus.doPlus(2, 2))
    }
}