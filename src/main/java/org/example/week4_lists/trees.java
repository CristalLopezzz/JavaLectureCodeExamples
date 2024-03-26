package org.example.week4_lists;
// Imports that allows for program to function correctly
import java.util.ArrayList;
import java.util.List;

public class trees {
    public static void main(String[] args) {
        // Elements inside of list
        List<String> trees = new ArrayList<>();
        trees.add("Pine");
        trees.add("Oak");
        trees.add("Elm");
        trees.add("Aspen");

        // This tells the program that the element stated wants to be added at index 2
        trees.add(2,"Palm");

        System.out.println("Tree at index 1 is " + trees.get(1));

        for (String tree: trees) {
            System.out.println(tree);
        }
        // Removes certain aspects that are part of the list
        trees.remove("Oak");
        trees.remove(0);

        System.out.println(trees);

        // If this condition is met then the program will display the following text to the user
        if (trees.contains("Aspen")) {
            System.out.println("Tree List contains Aspen");
        }
        int numberOfTrees = trees.size();
        // Final statement will tell user how many trees are in the list all together
        System.out.println("There are " + numberOfTrees + " trees in the list.");
    }

}
