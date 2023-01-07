package algorithm.sorting

import data_structures.PriorityQueue


/**
 * Heap sort is a comparison based sorting technique based on Binary Heap data structure. It is similar to selection
 * sort where we first find the maximum element and place the maximum element at the end. We repeat the same process
 * for remaining element.
 */

/**
 * Heap sort is a comparison based sorting technique based on Binary Heap data structure. It is similar to selection
 * sort where we first find the maximum element and place the maximum element at the end. We repeat the same process
 * for remaining element.
* */
class HeapSort : AbstractSortStrategy()  {

    override fun <T : Comparable<T>> perform(arr: Array<T>) {
        for (k in arr.size / 2 downTo 1) {
            PriorityQueue.sink(arr as Array<T?>, k - 1, arr.size - 1, reverseOrder<T>())
        }
        for (k in arr.size downTo 1) {
            arr.exch(0, k - 1)
            PriorityQueue.sink(arr as Array<T?>, 0, k - 2, reverseOrder<T>())
        }
        for (k in arr.size / 2 downTo 1) {
            PriorityQueue.sink(arr as Array<T?>, k -1, arr.size - 1, reverseOrder<T>())
        }
        for (k in arr.size downTo 1) {
            arr.exch(0, k -1)
            PriorityQueue.sink(arr as Array<T?>, 0, k - 2, reverseOrder<T>())
        }
    }

}