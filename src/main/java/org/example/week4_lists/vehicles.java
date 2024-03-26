package org.example.week4_lists;

import java.util.ArrayList;
import java.util.List;

public class vehicles {
    public static void main(String[] args) {
        List<String> vehicles = new ArrayList<>();

        // Elements are added to the end of the list
        vehicles.add("Bus");
        vehicles.add("Car");

        // These are added to the beginnning of the list
        vehicles.add(0, "Train");
        vehicles.add(0, "Boat");

        // These are added to the second place of the list
        vehicles.add(2, "Airplane");

        // This will be added to the fourth place of the list
        vehicles.add(4, "Truck");

// Allows for the list to be printed
        System.out.println(vehicles);
    }
}
