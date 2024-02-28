package org.example.week1_if_statements;


// Will allow users to input their own information

import static input.InputUtils.*;

public class HelloInput {
    public static void main(String[] args) {

        //This where users will be able to input their own data
        String name = stringInput("Please enter your name ");
        System.out.println("Hello, " + name + "!");
        // The program will print this out with the users name

        int numberOfClasses = positiveIntInput("How many classes are you taking this semester?");
        System.out.println("You are taking " + numberOfClasses + " class(es)");
    }
}

