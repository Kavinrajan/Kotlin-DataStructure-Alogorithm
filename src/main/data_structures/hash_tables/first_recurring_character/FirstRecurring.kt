package data_structures.hash_tables.first_recurring_character

/**
 * Finds the first repeated character in a string
 * Returns, the character that occurs more than once and whose index of second occurrence is smallest.
 * */

private fun firstRecurringCharacter(arr: IntArray): Int? {
    val hashSet = HashSet<Int>()
    for (element in arr) {
        if(hashSet.contains(element)) {
            return element
        } else {
            hashSet.add(element)
        }
    }
    return null
}

/**
 *  https://www.geeksforgeeks.org/find-the-first-repeated-character-in-a-string/
 *  Examples
 *    Input: ch = “testing”
 *    Output: t is the first element that repeats
 *
 *    Input: str = “hello”
 *    Output: l is the first element that repeats
* */

fun main() {
    val firstRecurring = firstRecurringCharacter(intArrayOf(4, 7, 7, 4, 5, 7, 1, 4, 6))
    print(firstRecurring)
}