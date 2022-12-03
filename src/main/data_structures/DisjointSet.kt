package data_structures

/*
* Operations :
* Adding new sets to the disjoint set.
* Merging disjoint sets to a single disjoint set using Union operation.
* Finding representative of a disjoint set using Find operation.
* Check if two sets are disjoint or not.
* */

class DisjointSet(val size: Int) {
    private val parent = IntArray(size)
    private val rank = ByteArray(size)
    var count = size
        private set

    init {
        for (i in parent.indices) {
            parent[i] = i
        }
    }

    fun connected(v: Int, w: Int): Boolean {
        return find(v) == find(w)
    }

    fun find(v: Int): Int {
        var v = v
        while (parent[v] != v) {
            parent[v] = parent[parent[v]]
            v = parent[v]
        }
        return v
    }

    fun union(v: Int, w: Int) {
        val rootV = find(v)
        val rootW = find(w)
        if (rootV == rootW) return
        if (rank[rootV] > rank[rootW]) {
            parent[rootW] = rootV
        } else if (rank[rootW] > rank[rootV]) {
            parent[rootV] = rootW
        } else {
            parent[rootV] = rootW
            rank[rootW]++
        }
        count--
    }
}
