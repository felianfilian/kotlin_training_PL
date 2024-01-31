
fun main() {
    loopTest();
    // checkAge();
}

fun loopTest() {
    var names = arrayOf("mario", "luigi")
    
    for(i in names) {
        println(i);
    }
}

fun checkAge() {
    print("age: ");
    var myInput = readln();
    if(myInput != null) {
        if(myInput.toInt() < 18)  println("too young")
        else if( myInput.toInt() < 65) println("best age")
        else println("too old")
    }
}




