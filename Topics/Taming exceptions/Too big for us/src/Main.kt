fun returnValue(): Int {
    val value = readln().toInt()
    return if(value < 0){
        value
    } else{
        value
        throw Exception("It's too big")
    }
}
