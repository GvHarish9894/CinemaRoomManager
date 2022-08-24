fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    repeat(n) {
        list.add(readLine()!!.toInt())
    }
    val m = readLine()!!.toInt()
    var count: Int = 0
    list.map {
        if (it == m) count++
    }
    println(count)
}