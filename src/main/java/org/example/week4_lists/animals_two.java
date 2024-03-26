package org.example.week4_lists;

import java.util.ArrayList;
import java.util.List;

public class animals_two {
    public static void main(String[] args) {
        // Elements of list
        List<String> animals_two = new ArrayList<>();
    animals_two.add("Cat");
    animals_two.add("Bird");
    animals_two.add("Frog");

    // Elements can be removed by value instead of position
    animals_two.remove("Frog");
    animals_two.remove("Zebra");

    // This prints the list
System.out.println(animals_two);
    }
}
