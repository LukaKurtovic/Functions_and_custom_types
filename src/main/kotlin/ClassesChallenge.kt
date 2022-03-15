// 3-06 Challenge - Classes - Starter

/*
Challenge 1 - Building a Class Hierarchy
Create a class named `Animal` that has…
1. a method named `speak()` that does nothing.

Create two `Animal` subclasses...
1. `WildAnimal` that...
  - has an `isPoisonous` property, that is a `Boolean`
2. `Pet` that...
  - has a stored property named `name`, that is a `String`
  - has a `play()` method that prints out a message
  - overrides `speak()` - It should print out a message

Create one subclass of your choice of `WildAnimal` or `Pet`. It should do at least one of the following:
 - override `speak()`
 - override `play()`
 - Add a new property with custom accessor
 - Add a new method
*/


/*
Challenge 2 - Overriding & Polymorphism
- Write a function that takes an `Animal` and does something different depending on what subclass it is.
  You'll need to do some safe casting and null checks!
- Create at least one instance of each class from the first challenge.
- Create an array that contains all of the instances.
- Call the function with each of your instances using a loop or whatever other method you'd like!
*/

/*
open class Animal(){
    open fun speak(){}
}

open class WildAnimal(val isPoisonous: Boolean) : Animal(){

}

class Pet(val name: String) : Animal(){
    fun play(){
        println("Playing")
    }

    override fun speak() {
        println("Speaking")
    }
}

class Lion(isPoisonous: Boolean) : WildAnimal(isPoisonous){
    override fun speak() {
        println("Lion is speaking")
    }

}

fun getAnimalType(animal: Animal){
    when(animal){
        is Pet -> println("I'm a pet")
        is WildAnimal -> println("I'm a wild animal")
        is Lion -> println("I'ma lion")
        else -> println("I'm animal from superclass")
    }
}

fun main() {

    val animal = WildAnimal(false)
    val animal2 = Pet("Marko")
    val animal3 = Animal()
    val animal4 = Lion(false)

    val arrayOfAnimals = arrayOf(animal, animal2, animal3, animal4)

    arrayOfAnimals.forEach { getAnimalType(it) }
}*/