fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val op = readLine()!!.toString().first()
    val result = calculate(a,b,op)
    println(result)
}

fun calculate(a: Int, b: Int, op: Char): Int {
    return when (op) {
        '/' -> a / b
        '*' -> a * b
        '+' -> a + b
        else -> a - b
    }
}