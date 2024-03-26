package org.example.week4_lists;

import java.util.ArrayList;
import java.util.List;

public class numbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
// Added integer values
        numbers.add(100);

        numbers.add(5);
        numbers.add(42);
        numbers.add(71);
        numbers.add(201);
        numbers.add(22);
    // Printing the integer values in list
        System.out.println(numbers);
    }
}
