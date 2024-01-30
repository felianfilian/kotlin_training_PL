
fun main() {
    loopTest();
    // checkAge();
}

fun loopTest() {
    var names = arrayOf("mario", "luigi")
    var x = 0;
    while (x < names.size) {
        println(names[x]);
        x++;
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




