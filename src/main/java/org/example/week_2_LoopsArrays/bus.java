package org.example.week_2_LoopsArrays;

import static input.InputUtils.doubleInput;

public class bus {
    public static void main (String[] args){

        double total = 0; // This variable will allow to add each day's expenses for the week total

        for (int day = 0; day< 7; day ++) {
            // Will loop 7 times for each day of the week
            double dayExpense = doubleInput ("On day " + (day+1) + " of the week, what did you spend on bus fares");
            total = total + dayExpense;
        }   // Adds up day's expense to the total
        System.out.println("For the week, you spent $" + total + " for bus fares.");
    }  // Program will print out the final result
}

