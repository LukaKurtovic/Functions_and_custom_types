import kotlin.properties.Delegates

// 2-06 Challenge - Delegated Properties - Starter

/*
Challenge 1:
 Rewrite the `IceCream` class below:
 1. Use a default value for the name property.
 2. Lazily initialize the `ingredients` list.
*/

class IceCream {
    var name: String = "Ice cream"
    val ingredients: MutableList<String> by lazy { mutableListOf("Milk", "Eggs") }
}

/*
Challenge 2:
Below is a `SpaceCar` and `SpaceBattery` class.
Dive into the inner workings of the car and rewrite the `SpaceBattery` class
below with delegated property observer functionality:

1. Add a `lowCharge` property of Boolean type to the class.
2. Flip the `lowCharge` Boolean when the `level` drops below 10%.
3. Ensure that when the tank fills back up, the `lowCharge` warning will turn off.
4. Add a `SpaceBattery` property to `SpaceCar`, make one, and charge it up. Then fly around for awhile.
*/

class SpaceCar(
    val make: String,
    val color: String,
    val spaceBattery: SpaceBattery
){

}

class SpaceBattery {
    var lowCharge: Boolean = true
    var level: Double by Delegates.observable( 0.0){_, _, new ->
        lowCharge = (new < 10)
    }

}

fun main() {
    // ~~~Challenge 1~~~
    // Make a new instance of IceCream
    val sladoled = IceCream()

    // Give it a name other than the default
    sladoled.name = "sladoled"
    // Add some ingredients!
    sladoled.ingredients.add("Vanilla")
    sladoled.ingredients.add("Kikiriki")

    // ~~~Challenge 2~~~
    // Make a SpaceCar!
    val battery = SpaceBattery()
    val car = SpaceCar("Audi", "Black", battery )
    // Charge the battery!
    battery.level = 100.0
    // Fly around for awhile.
    println(battery.lowCharge)
    battery.level = 0.0
    println(battery.lowCharge)

}