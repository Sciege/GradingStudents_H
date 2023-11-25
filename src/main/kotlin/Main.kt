fun gradingStudents(grades: Array<Int>): Array<Int> {
    val adjustedGrades = mutableListOf<Int>()

    for (i in grades) {
        if (i < 35) {
            adjustedGrades.add(i)
        } else {
            val nextMultipleOfFive = (i / 5 + 1) * 5
            val difference = nextMultipleOfFive - i

            if (difference < 3) {
                adjustedGrades.add(nextMultipleOfFive)
            } else {
                adjustedGrades.add(i)
            }
        }
    }

    return adjustedGrades.toTypedArray()
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
