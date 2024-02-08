package com.example.section_2_rockpaperscissorandkotlinbasics


/**
 * [Q1] Rock Paper Scissors - The Random Fun
 * -----------------------------------------
 * 1. Things to consider in the RockPaperScissors
 *    - The choices
 *       1, The Computer choice -> String data type
 *       2, The Player choice -> String data type
 *       3, Tell player which choices to enter
 *       5, read the player choice from console
 *       6, generate computer choices
 *
 *
 *[Q2] Rock Paper Scissors - Winners and When Statement
 * -----------------------------------------------------
 * 1. when (variable) {
 *      item -> {
 *      // code to be executed
 *     }
 *     item -> {
 *  *      // code to be executed
 *  *     }
 *     item -> {
 *  *      // code to be executed
 *  *     }
 *     item -> {
 *  *      // code to be executed
 *  *     }
 *      else -{
 *  *      // code to be executed
 *      }
 *
 * **/


fun main() {

//    1. Stores player choice
    var playerChoice = ""

//    2. Stores computer choice
    var computerChoice = ""

//    3. Tell player what input to enter
    println("Rock,Paper,Scissors? Enter your choice?")

//    4. Read player's choice from console
    playerChoice = readln()

//    5. Read computer choice
    val randomNumber   = (1..3).random();


// Method: Conserves Memory Execution

//    if (randomNumber == 1)
//    {
//        computerChoice = "Rock"
//    }
//    else if (randomNumber == 2) {
//        computerChoice = "Paper"
//    } else {
//        computerChoice = "Scissors"
//    }




//    [OR]

//    if (randomNumber == 1)
//    {
//        computerChoice = "Rock"
//    }
//
//    if (randomNumber == 2)
//    {
//        computerChoice = "Paper"
//    }
//
//    if (randomNumber == 3)
//    {
//        computerChoice = "Scissors"
//    }

// when statement

    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }

    println(computerChoice)

//      Choosing the winner
    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
//        playerChoice == "Scissors" && computerChoice == "Rock" -> "Computer"
//        playerChoice == "Rock" && computerChoice == "Paper" -> "Computer"
//        playerChoice == "Paper" && computerChoice == "Scissors" -> "Computer"
        else -> "Computer"
    }

}