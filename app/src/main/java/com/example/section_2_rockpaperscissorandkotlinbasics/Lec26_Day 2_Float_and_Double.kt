package com.example.section_2_rockpaperscissorandkotlinbasics

/**
 * [Q1] Int,Long,Short,Byte And Specifying The Manually
 * ----------------------------------------------------
 *  1. numbers are stored as integers by default
 * 2. kotlin can infer the data type of number stored
 * 3. if you want to specify what type of number data type use:
 *    var variableName : Data-Type = Value
 *    or
 *    var longVariable = ValueL // L indicates value is long.
 *
 *
 *
 *    [Q2] Float and Double
 *    ---------------------
 *
 * [Q1]   Type: Float
 *        Size (bits) : 32
 *        Decimal digits: 6-7
 *
 * [Q2]   Type: Float
 *        Size (bits) : 64
 *        Decimal digits: 15-16
 *
 *
 * [Q3] Float and Double
 * ---------------------
 * 1. You can initialize `Double` and `Float` variable
 *    with numbers having a fractional part.
 * 2. It's separated from the integer part by a period (.)
 * 3. For variables initialized with fractional numbers, the
 *    compiler infers the `Double` type:
 *
 *
 *
 * */


fun main() {

    val pi = 3.14 // Double

    // val one: Double = 1 // Error: The integer literal does not conform to the expected type Double
    var myAge = 487788899
    println(myAge)

    // Warning: Floating-point literal cannot be represented with the required precision
    val eFloat = 2.7182818284f
    println(eFloat)
}
