package dev.vadzimv.slowtests

fun plus(a: Int, b: Int) = a + b

interface Plus {
    fun doPlus(a: Int, b: Int): Int
}