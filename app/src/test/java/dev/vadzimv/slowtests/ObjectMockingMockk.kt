package dev.vadzimv.slowtests

import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test

class ObjectMockingMockk {

    val plus = mockk<Plus> {
        every { doPlus(2, 2) } returns 4
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

    @Test
    fun `two minus two`() {
        val minus = mockk<Minus> {
            every { doMinus(2, 2) } returns 0
        }
        assertEquals(0, minus.doMinus(2, 2))
    }
}