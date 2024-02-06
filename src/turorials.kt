import java.awt.Rectangle

fun main() {

    objectsTest();
    //inheritanceTest();
    //classTest();
    //hw19();
    //primeCheck();
    //hw18();
    //varargTest(2,4,6,9);
    //hw17();
//println( addition(2, 3));
//println(square(3));
//hw16();
//hw15(); // greeting output
    //hw14(); // fibocnacci row
//listTest()
//hw13(); // get median
//loopTest();
    // checkAge();
}

fun objectsTest() {
    println(importantNumbers.PI)
    println(importantNumbers.test())
}

fun inheritanceTest() {
    var myPet = Dog();
    myPet.giveNoise();
    myPet.eat()
    myPet.updateName("Holger");
}

fun classTest() {
    var myRect = rectangle(3, 3);
    print(myRect.area());
    print(myRect.isSquare());
}

fun List<Int>.product(): Int {
    var result = 1;
    for(value in this) {
        result *= value;
    }
    return result;
}

fun hw19() {
    var numbers = listOf(1,2,3,4);
    print(numbers.product());
}

fun Int.isPrime(): Boolean {
    for(i in 2 until this - 1) {
        if (this % i == 0) {
            return false;
        }
    }
    return true;
}

fun primeCheck() {
    var num = 5;
    print(num.isPrime());
}

fun alternateNums(vararg numbers: Int): Int {
    var result = 0;
    var toggle = true;
    for(number in numbers) {
        if(toggle) result += number;
        else result -= number;
        toggle = !toggle;
    }
    return result;
}

fun hw18() {
    print(alternateNums(8,3,6,3));
}

fun varargTest(vararg numbers: Int) {
    var array = intArrayOf(1,2,3);
    var max = intArrayOf(4, *array, 5);
    println(max[3]);
    println(numbers[0]);
}

fun hw17() {
    var myNumbers = listOf(2,4,7,5,9);
    print("search number: ");
    var myInput = readln().toInt();
    var myIndex = myNumbers.indexOf(myInput);
    if(myIndex != -1) {
        println(myIndex);
    } else {
        println("not in list");
    }

}

fun addition(num1: Int, num2: Int) = num1 + num2;

fun square(num: Int): Int {
    var result = num * num;
    return result;
}

fun hw16() {
    print("highest number: ");
    var myInput = readln().toInt();
    highestNum(myInput);
}

fun highestNum(num: Int) {
    var sum = 0;
    for(i in 1..num) {
        sum += i;
    }
    println(sum);
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




