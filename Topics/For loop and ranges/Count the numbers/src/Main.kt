fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    var value = 0
    var input = emptyArray<Int>()
    for(i in a..b){
        input += i
        if(i % c == 0) {
            value++            
        }
    }
    println(value)
}
