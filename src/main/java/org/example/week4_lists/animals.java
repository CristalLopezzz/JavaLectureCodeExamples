package org.example.week4_lists;

import java.util.ArrayList;
import java.util.List;

public class animals {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        // Elements inside of list
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Bear");

        // Condition that removes the elements mentioned so the end result will be without those elements
        animals.remove(2);
        animals.remove(0);

        // Prints list
        System.out.println(animals);

    }

}
