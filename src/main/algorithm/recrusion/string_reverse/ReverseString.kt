package algorithm.recrusion.string_reverse

class ReverseString {
    fun reverseStringRecursive(string: String): String {
        return if (string == "") ""
        else reverseStringRecursive(string.substring(1)) + string[0]
    }
    fun reverseStringIterative(string: String): String {
        val charArray = string.toCharArray()
        for (i in 0 until charArray.size / 2) {
            val temp = charArray[i]
            charArray[i] = charArray[charArray.size - 1 - i]
            charArray[charArray.size - 1 - i] = temp
        }
        return String(charArray)
    }
}

/**
 *  Recursive function (reverse) takes string pointer (str) as input and calls itself with next location
 *  to passed pointer (str+1). Recursion continues this way when the pointer reaches ‘\0’,
 *  all functions accumulated in stack print char at passed location (str) and return one by one.
* */

fun main() {
    val reverse = ReverseString()
    val reversedStrItr = reverse.reverseStringIterative("kotlin DSA Iterative")
    val reversedStrRec = reverse.reverseStringRecursive("kotlin DSA Recursive")
    println(reversedStrItr)
    println(reversedStrRec)
}