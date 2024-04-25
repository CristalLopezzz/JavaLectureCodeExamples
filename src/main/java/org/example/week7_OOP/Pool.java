package org.example.week7_OOP;

public class Pool {
    private String name;
    private double length;
    // Private fields that will be storing the name and length of pool
    Pool(String name, double length) {
        this.name = name; // Name of pool
        this.length = length; // Length of pool
    }

    // Helps calculate the total distance swum depending on the number of laps
    // Calculates it by multiplying the laps by length of pool
    public double distanceForLaps(int laps) {
        double total = laps * this.length;
        return total;
    }
    // Overrides a method in the superclass
    @Override
    public String toString() {
        // String that displays the pools name and length in meters
        String description = name + " pool is " + length + " meters long.";
        return description;
    }
}
