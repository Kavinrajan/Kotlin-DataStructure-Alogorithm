package dynamic_programming.memoization

class Memoization {

    fun addTo60(n: Int): Int {
        println("addTo60 time")
        return n + 60
    }

    fun memoizeAddTo60(n: Int): Int {
        if(!cache.containsKey(n)) {
            println("memoizeAddTo60 time")
            cache[n] = n + 60
        }
        return cache[n]!!
    }

    companion object {
        var cache = HashMap<Int, Int>()
    }


}

fun main() {
    var memoization = Memoization()
    println("addTo60: " + memoization.addTo60(5))
    println("addTo60: " + memoization.addTo60(5))
    println("memoizeAddTo60: " + memoization.memoizeAddTo60(5))
    println("memoizeAddTo60: " + memoization.memoizeAddTo60(5))
    println("memoizeAddTo60: " + memoization.memoizeAddTo60(5))
}