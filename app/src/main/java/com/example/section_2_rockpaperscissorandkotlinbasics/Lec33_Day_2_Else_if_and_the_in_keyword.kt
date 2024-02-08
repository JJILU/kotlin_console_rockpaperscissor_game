package com.example.section_2_rockpaperscissorandkotlinbasics

/**
 * [Q1] Else if and the in keyword
 * -------------------------------
 * 1.
 * **/

fun main() {

    println("Please enter your age as a whole number")
    // read what the user has entered into the console
    var enteredValue = readln()
    // convert the String Variable into an int variable
    var age = enteredValue.toInt();


//    if (age >= 18) {  // never allows `else if` to execute
//        println("You can enter the club")
//    } else if(age >= 40) {
//        println("You canot enter the club, please go home")
//    } else
//    {
//        println("You are too young to enter the club")
//    }


//    if (age >= 18  && age < 40) {
//        println("You can enter the club")
//    } else if(age >= 40) {
//        println("You cannot enter the club, please go home")
//    } else
//    {
//        println("You are too young to enter the club")
//    }

    // OR
/**
 * [Q1] range synax
 * ----------------
 * if (item in minValue...maxValue)
 * */
    if (age in 18..40) {
        println("You can enter the club")
    } else if(age >= 40) {
        println("You cannot enter the club, please go home")
    } else
    {
        println("You are too young to enter the club")
    }
}