class Dog() : Animal("Bello",4) {
    init {
        println("I am a dog with $legs legs and my Name is $name");
    }
    override fun giveNoise() {
        println("Wau Wau")
    }
}