import java.lang.Exception

fun pepTalk(name: String): String {
    val array = name.split(" ").toTypedArray()
    val firstName = array[0]
    val secondName = array[1]
    return "Don't lose the towel, traveler $firstName $secondName!"
}

fun advice(): String = "Don't lose the towel, nameless one."

fun main() {
    val name = readLine()!!
    val advice = try {
        pepTalk(name)
    } catch (e: Exception) {
        advice()
    } finally {
        println("Good luck!")
    }
    print(advice)
}