package ktln

fun main() {

    val sum1 = { a: Int, b: Int -> a + b }
    val sum2: (Int, Int) -> Int = { a, b -> a + b }
    println(sum1(2, 3))
    println(sum2(2, 3))

    val square1 = { a: Int -> a * a }
    val square2: (Int) -> Int = { a -> a * a }
    val square3: (Int) -> Int = { it * it } // "it" only if 1 param
    println(square1(3))
    println(square2(3))
    println(square3(3))

    println("---| HomeTask |---")

    val perimeter1 = { a: Int, b: Int -> (a + b) * 2 }
    val perimeter2: (Int, Int) -> Int = { a, b -> (a + b) * 2 }

    val hello1 = { name: String -> println("Привет, $name") }
    val hello2: (String) -> Unit = { println("Привет, $it") }

    val arr = arrayOf(2, 5, 6, 1, 51, 12, 199, 134, 44)
    val sorted = { arr: Array<Int> ->
        for (i in arr.size - 2 downTo 0) {
            for (j in 0..i) {
                if (arr[j] < arr[j + 1]) {
                    val x = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = x
                }
            }
        }
        arr
    }
    val sortedArr = sorted(arr)
    for (i in 0 until sortedArr.size) {
        val x = sortedArr[i]
        print("$x ")
    }
}



















