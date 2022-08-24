fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    val last = numbers[numbers.lastIndex]
    val first = numbers[0]
    numbers[0] = last
    numbers[numbers.lastIndex] = first
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}