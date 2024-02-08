package com.example.section_2_rockpaperscissorandkotlinbasics

/**
 *
 * Coding Exercise - Validate Player Input in Rock-Paper-Scissors Game
 * Quiz 7|6 questions
 * In this Coding Exercise, you'll be refining your Rock-Paper-Scissors
 * application by ensuring the player's input is valid.
 * If the input isn't "rock", "paper", or "scissors",
 * the player should be prompted to enter a valid choice.
 * Follow the steps below to implement this feature.
 *
 *
 *
 *
 * Question 1:
 * ----------
 * Setting up the Playground:
 *--------------------------
 * Start by opening your existing Kotlin file for the Rock-Paper-Scissors application.
 *Make sure to have the initial implementation of your game ready.
 *
 *
 * Question 2:
 * -----------
 * Step 1: Initialization of Variables
 * -----------------------------------
 *Ensure that you have a variable called playerChoice
 * (or a similar name) that will hold the player's input.
 *
 *
 *
 * Question 3:
 * ----------
 * Step 2: Implementing the while Loop for Input Validation
 * ----------------------------------------------------------
 *Before the logic that determines the winner, implement a
 * while loop to continuously prompt the player for their
 * choice until they enter "rock", "paper", or "scissors".
 *Hint: You might want to use readLine() to capture the
 * user's input and compare it with the valid choices.
 *
 *
 *
 * Question 4:
 * -----------
 * Step 3: Test Your Game
 *------------------------
 * Run your application. If you enter an invalid choice,
 * it should prompt you again for a correct input.
 * Test multiple scenarios to ensure the validation is working properly.
 * ( If your game is running as expected, select "ready" )
 *
 *
 *
 * Question 5:
 * -----------
 * Step 4: Handle Other Corner Cases (Optional)
 *-------------------------------------------
 * While you've handled the main input validation, think about other
 * corner cases. For instance, should the game be case-sensitive?
 * If not, you might want to convert the user's input to lowercase before validating.
 *( If you have made additional improvements, select "ready" )
 *
 *
 *
 * Question 6:
 * Final step:
 *----------
 * Perfect! You've now enhanced your Rock-Paper-Scissors
 * game by adding input validation. This ensures a smoother
 * game experience and handles potential user errors.
 *
 * Compile and run your enhanced game. Play a few rounds
 * and share your final code in the course discussion or
 * as directed by the instructor.
 *
 * We hope you found this exercise beneficial,
 * and remember: practice makes perfect. Keep coding!
 *
 *
 *
 * */




fun main() {

//    1. Stores player choice
    var playerChoice = ""

//    2. Stores computer choice
    var computerChoice = ""

//    3. Tell player what input to enter
    println("Rock,Paper,Scissors? Enter your choice?")

//    4. Read player's choice from console
    playerChoice = readln().lowercase()

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

//    prints computer choice
    println(computerChoice)


//    Prompt player to enter correct inputs
//    if ()
    while (playerChoice != "rock" && playerChoice != "paper" && playerChoice != "scissors") {
        println("Enter rock,paper,scissors?")
        playerChoice = readln()
    }

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

// Print out winner
    if(winner == "Tie") {
        println("It's a tie!!! 🤯🤯")
    } else {
        println("👉👉👉 $winner won!!")
    }

}