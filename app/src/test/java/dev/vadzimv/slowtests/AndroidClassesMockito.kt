package dev.vadzimv.slowtests

import android.app.Activity
import android.content.Context
import android.location.Location
import org.junit.Test
import org.mockito.kotlin.mock

class AndroidClassesMockito {
    @Test
    fun `create activity`() {
        val activity = mock<Activity>()
    }

    @Test
    fun `create activity 2`() {
        val activity = mock<Activity>()
    }

    @Test
    fun `create context`() {
        val context = mock<Context>()
    }

    @Test
    fun `create context 2`() {
        val context = mock<Context>()
    }

    @Test
    fun `create location`() {
        val location = mock<Location>()
    }

    @Test
    fun `create location 2`() {
        val location = mock<Location>()
    }
}