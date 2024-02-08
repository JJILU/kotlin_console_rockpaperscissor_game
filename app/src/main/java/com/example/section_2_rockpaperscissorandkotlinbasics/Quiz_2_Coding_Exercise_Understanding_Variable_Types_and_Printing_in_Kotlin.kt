package com.example.section_2_rockpaperscissorandkotlinbasics

/**
 *Quiz 2: Coding Exercise - Understanding Variable Types and Printing in Kotlin
 * ----------------------------------------------------------------------------
 *
 *
 * Quiz 2|6 questions
 *
 * Let's do this again! This quiz is for you to take as a Coding Exercise.
 * Each step will guide you through developing your own Kotlin program.
 * You'll be declaring variables using both val (immutable) and var (mutable) keywords,
 * understanding their differences, and practicing printing these variables.
 * Let's dive into Kotlin's handling of mutable and immutable variables!
 *
 * Question 1:
 * -----------
 * Setting up the Playground:
 *
 * Start by creating a new Kotlin file named "VariableTypes.kt".
 *
 * Make sure to clear any pre-existing code.
 *
 *
 *
 * Question 2:
 * -----------
 * Step 1: Declaring an Immutable Variable
 * ---------------------------------------
 *
 * Declare an immutable variable (constant) using the val keyword.
 * Name it `constantNumber` and assign an integer value to it.
 * Hint: Remember, val is used for variables whose value will not change.
 *
 *
 * Question 3:
 * ----------
 * Step 2: Declaring a Mutable Variable
 * -------------------------------------
 * Declare a mutable variable using the var keyword.
 * Name it `mutableString` and assign a string value to it.
 * Hint: A var variable's value can be reassigned or changed over time.
 *
 * Question 4:
 * -----------
 * Step 3: Printing Variables
 * --------------------------
 * Use the println function to print both constantNumber and mutableString.
 * Hint: You can directly pass the variable names to println.
 *
 *
 *
 *
 * Question 5:
 * ----------
 * Step 4: Modifying and Reprinting Mutable Variable
 *--------------------------------------------------
 * Change the value of mutableString to a different string.
 * Print mutableString again using println.
 * Hint: This step demonstrates the mutable nature of variables declared with var.
 *
 *
 *
 *
 *
 * Question 6:
 * ----------
 * Final Step
 * ----------
 * You've just practiced using mutable and immutable variables in Kotlin
 * and understood how to print them. Your final code should demonstrate
 * the declaration of both val and var, along with print statements showing
 * their values before and after modification (for var).
 *
 * Compile your code, ensuring it includes all steps from the exercise.
 * Ensure it runs without errors, and then share your final code in the course discussion!
 *
 *
 *
 *
 * */


fun main() {
    // immutable variable
    val constantNumber = 10

    // mutable variable
    var mutableString = "naomi"

   // print variables
    println(constantNumber)
    println(mutableString)


    mutableString = "honey"
    println(mutableString)

}

