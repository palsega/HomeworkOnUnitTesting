package com.palchak.sergey.homeworkonunittesting

object Homework {
    /**
     * Returns the n-th fibonacci number
     * They are defined like this:
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-2) + fib(n-1)
     */
    fun fib(n: Int): Long {
        if(n == 0 || n == 1) {
            return n.toLong()
        }
        var a = 0L
        var b = 1L
        var c = 1L

        (1 until n).forEach { _ ->
            c = a + b
            a = b
            b = c
        }
        return c
    }

    /**
     * Checks if the braces are set correctly
     * e.g. "(a * b))" should return false
     */
    fun checkBraces(string: String): Boolean {
        var result = 0
        string.forEach {
            when {
                it == ')' -> result--
                it == '(' && result >= 0 -> result++
            }
        }
        return result == 0
    }
}