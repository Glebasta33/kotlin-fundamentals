package ktln

fun main() {
    var list: MutableList<Int> = mutableListOf(23, 43, 1, 5, 34, 4, 9, 100, 50, 250)
    println(sort(123, 4, 0, 12))
}

fun sort(numbers: MutableList<Int>) : List<Int> {
    for (i in 0 until numbers.size) {
        for (j in numbers.size - 1 downTo i) {
            var x: Int
            if (numbers[i] > numbers[j]) {
                x = numbers[j]
                numbers[j] = numbers[i]
                numbers[i] = x
            }
        }
    }
    return numbers
}

fun sort(array: Array<Int>) = sort(array.toMutableList())
fun sort(vararg numbers: Int) = sort(numbers.toMutableList())



