package ktln

fun main() {
    val name: String? = "Joe"
    val last: String? = "Johna"
    val book: String? = null
    val sum = (name?.length?:0) + (last?.length?:0) + (book?.length?:0)
    println(sum)
}
