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
 *
 * 2.
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


// Method

if (randomNumber == 1)
{
    computerChoice = "Rock"
}
else if (randomNumber == 2) {
    computerChoice = "Paper"
} else {
    computerChoice = "Scissors"
}


    println(computerChoice)

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


}