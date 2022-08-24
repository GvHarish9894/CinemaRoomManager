fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    repeat(n) {
        list.add(readLine()!!.toInt())
    }
    val m = readLine()!!.toInt()
    if (list.contains(m)) print("YES") else print("NO")
}