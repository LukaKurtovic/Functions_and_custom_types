import kotlin.math.atan
import kotlin.properties.Delegates

class Circle(var radius: Double = 0.0) {
    val pi: Double by lazy {
        ((4.0 * atan(1.0 / 5.0)) - atan(1.0 / 239.0)) * 4.0
    }
    val circumference: Double
        get() = pi * radius * 2
}

class Leevel(val id: Int, var boss: String) {
    companion object {
        var highestLevel = 0
    }

    var unlocked: Boolean by Delegates.observable(false) {
            _, old, new ->
        if (new && id > highestLevel) {
            highestLevel = id
        }
    }
}

class Lamp() {
    lateinit var bulb: Lightbulb
}

class Lightbulb {
    companion object {
        const val maxCurrent = 40
    }
    var current by Delegates.vetoable(0) {
            _, _, new->
        if (new > maxCurrent) {
            println("Current too high, falling back to previous setting.")
            false
        } else {
            true
        }
    }
}

fun main() {
    // by vetoable
    val light = Lightbulb()
    light.current = 9000
    println(light.current)

    light.current = 40
    println(light.current)

    // lateinit var
    val fancyLamp = Lamp()
    fancyLamp.bulb = light
    println(fancyLamp.bulb.current)

    // by lazy
    val circle = Circle(5.0)
    println(circle.circumference)

    // by observable
    val level1 = Leevel(id = 1, boss = "Outside Cat")
    val level2 = Leevel(id = 2, boss = "Laser Pointer")
    val level3 = Leevel(id = 3, boss = "Mysterious Attic Sound")
    val level4 = Leevel(id = 4, boss = "Vacuum Cleaner")

    level1.unlocked = true
    println("Highest Level is ${Level.highestLevel}")

    level4.unlocked = true
    println("Highest Level is ${Level.highestLevel}")
}