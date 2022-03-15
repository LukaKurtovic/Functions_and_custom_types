/*
data class Grade2(val courseName: String, val letter: Char)

open class Person4(var firstName: String, var lastName: String) {
    fun fullName() = "$firstName $lastName"
}

open class Student3(firstName: String, lastName: String,
                   var grades: MutableList<Grade2> = mutableListOf<Grade2>()
) : Person4(firstName, lastName) {

    open var isEligible: Boolean = true

    open fun recordGrade(grade: Grade2) {
        grades.add(grade)
    }
}

class BandMember2(firstName: String, lastName: String): Student3(firstName, lastName) {
    var minimumPracticeTime: Int = 2
    override var isEligible: Boolean = true
        get() = grades.none { it.letter == 'F' }

    override fun recordGrade(grade: Grade2) {
        super.recordGrade(grade)
        if (!isEligible) println("No more performing for $firstName! Study study study.")
    }
}

class StudentAthlete2(firstName: String, lastName: String): Student3(firstName, lastName) {
    override fun recordGrade(grade: Grade2) {
        super.recordGrade(grade)
        isEligible = grades.filter { it.letter == 'F' }.size < 3
        if (!isEligible) println("$firstName can't play in the big game! Time to study.")
    }
}


fun main() {
    val jon = Person4(firstName = "Jon", lastName = "Snon")
    val jane = Student3(firstName = "Jane", lastName = "Snane")
    val victor = BandMember2("Victor", "Wooten")
    val marty = StudentAthlete2("Marty", "McWolf")

    val utterFailureGrade = Grade2(courseName = "Being a Regular Human", letter = 'F')
    marty.recordGrade(utterFailureGrade)
    marty.recordGrade(utterFailureGrade)
    marty.recordGrade(utterFailureGrade)

    victor.recordGrade(utterFailureGrade)
}*/
