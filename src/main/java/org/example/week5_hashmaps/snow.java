package org.example.week5_hashmaps;


import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;


public class snow {
    public static void main(String[] args) {

        // Hashmap that contains month and snowfall
        Map<String,Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        snowfall.put("December", 3.1);
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);

        // prints the information from hashmap
        System.out.println(snowfall);

        // Following code helps gather the total amount of snowfall
        double total = 0;
        for (double snow: snowfall.values()) {
            total += snow;
        }   // Total amount gets printed for user
        System.out.println("The total snow is " + total);

        // The amount of snowfall is printed from each month
        // %s allows for a string to be placed
        // %.2f allows for a floating-point integer format
        for (String month: snowfall.keySet()) {
            double snow = snowfall.get(month);
            System.out.printf("The snow in %s was %.2f inches\n",month,snow);

        }

        // Modifying the information for February
        snowfall.put("February", 12.4);

        System.out.println(snowfall);

        // Printed information from hashmap
        System.out.println("The snow in January is " + snowfall.get("January") + " inches.");

        System.out.println("The snow in July is " + snowfall.get("July") + " inches.");

        // This indicates what will be printed depending on the available information for the month of July
        if (snowfall.containsKey("July")) {
            System.out.println("There was snow in July! ");
        } else {
            System.out.println("There was no snow in July.");
        }

        // Allows user to input new snowfall data from desired month
        String newMonth = stringInput("Enter name of month");
        double newSnow = positiveDoubleInput("Enter amount of snow for " + newMonth);

        snowfall.put(newMonth, newSnow);

        Double snow = snowfall.get(newMonth);

        System.out.println(snowfall);

        // Program checks if information from newMonth already exists to proceed with a y/n question for user
        if (snow != null) {
            System.out.println("The hashmap already contains that month," + newMonth + " snow =" + snow + " inches");
            boolean overwrite = yesNoInput("Overwrite data?");

        // Depending on users answer it will guide user to the next printed message
            if (overwrite) {
                snowfall.put(newMonth, newSnow);
            } else {
                System.out.println("Data was not added");
            }
        } else {
            snowfall.put(newMonth, newSnow);
        }
        System.out.println(snowfall);

    }
}
