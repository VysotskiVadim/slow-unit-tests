package dev.vadzimv.slowtests

import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkStatic
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, plus(2, 2))
    }

    @Test
    fun staticMockingMockk() {
        mockkStatic(::example) {
            every { example() } returns 4
            assertEquals(4, example())
        }
    }

    @Test
    fun smallClassMockingMockk() {
        val mock = mockk<ExampleSmall>(relaxed = true) {
            every { example() } returns 8
        }
        assertEquals(8, mock.example())
    }

    @Test
    fun bigClassMockingMockk() {
        val mock = mockk<ExampleBig>(relaxed = true)
        assertEquals(0, mock.example5().size)
    }

    @Test
    fun smallClassMockingMockito() {
        val mock = mock<ExampleSmall>() {
            on { example() } doReturn 8
        }
        assertEquals(8, mock.example())
    }

    @Test
    fun bigClassMockingMockito() {
        val mock = mock<ExampleBig>()
        assertEquals(0, mock.example())
    }
}

fun example() = 5

interface ExampleSmall {
    fun example(): Int
}

interface ExampleBig {
    fun example(): Int
    fun example2(): String
    fun example3(): Boolean
    fun example4(): Double
    fun example5(): Map<Int, String>
    fun example6(): List<String>
    fun example7(): Int
    fun example8(): Int
    fun example9(): Int
    fun example10(): Int
    fun example11(): Int

}