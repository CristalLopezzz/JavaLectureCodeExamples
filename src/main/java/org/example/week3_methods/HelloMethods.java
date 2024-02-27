package org.example.week3_methods;

import static input.InputUtils.stringInput;
public class HelloMethods {
    public static void main(String[] args) {
        // Allows users to put their own input
        String name = stringInput("Please enter your name");

        // The result of the method will be the string 'greeting'
        String greeting = makeGreeting(name);
        System.out.println(greeting);

    }
    // This is the second method in this program

    // Using the word 'Hello' the method will create a new String
    public static String makeGreeting(String n) {

        // The 'n' defines the name of the parameter for makeGreeting
        String greeting = "Hello " + n + "!";
        return greeting;
        // Will return the new greeting String displayed for user
    }
}
