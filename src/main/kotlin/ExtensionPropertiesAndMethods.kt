import kotlin.math.PI
import kotlin.math.roundToInt
import kotlin.math.sqrt

//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---
class Circle1(var radius: Double = 0.0) {
    val circumference: Double
        get() = PI * radius * 2
}
//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---


val Circle.diameter: Double
    get() = 2.0 * radius



//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---
class SimpleDate1(var month: String) {
    fun monthsUntilJingleBells(): Int {
        return months.indexOf("December") - months.indexOf(month)
    }

    companion object {
        val months = arrayOf(
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        )
    }
}
//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---

fun SimpleDate1.monthsUntilHalloweenDecorations(): Int {
    val currentMonth = SimpleDate1.months.indexOf(month)
    val halloweenStart = SimpleDate1.months.indexOf("September")
    val halloweenEnd = SimpleDate1.months.indexOf("October")

    return if (currentMonth in 0..halloweenStart) {
        halloweenStart - currentMonth
    } else if (currentMonth in halloweenStart..halloweenEnd) {
        0
    } else {
        halloweenStart + (12 - currentMonth)
    }
}



//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---
class TVMath1 {
    companion object {
        fun getDiagonal(width: Double, height: Double): Int {
            val result = sqrt(width * width + height * height)
            return result.roundToInt()
        }

        fun getWidthAndHeight(diagonal: Int, ratioWidth: Double, ratioHeight: Double): Pair<Double, Double> {
            val ratioDiagonal = sqrt(ratioWidth * ratioWidth + ratioHeight * ratioHeight)
            val height = diagonal * ratioHeight / ratioDiagonal
            val width = height * ratioWidth / ratioHeight

            return Pair(width, height)
        }
    }
}
//---🛑❌⚠️❌🐻❌☢️❌🤡❌🚫❌🚬❌🛑---

fun TVMath1.Companion.idealViewingDistance(diagonal: Int, is4K: Boolean): Double {
    return if (is4K) diagonal * 1.25 else diagonal * 2.0
}

fun main() {
    val distance = TVMath1.idealViewingDistance(diagonal = 65, is4K = true)
    println("Sit $distance inches away.")

    val date = SimpleDate1("August")
    println("${date.monthsUntilHalloweenDecorations()} month(s) until spooky decorations!")

    val unitCircle = Circle(1.0)
    println("diameter: ${unitCircle.diameter}")
}