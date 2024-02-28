package org.example.week0;

public class PizzaRolls {
    public static void main(String[] args) {

        double pizzaRolls = 40;
    //this variable will equal an integer, specifically 7
        int people = 7;

        // Equation that will help determine final print result for users
        double rollsPerPerson = pizzaRolls / people;

// Final result for user
        System.out.println("Each person gets " + rollsPerPerson + " pizza rolls");
    }
}
