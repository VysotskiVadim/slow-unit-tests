package dev.vadzimv.slowtests

import org.junit.Assert.assertEquals
import org.junit.Test

class Objects {

    @Test
    fun `a - two plus two`() {
        val plus = createPlus()
        assertEquals(4, plus.doPlus(2, 2))
    }

    @Test
    fun `b - two plus two copy`() {
        val plus = createPlus()
        assertEquals(4, plus.doPlus(2, 2))
    }

    private fun createPlus() = object : Plus {
        override fun doPlus(a: Int, b: Int): Int = a + b
    }
}