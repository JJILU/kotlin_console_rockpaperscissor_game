package com.example.section_2_rockpaperscissorandkotlinbasics

/**
 * [Q1] String Data Type
 * --------------------
 * 1. Documentation: https://www.kotlinlang.org/docs/strings.html
 * 2. Strings in kotlin are represented by the type `String`.
 * 3. Generallly, a string value is a sequence of characters in double quotes ("")
 *
 * */


fun main() {

    // 1: String declaration
//    val str = "abcd 123"

    /** 2. accessing characters of string
     * ----------------------------------
     * - str[index]
     * 3. iterating through string characters
     * -------------------------------------
     * - for-in loop
     * */

//     - str[index]
//    print(str[3]); // d
//    println("\n")
//
////      iterating through a string
//    for (s in str) {
//        println("Character is $s")
//    }

    /**
     *[Q2] String Functions
     * -------------------
     * 1. uppercase() -> changes string characters are transformed to upper case.
     * 2. lowercase() -> changes string characters are transformed to lower case.
     *
     *
     * */

//    var lowerToUpperCase = "change me to upper case 1"
//    var upperToLowerCase = "CHANGE ME TO LOWER CASE 2"
//
//    println(lowerToUpperCase.uppercase())
//    println(upperToLowerCase.lowercase())


    /**
     * [Q3] String Contactination
     * --------------------------
     * 1. string concatenation is done using the plus operator +
     * */

    var name = "naomi"
    println(name + " Kapele");
    // String Template
    println("$name kapele")


    print("")

}