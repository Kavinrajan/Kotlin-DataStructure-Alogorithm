package data_structures.tree

/*
* A Tree is a non-linear data structure and a hierarchy consisting of a collection of nodes
* such that each node of the tree stores a value and a list of references to other nodes (the “children”).
*
* This data structure is a specialized method to organize and store data in the computer to be used more effectively.
*
* It consists of a central node, structural nodes, and sub-nodes, which are connected via edges.
* We can also say that tree data structure has roots, branches, and leaves connected with one another.
*
* Terminologies =
* Parent Node, Child Node, Root Node, Leaf Node or External Node, Ancestor of a Node, Descendant, Sibling, Level of a node
* Internal node, Neighbour of a Node, Subtree
*
* Properties =
* Number of edges, Depth of a node, Height of a node, Height of the Tree, Degree of a Node
*
* Basic Operation Of Tree:
* Create – create a tree in data structure.
* Insert − Inserts data in a tree.
* Search − Searches specific data  in a tree to check it is present or not.
* Preorder Traversal – perform Traveling a tree in a pre-order manner in data structure .
* In order Traversal – perform Traveling a tree in an in-order manner.
* Post order Traversal –perform Traveling a tree in a post-order manner.
*
*  https://www.geeksforgeeks.org/introduction-to-tree-data-structure-and-algorithm-tutorials/
* */

class Tree(var value: Int) {

    val childeren: MutableList<Tree> = mutableListOf()

    fun size(): Int {
        return childeren.fold(1) { size, child -> size + child.size() }
    }

    fun height(): Int {
        return 1 + (childeren.map { it.size() }.max() ?: 0)
    }

    fun add(value: Int) {
        childeren.add(Tree(value))
    }

}