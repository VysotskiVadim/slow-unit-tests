package dev.vadzimv.slowtests

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Assert.assertEquals
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class ObjectMockingMockk {

    @Test
    fun `a - two plus two`() {
        val plus = createMockPlus()
        assertEquals(4, plus.doPlus(2, 2))
    }

    @Test
    fun `b - two plus two copy`() {
        val plus = createMockPlus()
        assertEquals(4, plus.doPlus(2, 2))
    }

    @Test
    fun `c - two plus two copy with verify`() {
        val plus = createMockPlus()
        assertEquals(4, plus.doPlus(2, 2))
        verify { plus.doPlus(2, 2) }
    }

    @Test
    fun `d - two minus two`() {
        val minus = createMockMinus()
        assertEquals(0, minus.doMinus(2, 2))
    }

    @Test
    fun `e - two minus two copy 1`() {
        val minus = createMockMinus()
        assertEquals(0, minus.doMinus(2, 2))
    }

    private fun createMockPlus() = mockk<Plus> {
        every { doPlus(2, 2) } returns 4
    }

    private fun createMockMinus() = mockk<Minus> {
        every { doMinus(2, 2) } returns 0
    }
}