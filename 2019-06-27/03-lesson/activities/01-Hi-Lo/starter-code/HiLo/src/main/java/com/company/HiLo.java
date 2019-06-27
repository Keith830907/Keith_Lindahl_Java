package com.company;

import java.util.Scanner;
import java.util.Random;

public class HiLo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Hi-Low!");
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("OK, " + name + ", here are the rules:");

        Random rand = new Random();

        // Obtain a number between [0 - 100].
        int numberToGuess = rand.nextInt(100);
        int numberOfGuesses = 0;
        int guess;
        boolean win = false;

        while (win == false) {

            System.out.println("Guess a number between 1 and 100: ");
            guess = scan.nextInt();
            numberOfGuesses++;
            if (guess == numberToGuess) {
                System.out.println("Congratulations, " + name + "! You win!");
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is to low");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is to high");
            }
        }
        System.out.println("It took you "+ numberOfGuesses+ " guesses to find my number!");
    }
}



//## Requirements
//
//        1.	The program displays a message that says, “Welcome to Hi-Low!”
//        1.	The program prompts for the user’s name.
//        1.	The program displays a message that says, “OK, <name of user>, here are the rules:”
//        1.	Code the game to follow these rules:
//        1.	The computer will come up with a number between 1 and 100 (inclusive).
//        1.	The user will be prompted to guess the number.
//        1.	If the user guesses the number correctly, the program displays:
//        1.	“Congratulations, [name of user]! You win!”
//        1. "It took you [number of guesses] guesses to find my number!"
//        1. If the user does not guess the number correctly, the program will display “Too low!” if the guess is too low and “Too high!” if the guess is too high, and then will prompt the user for another guess.  This goes on until the number is guessed correctly.
