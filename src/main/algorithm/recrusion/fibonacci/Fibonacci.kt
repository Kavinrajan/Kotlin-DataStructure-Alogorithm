package algorithm.recrusion.fibonacci

/**
 * A Fibonacci sequence is the sequence of integer in which each element in the sequence is the sum of
 * the two previous elements. Fibonacci series starts from two numbers − F0 & F1.
 * The initial values of F0 & F1 can be taken 0, 1 or 1, 1 respectively.
 *
 * The Fibonacci numbers are the numbers in the following integer sequence.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
 * In mathematical terms, the sequence Fn of Fibonacci numbers is defined by
 * the recurrence relation Fn = Fn-1 + Fn-2
* */

class Fibonacci {
    // iterative method
    fun fibonacciIterative(n: Int): Int {
        return if (n == 0) {
            0
        } else if (n == 1 || n == 2) {
            1
        } else {
            val arr = intArrayOf(1, 1)
            for (i in 3..n) {
                val temp = arr[1]
                arr[1] = arr[0] + arr[1]
                arr[0] = temp
            }
            arr[1]
        }
    }

    // recursive method
    fun fibonacciRecursive(n: Int): Int {
        if (n == 0) return 0
        else if (n == 1 || n == 2) return 1
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2)
    }
}

fun main() {
    val fibonacci = Fibonacci()
    println(fibonacci.fibonacciIterative(13))
    println(fibonacci.fibonacciRecursive(13))
}