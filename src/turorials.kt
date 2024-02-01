
fun main() {
hw15(); // greeting output
    //hw14(); // fibocnacci row
//listTest()
//hw13(); // get median
//loopTest();
    // checkAge();
}

fun hw15() {
    print("country: ");
    var country = readln();
    when(country) {
        in "india" -> print("Namaste");
        in "usa" -> print("hello");
        else -> print("wrong country");
    }

}

fun hw14() {

    print("how many numbers: ");
    var numCount = readln().toInt();
    var actualNum = 0;
    var nextNum = 1;
    var sum = 0;
    for(i in 1..numCount) {
        print("$actualNum, ");
        sum = actualNum + nextNum;
        nextNum = actualNum;
        actualNum = sum;
    }
}

fun listTest() {
    var myList = mutableListOf<Int>(1,2);
    myList.add(3);
    myList.reverse();
    myList.removeAt(1);
    println(myList);
}

fun hw13() {
    var sum: Float = 0F;
    for(i in 1..5) {
        print("number $i: ");
        var myInput = readln();
        if(myInput != null) sum += myInput.toFloat();
    }
    println("median: ${sum / 5}");
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




