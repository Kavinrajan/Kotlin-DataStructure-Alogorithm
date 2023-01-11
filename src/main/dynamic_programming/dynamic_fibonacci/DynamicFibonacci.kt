package dynamic_programming.dynamic_fibonacci

import dynamic_programming.dynamic_fibonacci.DynamicFibonacci.Companion.operationsCount

class DynamicFibonacci {

    fun fibonacciOperation(n: Int): Int {
        return if (cache.containsKey(n)) {
            cache[n]!!
        } else {
            if(n < 2) {
                n
            } else {
                operationsCount++
                cache[n] = fibonacciOperation(n - 1) + fibonacciOperation(n - 2)
                cache[n]!!
            }
        }
    }

    companion object {
        var cache = HashMap<Int, Int>()
        var operationsCount = 0
    }
}

fun main() {
    var dynamicFib = DynamicFibonacci()
    println(dynamicFib.fibonacciOperation(30))
    print(operationsCount)
}