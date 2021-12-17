fun printSumOfTwoNumber(firstNumber: Int, secondNumber: Int) {
    val sum = firstNumber + secondNumber
    println(sum)
}

fun drive() {
    println("Men haydovchiman va faqat mashina haydayman")
}

fun calculateMonthlyAccount(file: String): String {
    val result = "result file $file"
    return result
}

fun kassir(): String {
    val a = 200_000
    val b = 3_000_000

    return "Boshliq buginlik savdo summasi ${a + b}"
}

fun sumOfNumberTillTen() {
    var sum = 0
    for (item in 0..10) {
        sum += item
    }
    println(sum)
}

fun main() {
    sumOfNumberTillTen()
    drive()
    println(kassir())
    println(calculateMonthlyAccount("December"))
}
