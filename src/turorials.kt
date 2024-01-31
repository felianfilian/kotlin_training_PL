
fun main() {
    loopTest();
    // checkAge();
}

fun loopTest() {
    for(i in 1..10 step 2) {
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




