package dev.vadzimv.slowtests

import android.app.Activity
import android.app.Application
import dev.vadzimv.slowtests.Plus
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock

class Doubles {

    val plus = mock<Plus> {
        on { doPlus(2, 2) } doReturn  4
        on { doPlus(3, 3) } doReturn  6
    }
    val activity = mock<Activity>()
    //val application = mock<Application>()
//    val plus = mockk<Plus> {
//        every { doPlus(2, 2) } returns 4
//        every { doPlus(3, 3) } returns 6
//    }
//    val plus = object : Plus {
//        override fun doPlus(a: Int, b: Int): Int = a + b
//    }

    @Test
    fun `two plus two`() {
        assertEquals(4, plus.doPlus(2, 2))
    }

    @Test
    fun `two plus two copy`() {
        assertEquals(6, plus.doPlus(3, 3))
    }

    @Test
    fun `two plus two copy 1`() {
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
    fun `two plus two copy 4`() {
        assertEquals(4, plus.doPlus(2, 2))
    }

    @Test
    fun `two plus two copy 5`() {
        assertEquals(4, plus.doPlus(2, 2))
    }

    @Test
    fun `two plus two copy 6`() {
        assertEquals(4, plus.doPlus(2, 2))
    }

    @Test
    fun `two plus two copy 7`() {
        assertEquals(4, plus.doPlus(2, 2))
    }

    @Test
    fun `two plus two copy 8`() {
        assertEquals(4, plus.doPlus(2, 2))
    }

    @Test
    fun `two plus two copy 9`() {
        assertEquals(4, plus.doPlus(2, 2))
    }

    @Test
    fun `two plus two copy 10`() {
        assertEquals(4, plus.doPlus(2, 2))
    }
}