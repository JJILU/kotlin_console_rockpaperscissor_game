package com.example.section_2_rockpaperscissorandkotlinbasics


/**
 * WHILE LOOPS WITH USER INPUT
 * ---------------------------
 *
 * [Q1] while loop and counter
 * ---------------------------
 * 1. While loop contains three things(3):
 *   - initializer - starting value (int)
 *   - condition - eventually evaluate to false
 *   - increament/decreament - to change initializer
 *
 * [Q2] while loop syntax
 * -----------------------
 * while (condition == boolean) {
 * // Code to be executed
 * }
 *
 * [Q3] While loop and user input
 * -------------------------------
 *
 * */


fun main() {

    // initializer
    var userInput = readln()

    // condition
    while (userInput == "1") {
        println("while loop executed")
//        break
        // increament
//        count++;

        // userInput to break loop
        userInput = readln()
    }
    println(" Loop is done!")
}