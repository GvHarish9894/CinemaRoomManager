fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    repeat(n) {
        list.add(readln().toInt())
    }
    val max = list.maxOrNull()
    println(list.indexOf(max))
}
