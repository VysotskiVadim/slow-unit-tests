package dev.vadzimv.slowtests

import android.app.Activity
import android.content.Context
import android.location.Location
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import org.mockito.kotlin.mock

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class AndroidClassesMockito {

    @Test
    fun `a - warm up mockito`() {
        mock<Any>()
    }

    open class Activity1 : Activity()
    open class Activity2 : Activity()

    @Test
    fun `b - create activity 1`() {
        val activity = mock<Activity1>()
    }

    @Test
    fun `c - create activity 2`() {
        val activity = mock<Activity2>()
    }

    @Test
    fun `d - create context`() {
        val context = mock<Context>()
    }

    @Test
    fun `e - create context 2`() {
        val context = mock<Context>()
    }

    @Test
    fun `f - create location`() {
        val location = mock<Location>()
    }

    @Test
    fun `g - create location 2`() {
        val location = mock<Location>()
    }
}