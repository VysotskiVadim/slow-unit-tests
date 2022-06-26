package dev.vadzimv.slowtests

import io.mockk.every
import io.mockk.mockkStatic
import org.junit.Assert.assertEquals
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class StaticMockingMockk {

    @Test
    fun `a - two + two`() {
        mockPlus {
            assertEquals(5, plus(2, 2))
        }
    }

    @Test
    fun `b - two + two copy 1`() {
        mockPlus {
            assertEquals(5, plus(2, 2))
        }
    }

    @Test
    fun `c - two + two copy 2`() {
        mockPlus {
            assertEquals(5, plus(2, 2))
        }
    }

    @Test
    fun `d - two + two 10 times`() {
        mockPlus {
            repeat(10) {
                assertEquals(5, plus(2, 2))
            }
        }
    }

    @Test
    fun `da - two + two 100 times`() {
        mockPlus {
            repeat(100) {
                assertEquals(5, plus(2, 2))
            }
        }
    }

    @Test
    fun `db - two + two 1000 times`() {
        mockPlus {
            repeat(1000) {
                assertEquals(5, plus(2, 2))
            }
        }
    }

    @Test
    fun `dc - two + two 10000 times`() {
        mockPlus {
            repeat(10000) {
                assertEquals(5, plus(2, 2))
            }
        }
    }

    @Test
    fun `e - two + two 10000 times no static mocking`() {
        repeat(10000) {
            assertEquals(4, plus(2, 2))
        }
    }

    @Test
    fun `f - four - two`() {
        mockMinus {
            assertEquals(3, minus(4, 2))
        }
    }

    @Test
    fun `g - four - two copy 1`() {
        mockMinus {
            assertEquals(3, minus(4, 2))
        }
    }

    @Test
    fun `h - 2 inner static mocks`() {
        mockkStatic(::plus) {
            every { plus(2, 2) } returns 5
            every { minus(4, 2) } returns 3
            assertEquals(5, plus(2, 2))
            assertEquals(3, minus(4, 2))
        }
    }

    @Test
    fun `i - 2 sequential static mocks`() {
        mockPlus {
            assertEquals(5, plus(2, 2))
        }
        mockMinus {
            assertEquals(3, minus(4, 2))
        }
    }

    inline fun mockPlus(block: () -> Unit) {
        mockkStatic(::plus) {
            every { plus(2, 2) } returns 5
            block()
        }
    }

    inline fun mockMinus(block: () -> Unit) {
        mockkStatic(::minus) {
            every { minus(4, 2) } returns 3
            block()
        }
    }
}

