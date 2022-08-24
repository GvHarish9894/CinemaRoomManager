fun main() {
    val upperBound = readln().toInt()
    val result: MutableList<Int> = mutableListOf()
    repeat(upperBound) {
        result.add(readln().toInt())
    }
    val sortList = result.sorted()
    if (result == sortList) print("YES")  else print("NO")
}
