package data_structures.hash_tables.implementation

/**
 * The Hashtable class implements a hash table, which maps keys to values. Any non-null object can be used as
 * a key or as a value. To successfully store and retrieve objects from a hashtable, the objects used as keys must
 * implement the hashCode method and the equals method.
 *
 *  The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
 *  https://www.geeksforgeeks.org/hashtable-in-java/
* */

class HashTable(size: Int) {

    private var data: Array<ArrayList<KeyValue>?> = arrayOfNulls<ArrayList<KeyValue>?>(size)
    private var currentLength: Int = 0

    private fun _hash(key: String): Int {
        var hash = 0
        for (i in key.indices) {
            hash = (hash + key.codePointAt(i) * i) % data.size
        }
        return hash
    }

    operator fun set(key: String, value: Int) {
        val address =  _hash(key)
        if(data[address] == null) {
            var arrayAtAddress =  ArrayList<KeyValue>()
            data[address] = arrayAtAddress
            currentLength++
        }
        val pair = KeyValue(key, value)
        data[address]?.add(pair)
    }

    operator fun get(key: String): Any? {
        val address = _hash(key)
        val bucket = data[address]
        if (bucket != null) {
            for (keyValue in bucket)  {
                if(keyValue.key == key) {
                    return keyValue.value
                }
            }
        }
        return null
    }

    fun keys(): Array<String?> {
        val bucket = data
        val keysArray = arrayOfNulls<String>(currentLength)
        var count = 0
        for (keyValues in bucket) {
            if (keyValues != null) {
                keysArray[count] = keyValues[0].key
                count++
            }
        }
        return keysArray
    }

}

fun main() {
    val hashTable = HashTable(50)
    hashTable["android"] = 12
    hashTable["iOS"] = 15
    hashTable["web"] = 20
    println("Values for key android: " + hashTable["android"])
    println("Values for key ios: " + hashTable["iOS"])
    println("list of keys: " + hashTable.keys().contentToString())
}

