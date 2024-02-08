package com.example.section_2_rockpaperscissorandkotlinbasics

/**
 * Quiz 3: Coding Exercise - Demonstrate the use of floating point data types in Kotlin
 * ------------------------------------------------------------------------------------
 *
 * [Q1] Coding Exercise - Demonstrate the use of floating point data types in Kotlin
 * ---------------------------------------------------------------------------------
 * Quiz 3|6 questions
 * -------------------
 * This quiz is for you to take as a Coding Exercise. This means that each question
 * is a step to develop your code. Don´t worry! It's going to be really intuitive!
 * Let's get ready and let's develop this floating point exercise.
 *
 *
 *
 * Question 1:
 * ----------
 * Setting up the Playground:
 *---------------------------
 * Start by creating a new Kotlin file named "FloatingTypes.kt".
 * Make sure to clear any pre-existing code.
 *
 *
 *
 * Question 2:
 * ------------
 * Creating a Double Variable:
 *---------------------------
 * Declare a variable named circleRatio and assign the value 3.14 to it.
 * Print out circleRatio to the console.
 * Hint: If you hover over the variable, what data type does Kotlin infer it to be?
 *
 * Question 3:
 * -----------
 * Transition to Float:
 *---------------------
 * Modify circleRatio to be of type float by adding an F at the end of its value.
 * Print the variable again.
 * Hint: Check the data type again. Has it changed?
 *
 *
 *
 * Question 4:
 * -----------
 * Precision Testing:
 *---------------------
 * Attempt to assign a more precise value to circleRatio. For example, 3.1415926535F.
 * Observe any errors or warnings.
 * Hint: Remember, float has a limitation on the precision it can store.
 *
 *
 *
 * Question 5:
 * -----------
 * Switching to Double for Precision:
 *-----------------------------------
 * Remove the F from the end of circleRatio's value to change its type back to double.
 * Now assign an even longer value to circleRatio, like 3.1415926535897932.
 * Print out circleRatio and observe the result.
 * Hint: Compare the precision of this value to the previous float value.
 * Do you notice the difference in precision capabilities between double and float?
 *
 * Question 6:
 * -----------
 * There we go! This should show you some examples.
 * Now, what does your final code look like? What is your final output?
 * Compile your code that includes all the steps from the exercise. This should include
 * variable declarations, print statements, and maybe some observational comments.
 * Ensure it runs without errors, and then share your final code in the course
 * discussion or as directed by the instructor.
 * */

fun main() {

//Question2: Creating a Double Variable : var circleRatio: Double
//    var circleRatio = 3.14

//    Question 3: Transition to Float : var circleRatio: Float
//    var circleRatio = 3.14F
//    println(circleRatio)


// Question 4:  Precision Testing : Floating-point literal cannot be represented with the required precision
    var circleRatio2 = 3.1415926535F  // precision = 7
    println(circleRatio2)

// Question 5: Switching to Double for Precision:
    var circleRatio3 = 3.1415926535897932  // precision = 15
    println(circleRatio3)

}