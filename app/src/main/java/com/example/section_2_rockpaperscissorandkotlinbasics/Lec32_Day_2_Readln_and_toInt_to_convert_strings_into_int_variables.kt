package com.example.section_2_rockpaperscissorandkotlinbasics

/**
 * [Q1] User Input and Type Conversion
 * -----------------------------------
 *
 * [1] User Input readln()
 * ------------------------
 *
 *
 * **/


fun main() {

    println("Please enter your age as a whole number")
    // read what the user has entered into the console
    var enteredValue = readln()
    // convert the String Variable into an int variable
    var age = enteredValue.toInt();


    if (age >= 18) {
        println("You can enter the club")
    } else {
        println("You are too young to enter the club")
    }

}
