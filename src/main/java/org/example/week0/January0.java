package org.example.week0;

public class January0 {
    public static void main(String[] args) {

    // Variable values
        String currentMonth = "January";
        int dayOfMonth = 11;
        double forecastHigh = 19.4;
        double forecastLow = -3.7;

// Equation to give the final printed result
        double tempDifference = forecastHigh - forecastLow;

// Print out to fit the desired format of the number
        System.out.printf("On " + currentMonth + " " + dayOfMonth +
                " the difference between the high and low temperature is %.2f", tempDifference);
    }
}
