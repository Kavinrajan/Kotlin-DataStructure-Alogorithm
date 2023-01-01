package sorts

/**
 * Heap sort is and in-lace algorithm
 * Typically 2 -3 times slower than well-implemented Quick Sort.
 *
 *  Advantages:
 *  Efficiency - The time required to perform Heap sort increases logarithmically while other algorithms may grow
 *                  exponentially slower as the number of items to sort increases.
 *  Memory Usage - Memory usage is minimal because apart from what is necessary to hold the initial list of items to be sorted,
 *                 it needs no additional memory space to work
 *  Simplicity - It is simpler to understand than other equally efficient sorting algorithms because
 *               it does not use advanced computer science concepts such as recursion
* */
class HeapSortTest: AbstractSortTest<HeapSort>(HeapSort())
