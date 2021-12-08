private const val day = 1

fun main() {
    fun part1(input: List<Int>): Int {
        return input.windowed(size = 2, transform = {(it[1] > it[0]).toInt()}).sum()
    }

    fun part2(input: List<Int>): Int {
        return part1(input.windowed(size = 3, transform = { it.sum() }))
    }

    fun parseData(input: String) =
        input.split("\n").map { it.toInt() }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput(day, true)
    check(part1(parseData(testInput)) == 7)
    check(part2(parseData(testInput)) == 5)

    val input = readInput(day)
    println(part1(parseData(input)))
    println(part2(parseData(input)))
}
