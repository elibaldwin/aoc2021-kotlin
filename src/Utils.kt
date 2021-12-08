import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Reads lines from the given input txt file.
 */
fun readInput(dayNum: Int, test: Boolean = false) : String {
    val fname = dayNum.toString().padStart(2, '0') + (if (test) "_test" else "")
    return File("src/input", "${fname}.txt").readText()
}

/**
 * Converts string to md5 hash.
 */
fun String.md5(): String = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray())).toString(16)

fun Boolean.toInt(): Int = if (this) 1 else 0
