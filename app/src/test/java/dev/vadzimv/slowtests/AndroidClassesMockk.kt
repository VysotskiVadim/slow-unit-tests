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
    fun `create activity`() {
        val activity = mockk<Activity>()
    }

    @Test
    fun `create activity relaxed`() {
        val activity = mockk<Activity>(relaxed = true)
    }

    @Test
    fun `create context`() {
        val context = mockk<Context>()
    }

    @Test
    fun `create context relaxed`() {
        val context = mockk<Context>(relaxed = true)
    }

    @Test
    fun `create location`() {
        val location = mockk<Location>()
    }

    @Test
    fun `create location relaxed`() {
        val location = mockk<Location>(relaxed = true)
    }
}