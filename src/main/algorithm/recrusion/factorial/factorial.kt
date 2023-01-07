package algorithm.recrusion

/**
 *  Factorial of a number n is defined as a product of all positive descending integers
 *
 *  Formula n! = n * [(n-1)!]
 *
 * */
class Factorial {
    // recrsive
    fun findFactorialRecursive(number: Int): Int {
        return if (number < 2) {
            1
        } else {
            number * findFactorialRecursive(number -  1)
        }
    }

    // iterative
    fun findFactorialIterative(number: Int): Int {
        return if (number < 2) {
            1
        } else {
            var answer = 1
            for (i in 2 .. number) {
                answer *= i
            }
            answer
        }
    }
}


fun main() {
    val factorial = Factorial()
    println(factorial.findFactorialIterative(6))
    println(factorial.findFactorialRecursive(6))
}