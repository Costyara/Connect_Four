fun main() {    
    val minHours = readln().toInt()
    val maxHours = readln().toInt()
    val sleptHours = readln().toInt()
    if (sleptHours < minHours) {
        println("Deficiency")
    } else if (sleptHours > maxHours) {
        println("Excess")
    } else {
        println("Normal")
    }
}