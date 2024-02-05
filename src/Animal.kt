abstract class Animal(
    var name: String,
    var legs: Int,
) {
    constructor(name: String): this(name, 4);

    init {
        println("I am an animal");
    }
    fun updateName(newName: String) {
        name = newName
        println("My new name is: $name")
    }
    abstract fun giveNoise()

    abstract fun eat()
}