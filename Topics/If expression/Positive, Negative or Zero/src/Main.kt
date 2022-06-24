fun main() {
    val num = readln().toInt()
    if (num < 0) {
        println("negative")
    } else if (num == 0) {
        println("zero")
    } else {
        println("positive")
    }
}