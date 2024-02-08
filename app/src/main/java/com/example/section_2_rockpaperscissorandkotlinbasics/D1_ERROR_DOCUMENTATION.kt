package com.example.section_2_rockpaperscissorandkotlinbasics

/*
* ERROR FORMAT
* ============
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
*  1: ERROR MESSAGE
* -----------------
* 1. Val cannot be reassigned
* 2: ERROR CAUSE
* --------------
* - val number1 = 1
    number1 = 3
* 3: ERROR SOLUTION
* -----------------
* - change val to var if value of variable will
*   changed else remove reassignment statement.
*
*
*
*  1: ERROR MESSAGE
* -----------------
* - Expecting a top level declaration
* 2: ERROR CAUSE
* --------------
* - void main() { <- Wrong function declaration
      }
  - fun main() { <- correct function declaration
  * }
* 3: ERROR SOLUTION
* -----------------
*- in kotlin a function must be defined with the `fun`
*  keyword not `void`.
*
*
*  1: ERROR MESSAGE
* ----------------
* - Conflicting declarations: var circleRatio: Float, var circleRatio: Float
* 2: ERROR CAUSE
* --------------
* - Declaring the same variable twice
    var circleRatio = 3.14F
* 3: ERROR SOLUTION
* -----------------
* - rename the variable to another name.
    var circleRatio2 = 3.14F
*
*
*
*
*  1: ERROR MESSAGE
* ----------------
* - Error: Could not find or load main class
*   com.example.section_2_rockpaperscissorandkotlinbasics.Lec23_Day_2_Running_Hello_WorldKt
*
* 2: ERROR CAUSE
* --------------
* - Caused by: java.lang.ClassNotFoundException:
*   com.example.section_2_rockpaperscissorandkotlinbasics.Lec23_Day_2_Running_Hello_WorldKt
*
* 3: ERROR SOLUTION
* -----------------
* - Rerun the program, as error will clear
*
*
*
*
*
* 1: ERROR MESSAGE
* ----------------
* - The integer literal does not conform to the expected type UByte
* 2: ERROR CAUSE
* --------------
* - var myAge: UByte = 25
* 3: ERROR SOLUTION
* -----------------
* - var myAge: UByte = 25u
*
*
*
*  1: ERROR MESSAGE
* ----------------
* - Exception in thread "main" java.lang.NumberFormatException: For input string: "rfg"
* 2: ERROR CAUSE
* --------------
* - Only integer numbers are allowed
* - Please enter your age as a whole number
    rfg
* 3: ERROR SOLUTION
* -----------------
* - enter an integer
* - use error handling techniques.
*
*
*  1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
*
*  1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
*
*  1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
*
*  1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
*  1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
* 1: ERROR MESSAGE
* ----------------
* 2: ERROR CAUSE
* --------------
* 3: ERROR SOLUTION
* -----------------
*
*
*
* */