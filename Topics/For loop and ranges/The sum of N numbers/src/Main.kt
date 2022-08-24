fun main() {
    val n = readln()!!.toInt()
    var value = 0
    repeat(n) {
        value += readLine()!!.toInt()
    }
    println(value)
}
