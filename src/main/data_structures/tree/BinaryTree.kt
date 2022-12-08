package data_structures.tree

import data_structures.Queue

/*
*  A binary tree is a tree data structure composed of nodes, each of which has at most, two children,
*  referred to as left and right nodes and the tree begins from root node.
*
*  https://www.geeksforgeeks.org/introduction-to-binary-tree-data-structure-and-algorithm-tutorials/?ref=lbp
* */

class BinaryTree (
    var value: Int,
    var left: BinaryTree?,
    var right: BinaryTree?) {

    constructor(value: Int): this(value, null, null)

    fun size(): Int {
        var size = 1
        if(left != null) {
            size += left!!.size()
        }
        if(right != null) {
            size += right!!.size()
        }
        return size
    }

    fun btHeight(): Int {
        val left = if (left == null) 0 else left!!.btHeight()
        val right = if (right == null) 0 else right!!.btHeight()
        return maxOf(left, right) + 1
    }

    fun add(value: Int) {
        // adds the on the first empty level
        val queue = Queue<BinaryTree>()
        queue.add(this)
        while (!queue.isEmpty()) {
            val x = queue.poll()
            if (x.left == null) {

            } else if (x.right == null) {
                x.right =  BinaryTree(value)
                return
            } else {
                queue.add(x.left!!)
                queue.add(x.right!!)
            }
        }
    }

}