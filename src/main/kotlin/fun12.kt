import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val a = 2
    val b = 1
    val c = 7
    sortThreeNumbers(a, b, c)
    val a1 = 4
    val b1 = 3
    val c1 = 9
    sortThreeNumbers(a1, b1, c1)
    println(findArea(3.4))


}

fun findArea(r: Double):Double {
    return PI*r.pow(2)
}

fun sortThreeNumbers(a: Int, b: Int, c: Int) {
    when {
        b in (a + 1) until c -> {
            println("$a, $b, $c")
        }
        c in (a + 1) until b -> {
            println("$a, $c, $b")
        }
        b in (c + 1) until a -> {
            println("$c, $b, $a")
        }
        c < a && a < b -> {
            println("$c, $a, $b")
        }
        b < a && a < c -> {
            println("$b, $a, $c")
        }
        else -> {
            println("$b, $c, $a")
        }
    }
}