package dev.vadzimv.slowtests

import android.app.Activity
import android.content.Context
import android.location.Location
import io.mockk.mockk
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class AndroidClassesMockk {

    @Test
    fun `a - warm up mockk`() {
        mockk<Any>()
    }

    open class Activity1 : Activity()
    open class Activity2 : Activity()

    @Test
    fun `b - create activity 1`() {
        val activity = mockk<Activity1>()
    }

    @Test
    fun `c - create activity 2`() {
        val activity = mockk<Activity2>()
    }

    @Test
    fun `d - create context`() {
        val context = mockk<Context>()
    }

    @Test
    fun `e - create context 2`() {
        val context = mockk<Context>()
    }

    @Test
    fun `f - create location`() {
        val location = mockk<Location>()
    }

    @Test
    fun `g - create location 2`() {
        val location = mockk<Location>()
    }
}