package data_structures

import kotlin.NoSuchElementException

@Suppress("RedundantVisibilityModifier")
public class Dequeue<T> : Collection<T> {
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

    public fun peekFirst(): T {
        if(size == 0) throw NoSuchElementException()
        return head!!.value
    }

    public fun peekLast(): T {
        if(size == 0) throw NoSuchElementException()
        return rear!!.value
    }

    public fun pollFirst(): T {
        if(size == 0) throw NoSuchElementException()
        val old = head!!
        head = old.next
        return old.value
    }

    public fun pollLast(): T {
        if (size == 0) throw java.util.NoSuchElementException()
        var node = head!!
        while (node.next != null && node.next != rear) {
            node = node.next!!
        }
        val ret = node.next!!
        node.next = null
        rear = node
        return ret.value
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

    public override fun containsAll(elements: Collection<T>): Boolean {
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
