class rectangle(
    val a: Int,
    val b: Int,
){
    init {
        println("rectangle with a = $a and b = $b");
    }
    fun area() {
        println(a * b)
    }

    fun isSquare(): Boolean {
        if(a == b) return true
        else return false
    }
}