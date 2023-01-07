package algorithm.sorting

abstract class AbstractSortStrategy {
    abstract fun<T : Comparable<T>> perform(arr: Array<T>)
}
