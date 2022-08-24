fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var value = 0
    for(i in a..b) {
        value += i
    }
    println(value)
}
