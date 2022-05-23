package dev.vadzimv.slowtests

import org.junit.Assert.assertEquals
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class ObjectMockingMockito {

    @Test
    fun `two plus two`() {
        val plus = createMockPlus()
        assertEquals(4, plus.doPlus(2, 2))
    }

    @Test
    fun `two plus two copy 1`() {
        val plus = createMockPlus()
        assertEquals(4, plus.doPlus(2, 2))
    }

    @Test
    fun `two minus two`() {
        val minus = createMockMinus()
        assertEquals(0, minus.doMinus(2, 2))
    }

    @Test
    fun `two minus two copy 1`() {
        val minus = createMockMinus()
        assertEquals(0, minus.doMinus(2, 2))
    }

    private fun createMockPlus() = mock<Plus> {
        on { doPlus(2, 2) } doReturn  4
    }

    private fun createMockMinus() = mock<Minus> {
        on { doMinus(2, 2) } doReturn 0
    }
}