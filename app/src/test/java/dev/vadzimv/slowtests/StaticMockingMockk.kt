package dev.vadzimv.slowtests

import io.mockk.every
import io.mockk.mockkStatic
import io.mockk.unmockkStatic
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class StaticMockingMockk {
    @Before
    fun setup() {
        mockkStatic(::plus)
        every { plus(2, 2) } returns 4
    }

    @After
    fun tearDown() {
        unmockkStatic(::plus)
    }

    @Test
    fun `two + two`() {
        Assert.assertEquals(4, plus(2, 2))
    }

    @Test
    fun `two + two copy 1`() {
        Assert.assertEquals(4, plus(2, 2))
    }

    @Test
    fun `two + two copy 2`() {
        Assert.assertEquals(4, plus(2, 2))
    }

    @Test
    fun `two + two copy 3`() {
        Assert.assertEquals(4, plus(2, 2))
    }

    @Test
    fun `two + two copy 4`() {
        Assert.assertEquals(4, plus(2, 2))
    }

    @Test
    fun `two + two copy 5`() {
        Assert.assertEquals(4, plus(2, 2))
    }

    @Test
    fun `two + two copy 6`() {
        Assert.assertEquals(4, plus(2, 2))
    }

    @Test
    fun `two + two copy 7`() {
        Assert.assertEquals(4, plus(2, 2))
    }

    @Test
    fun `two + two copy 8`() {
        Assert.assertEquals(4, plus(2, 2))
    }

    @Test
    fun `two + two copy 9`() {
        Assert.assertEquals(4, plus(2, 2))
    }

    @Test
    fun `two + two copy 10`() {
        Assert.assertEquals(4, plus(2, 2))
    }
}

