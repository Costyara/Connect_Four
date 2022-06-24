fun solution(numbers: List<Int>, number: Int): MutableList<Int> {
    val muList = numbers.toMutableList()
    muList.add(number)
    return muList
}