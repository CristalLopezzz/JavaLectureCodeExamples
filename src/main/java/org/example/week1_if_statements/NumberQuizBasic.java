package org.example.week1_if_statements;

import static input.InputUtils.intInput;
public class NumberQuizBasic {
    public static void main(String[] args) {

    // The secret int value is this
        int secretNumber = 6;

    // User will be able to input their guessing number
        int guess = intInput("Guess the number I am thinking of");

    // If the number equal the secretNumber value it will print the following
        if (guess == secretNumber) {
            System.out.println("You guessed the correct number");
        } else { //If number is not guessed it will display the following message
            System.out.println("Sorry I was thinking of" + secretNumber);
        }
    }
}
