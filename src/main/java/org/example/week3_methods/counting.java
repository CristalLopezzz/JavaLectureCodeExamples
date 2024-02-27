package org.example.week3_methods;

import static input.InputUtils.intInput;

public class counting {
    public static void main(String[] args) {

        // Will allow users to input their answers
        int smallNumber = intInput("Please enter a small integer number");
        int largeNumber = intInput("Please enter a large integer");

        // This will add text and user input together to reveal next result
        System.out.println("I will now count from " + smallNumber + " to " + largeNumber);

        // Calls the count method
        count(smallNumber, largeNumber);
    }

    // Second method created to takes two arguments, both integers
    // Integer will be counting from user input min to max
    public static void count (int min, int max) {

        // For loop that joins user input and gives the directed step
        for (int i = min ; i <= max ; i++) {
            System.out.println(i);
        }
    }
}
