package com.example.section_2_rockpaperscissorandkotlinbasics


/**
 * [Q1] Unsigned Integers
 * ----------------------
 * 1. Unsigned Integers -> means we take the range that an integer has
 *    and cut off everything negative.
 *
 *
 *[Q2] Unsigned Integer Types
 * -------------------------
 *
 * [1] UByte
 * ---------
 * 1. an unsigned 8-bit integer, ranges from 0 to 255.
 *
 * [2] UShort
 * ----------
 * 1. an unsigned 16-bit integer, ranges from 0 to 65,535
 *
 * [3] UInt
 * --------
 * 1. an unsigned 32-bit integer ranges from 0 to 2 TO POWER 32-1
 *
 * [4] ULong
 * ---------
 * 1. an unsigned 64-bit integer ranges from 0 to 2 TO POWER 64-1
 *
 *
 * [Q3] Usigned Integer Literals
 * ------------------------------
 * 1. kotlin made working with Unsigned Integer Literal easier by
 *    providing the ability to tag integer literals with a suffix
 *    indicating a specific unsigned type ( simmilarly to Float or Long).
 *
 * 2. u and U tag for unsigned literals
 * 3. default type used by kotlin compiler for unsigned literals
 *    UInt or ULong depending on the size of the literal.
 *
 * [Q4] Use Case
 * -------------
 * 1. if you want a bigger range but you do not need the negative numbers
 *    but want to store very little data.
 *
 * */

fun main() {

    // Declaring an unsigned integer variable
    var myAge: UByte = 25u

    println(myAge)



}
