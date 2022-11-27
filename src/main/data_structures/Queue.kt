package data_structures

import java.util.NoSuchElementException

@Suppress("RedundantVisibilityModifier")
public class Queue<T> : Collection<T> {
    private var head: Node<T>? = null
    private var rear: Node<T>? = null
    public override var size: Int = 0
        private set

    private class Node<T>(var value: T) {
        var next: Node<T>? = null
    }

    public fun add(item: T) {
        val new = Node(item)
        val rear = this.rear
        if (rear == null) {
            head = new
            this.rear = new
        } else {
            rear.next = new
            this.rear = new
        }
        size++
    }

    public fun peek(): T {
        if (size == 0) throw NoSuchElementException()
        return head!!.value
    }

    public fun poll(): T {
        if (size == 0) throw NoSuchElementException()
        val old = head!!
        head = old.next
        size--
        return old.value
    }

    public override fun isEmpty(): Boolean {
        return size == 0
    }

    public override fun contains(element: T): Boolean {
        for (obj in this) {
            if (obj == element) return true
        }
        return false
    }

    public override fun containsAll(elements: kotlin.collections.Collection<T>): Boolean {
        for (element in elements) {
            if (!contains(element)) return false
        }
        return true
    }

    public override fun iterator(): Iterator<T> {
        return object : Iterator<T> {
            var node = head

            override fun hasNext(): Boolean {
                return node != null
            }

            override fun next(): T {
                if (!hasNext()) throw NoSuchElementException()
                val current = node!!
                node = current.next
                return current.value
            }
        }
    }
}
