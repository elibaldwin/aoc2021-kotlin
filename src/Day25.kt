private const val day = 25

fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    fun parseData(input: String) =
        input.split("\n")

    // test if implementation meets criteria from the description, like:
    val testInput = readInput(day, true)
    check(part1(parseData(testInput)) == 1)
    //check(part2(parseData(testInput)) == 1)

    val input = readInput(day)
    println(part1(parseData(input)))
    println(part2(parseData(input)))
}
