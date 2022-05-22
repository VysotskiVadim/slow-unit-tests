package dev.vadzimv.slowtests

import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock

class ObjectMockingMockito {

    val plus = mock<Plus> {
        on { doPlus(2, 2) } doReturn  4
        on { doPlus(3, 3) } doReturn  6
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