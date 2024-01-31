
fun main() {
hw13();
//loopTest();
    // checkAge();
}

fun hw13() {
    var sum: Float = 0F;
    for(i in 1..5) {
        print("number $i: ");
        var myInput = readln();
        if(myInput != null) sum += myInput.toFloat();
    }
    println("median: $sum");
}

fun loopTest() {
    for(i in 1..10 step 2) {
        println(i);
    }
}

fun findMax() {
    var nums = arrayOf(1,4,7,9,3,5);

    for (i in nums) {

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




