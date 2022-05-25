package dev.vadzimv.slowtests

import org.junit.Assert.assertEquals
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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