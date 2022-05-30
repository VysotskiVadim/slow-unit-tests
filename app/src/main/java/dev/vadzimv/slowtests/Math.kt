package dev.vadzimv.slowtests

fun plus(a: Int, b: Int) = a + b
fun minus(a: Int, b: Int) = a - b

interface Plus {
    fun doPlus(a: Int, b: Int): Int
}

interface Minus {
    fun doMinus(a: Int, b: Int): Int
}