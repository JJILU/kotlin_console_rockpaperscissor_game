package com.example.section_2_rockpaperscissorandkotlinbasics
/*
* [Q1] Val vs Var & Print Ints On The Console
* -------------------------------------------
*
* [1] Val vs Var
* --------------
* 1. use val for variables whose values cannot be changed.
* 2. use val for constant variables or immutable
*    variables(i.e value cannot be changed).
* 3. use var for variables whose values can be changed.
* 4. var creates a mutable variable or a variable whose
*    value can changed
*
* 5. kotlin will recommend to use val for variable
*    declaration because it assumes the value will no change.
* */
fun main() {
    // 1. val keyword
    val number1 = 1
    // number1 = 3 // val variable can't be reassigned
    println(number1)

    var myAge = 20
    println("My age is : $myAge");
    myAge = 35
    println("My age is: $myAge");

}