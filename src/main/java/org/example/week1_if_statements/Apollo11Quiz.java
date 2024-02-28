package org.example.week1_if_statements;

import static input.InputUtils.intInput;

public class Apollo11Quiz {

    public static void main(String[] args) {

        System.out.println("Quiz time!");

    // Question that will allow users to put their answer
        System.out.println("What year did the Apollo spaces spaceship land on the moon?");

// Allows user to put their int input
        int answer = intInput();

 // If value does not equal the following value, it will print out the following
        if ( answer != 1969 ) {
            System.out.println("Wrong answer - it was 1969");

        }
    }
}
