package dev.vadzimv.slowtests

import kotlinx.coroutines.delay
import kotlinx.coroutines.test.runTest
import org.junit.Test

class Coroutines {

    @Test
    fun `delay experiment`() = runTest {
        delay(1000)
    }

    @Test
    fun `delay experiment copy 1`() = runTest {
        delay(1000)
    }

    @Test
    fun `delay experiment copy 2`() = runTest {
        delay(1000)
    }

    @Test
    fun `delay experiment copy 3`() = runTest {
        delay(1000)
    }
}