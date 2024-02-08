package com.example.section_2_rockpaperscissorandkotlinbasics

/**
 * [Q1] Boolean values and operations
 * ----------------------------------
 * 1. Booleans are data types that represent a boolean
 *    object that can only have two values which is
 *    `true`  or `false` or null.
 *
 * 2. Boolean has a nullable counterpart `Boolean?` that also has null vlue
 *
 * [Q2] Built-in operatons on booleans include:
 * - || - disjunction (logical OR)
 * - && - conjunction (logical AND)
 * - !  - negation (logical NOT)
 *
 * - || AND && work lazily
 *
 *
 * [Q3] kotlin comments
 * --------------------
 * 1. used by developer to understand code better and is
 *    ignored by kotlin compiler
 * */

fun main() {
    val myTrue: Boolean = true
    val myFalse: Boolean = false
//    val boolNull: Boolean? = null

    println(myTrue || myFalse) // true or false == 1+0 = 1 = true
    println(myTrue && myFalse) // true and false == 1*0 = 0 = false
    println(!myTrue)


}