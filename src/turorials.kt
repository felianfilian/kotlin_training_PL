
fun main() {
    print("age: ");
    var myInput = readln();
    if(myInput != null) {
        if(myInput.toInt() < 18)  println("too young")
        else if( myInput.toInt() < 65) println("best age")
        else println("too old")
    }
}




