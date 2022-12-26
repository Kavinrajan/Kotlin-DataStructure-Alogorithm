import sorts.AbstractSortTest
import sorts.BubbleSort

/**
*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order.
*This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.
*/

class BubbleSortTest: AbstractSortTest<BubbleSort>(BubbleSort())