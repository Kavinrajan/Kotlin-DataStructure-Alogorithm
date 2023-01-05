package sorts

/**
 * Shell-Sort, also known as Shell sort or Shell's method, is an in-place comparison sort.
 * It is mainly a variation of Insertion Sort. In insertion sort, we move elements only one position ahead.
 * When an element has to be moved far ahead, many movements are involved. The idea of ShellSort is to allow the exchange of far items.
 * In Shell-sort, we make the array h-sorted for a large value of h. We keep reducing the value of h until it becomes 1.
 * An array is said to be h-sorted if all sub-lists of every h’th element are sorted.
 */

class ShellSort: AbstractSortStrategy() {

    override fun <T : Comparable<T>> perform(arr: Array<T>) {
        var h =1
        while (h < arr.size / 3) {
            h = h * 3 + 1
        }
        while (h >= 1) {
            for (i in h until arr.size) {
                for (j in i downTo h step h) {
                    if (arr[j - h] < arr[j]) break
                    arr.exch(j, j - h)
                }
            }
            h /= 3
        }
    }
}