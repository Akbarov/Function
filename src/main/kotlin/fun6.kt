fun main() {
    println(calculateSumOfDigits(5855))
    println(calculateSumOfDigits(554))
    println(calculateSumOfDigits(987))
    println(calculateSumOfDigits(5465))
    println(calculateSumOfDigits(875))

}

fun calculateSumOfDigits(number: Int): Int {
    var num = number
    var sumOfDigits = 0
    while (num != 0) {
        sumOfDigits += num % 10
        num /= 10
    }
    return sumOfDigits
}