package org.example.week1_if_statements;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;
// These import statement allows for several different kind of input that users can do
public class Prices {
    public static void main(String[] args) {

        // String that identifies the product name depending on user input
        String productName = stringInput("What is the name of the product?");

        // double price allows for user to input a floating-point number or whole number
        double price = doubleInput("What does " + productName + " cost?");

        //User will be able to input an integer value
        int quantity = intInput("How many " + productName + " to sell?");

        // Equation that will help determine final result
        double totalPrice = price * quantity;

        // Final print result for user
        System.out.println(quantity + " of " + productName +
                " at $" + price + " each costs $" + totalPrice);
    }
}
