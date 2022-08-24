fun main() {
    val (a, b) = Array(2) {
        readln().toInt()
    }
     
    var value: Long = 1
    
    for (i in a until b) {
        value *= i 
        
    }
    println(value.toBigDecimal())
}
