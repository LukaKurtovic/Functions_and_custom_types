/*data class Grade(val courseName: String, val letter: Char, val credits: Double)

open class Person3(var firstName: String, var lastName: String) {
    fun fullName() = "$firstName $lastName"
}

open class Student2(firstName: String, lastName: String,
                   var grades: MutableList<Grade> = mutableListOf<Grade>()
) : Person3(firstName, lastName) {

    fun recordGrade(grade: Grade) {
        grades.add(grade)
    }
}

class BandMember(firstName: String, lastName: String): Student2(firstName, lastName) {
    var minimumPracticeTime: Int = 2
}

class StudentAthlete(firstName: String, lastName: String): Student2(firstName, lastName) {
    var isEligible: Boolean = true
}

fun main() {
    val jon = Person3(firstName = "Jon", lastName = "Snon")
    val jane = Student2(firstName = "Jane", lastName = "Snane")
    val victor = BandMember(firstName = "Victor", lastName = "Wooten")
    val marty = StudentAthlete(firstName = "Marty", lastName = "McWolf")

    println(jon.fullName())
    println(jane.fullName())
    println("${victor.fullName()} practices for ${victor.minimumPracticeTime} hours!")
    println("Can ${marty.fullName()} play in the big game: ${marty.isEligible}")

    val robotics = Grade(courseName = "Robotics", letter = 'B', credits = 3.0)
    jane.recordGrade(robotics)
    println(jane.grades)
}*/