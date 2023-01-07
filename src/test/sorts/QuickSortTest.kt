
package sorts

import algorithm.sorting.QuickSort

/**
 * Like Merge Sort, quickSort is a Divide and Conquer algorithm. It picks an element as a pivot and partitions the given array around
 * the picked pivot. There are many different versions of quickSort that pick pivot in different ways.
 *
 * Always pick the first element as a pivot
 * Always pick the last element as a pivot (implemented below)
 * Pick a random element as a pivot
 * Pick median as the pivot
 *
 * The key process in quickSort is a partition(). The target of partitions is, given an array and an element x of an array as
 * the pivot, put x at its correct position in a sorted array and put all smaller elements (smaller than x) before x,
 * and put all greater elements (greater tahn x) after x. All this should be done in linear time.
* */

class QuickSortTest: AbstractSortTest<QuickSort>(QuickSort())
