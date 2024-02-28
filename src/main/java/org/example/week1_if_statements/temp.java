package org.example.week1_if_statements;
import static input.InputUtils.doubleInput;
// Import statement that allows users to input their data
public class temp {
    public static void main(String[] args) {
        System.out.println("Enter today's temperature in F");

        // Allows users to input whole numbers or floating-point numbers
        double temp = doubleInput();

        // Helps determine if the number falls under 32 or over
        if (temp > 32) {

            // Final result if it meets requirement
            System.out.println("It's above freezing!");
        } else { // If it does not fall onto the starting statement it will print this
            System.out.println("It's below freezing!");
        }
    }
}
