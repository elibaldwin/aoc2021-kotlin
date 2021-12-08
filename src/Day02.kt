private const val day = 2

fun main() {
    fun part1(input: List<String>): Int =
        input.fold(0 to 0) { (x, y), line  ->
            val tokens = line.split(' ')
            val inc = tokens[1].toInt()
            when(tokens[0]) {
                "forward" -> (x + inc to y)
                "down" ->    (x to y + inc)
                "up" ->      (x to y - inc)
                else -> error("invalid input: $line")
            }
        }.let { (x, y) -> x * y }

    fun part2(input: List<String>): Int =
        input.fold(Triple(0, 0, 0)) { (x, y, aim), line  ->
            val tokens = line.split(' ')
            val inc = tokens[1].toInt()
            when(tokens[0]) {
                "forward" -> Triple(x + inc, y + aim * inc, aim)
                "down" -> Triple(x, y, aim + inc)
                "up" -> Triple(x, y, aim - inc)
                else -> error("invalid input: $line")
            }
        }.let { (x, y, _) -> x * y }

    fun parseData(input: String) =
        input.split("\n")

    // test if implementation meets criteria from the description, like:
    val testInput = readInput(day, true)
    check(part1(parseData(testInput)) == 150)
    check(part2(parseData(testInput)) == 900)

    val input = readInput(day)
    println(part1(parseData(input)))
    println(part2(parseData(input)))
}
