package sorts

/**
 * Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands.
 * The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at
 * the correct position in the sorted part.

 * Characteristics of Insertion Sort:
 * This algorithm is one of the simplest algorithm with simple implementation
 * Basically, Insertion sort is efficient for small data values
 * Insertion sort is adaptive in nature, i.e. it is appropriate for data sets which are already partially sorted.
* */

@ComparisonSort
@StableSort
class InsertionSort: AbstractSortStrategy() {
    override fun <T : Comparable<T>> perform(arr: Array<T>) {
        for (i in 1 until arr.size) {
            for (j in i downTo 1) {
                if (arr[j - 1] < arr[j]) break
                arr.exch(j, j - 1)
            }
        }
    }
}