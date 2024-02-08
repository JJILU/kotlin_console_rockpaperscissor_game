package com.example.section_2_rockpaperscissorandkotlinbasics

/**
 * Coding Exercise -String to Integer Conversion and Basic Input Handling in Kotlin
 * ---------------------------------------------------------------------------------
 * Quiz 6|6 questions
 * -------------------
 * This quiz is for you to take as a Coding Exercise.
 * In this exercise, you will write a Kotlin program to
 * handle user input, converting a string to an integer,
 * and perform a simple arithmetic operation. This will help
 * you understand user input handling and data type conversion
 * in Kotlin. Let's get started!
 *
 *
 *
 * Question 1:
 * -----------
 * Setting up the Playground:
 * --------------------------
 * 1. Start by creating a new Kotlin file named "InputHandling.kt".
 *    Make sure to clear any pre-existing code.
 *
 *
 *
 *
 *
 * Question 2:
 * ----------
 * Step 1: Prompt User for Input
 *-------------------------------
 * Write a main function where you will write your code.
 * Use println to prompt the user to enter a number.
 * For example: "Please enter a number: ".
 *
 *
 *
 *
 *
 * Question 3:
 * -----------
 * Step 2: Read User Input
 *------------------------
 * After the prompt, use the readln() function to read the
 * user's input and store it in a variable named inputString.
 * Hint: readln() reads the input as a string.
 *(If you are ready for the next step, select "ready")
 *
 *
 *
 *
 *
 * Question 4:
 * ----------
 * Step 3: Convert String to Integer
 *---------------------------------
 * Convert inputString to an integer and store it in a variable named inputNumber.
 * Use the toInt() function for conversion.
 * Hint: Make sure to handle potential exceptions when the user input is not a valid integer.
 *(If you are ready for the next step, select "ready")
 *
 *
 *
 *
 *
 *
 * Question 5:
 * ------------
 * Step 4: Perform Arithmetic Operation
 *-------------------------------------
 * Declare another integer variable with a predefined value (e.g., val multiplier = 5).
 * Perform a simple arithmetic operation (like multiplication) between
 * inputNumber and your predefined variable.
 * Print the result of this operation.
 * Hint: You can print something like "Result of operation is: " followed by the result.
 * (If you are ready for the next step, select "ready")
 *
 *
 * Question 6:
 * -----------
 * Final Step
 *----------
 * Compile your code that includes all the steps from the exercise.
 * This should include the prompt, reading user input, converting the
 * input to an integer, performing an arithmetic operation, and printing the result.
 * Ensure your program runs without errors and handles invalid inputs gracefully.
 *Share your final code and its output in the course discussion!.
 * Discuss any challenges you faced and how you solved them.
 *And good luck with the rest of the course!
 *
 * */


fun main() {

//   Step 1: Prompt User for Input
    println("Please enter a number: ")
//    Step 2: Read User Input
    var inputString = readln()
//    Step 3: Convert String to Integer
    var inputNumber = inputString.toInt()

//    Step 4: Perform Arithmetic Operation
      val multiplier = 5

    print("Result of operation is: ${inputNumber*multiplier}")

}