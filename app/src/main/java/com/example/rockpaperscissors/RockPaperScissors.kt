package com.example.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper or Scissor? enter your choice!")
    playerChoice = readln()

    var randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        2 -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)

    var winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "computer"

    }
    if(winner == "Tie"){
        println("It's a tie")
    }
    else{
        println("$winner Won!")
    }

}