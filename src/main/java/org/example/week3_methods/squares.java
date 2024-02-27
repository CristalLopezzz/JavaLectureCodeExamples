package org.example.week3_methods;

import static input.InputUtils.doubleInput;
public class squares {

    public static void main(String[] args) {

        // User will input their data
        double number = doubleInput("Please enter a number and I'll square it");

        //  'square' is a function call with the value of 'number'
        square(number);

    }

    // This method calculates the square of that number by multiplying itself
    public static void square(double n) {
        double sq = n * n;
        System.out.println("The square of " + n + " is " + sq);
    } // Gives user the final result of the equation
}

