
fun main() {
    loopTest();
    // checkAge();
}

fun loopTest() {
    var x = 0;
    while (x < 3) {
        println(x);
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




