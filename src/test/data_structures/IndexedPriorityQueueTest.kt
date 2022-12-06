package data_structures

import org.junit.Assert
import org.junit.Test
import java.util.NoSuchElementException

/*
* Indexed Priority Queue, data is stored just like standard priority queue and along with this,
*  the value of a data can be updated using its key. It is called “indexed” because  a hash map can be used to store the index
* in container using the key of key-value pair input  as the key of hash map. This comes handy while implementing
* Dijkstra’s Algorithm using min-heap. It can also be used in any other program where it is required
* to put key-value pairs in priority queue and along with it you need to update value of keys with push or pop function .
* */

class IndexedPriorityQueueTest {

    @Test
    fun emptyTest() {
        val pq = IndexedPriorityQueue<Int>(3)
        Assert.assertEquals(0, pq.size)
        Assert.assertTrue(pq.isEmpty())
    }

    @Test(expected= NoSuchElementException::class)
    fun exceptionTest() {
        val pq = IndexedPriorityQueue<Int>(3)
        pq.peek()
    }

    @Test
    fun pqTest() {
        val pq = IndexedPriorityQueue<Int>(20)
        for (i in 10 downTo 1) {
            pq.insert(20 - i, i)
            Assert.assertEquals(Pair(20 - i, i), pq.peek())
        }
        for (i in 1 .. 10) {
            Assert.assertEquals(Pair(20 - i, i), pq.poll())
        }
    }

}