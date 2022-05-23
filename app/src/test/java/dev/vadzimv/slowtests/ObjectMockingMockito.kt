package dev.vadzimv.slowtests

import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock

class ObjectMockingMockito {

    val plus = mock<Plus> {
        on { doPlus(2, 2) } doReturn  4
    }

    @Test
    fun `two plus two`() {
        assertEquals(4, plus.doPlus(2, 2))
    }

    @Test
    fun `two plus two copy 1`() {
        assertEquals(4, plus.doPlus(2, 2))
    }
}