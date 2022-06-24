import kotlin.math.*
fun main() {
    val (x1, y1) = readln().split(" ").map { it.toInt() }
    val (x2, y2) = readln().split(" ").map { it.toInt() }
    println(if (abs(x1 - x2) == abs(y1 - y2) || x1 == x2 || y1 == y2) "YES" else "NO")
}