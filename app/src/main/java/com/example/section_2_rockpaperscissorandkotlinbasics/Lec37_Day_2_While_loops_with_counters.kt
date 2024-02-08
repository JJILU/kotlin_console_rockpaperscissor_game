package com.example.section_2_rockpaperscissorandkotlinbasics

/**
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
 *
 * */


fun main() {

    // initializer
    var count = 0

    // condition
    while (count < 3) {
        println("Count is: $count")
        // increament
        count++;
    }
}