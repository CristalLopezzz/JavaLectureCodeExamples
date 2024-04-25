package org.example.week6_exceptions_and_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadNumberFromFile {
    public static void main(String[] args) throws IOException {

        // List that is a type of array
        List<Integer> numbers = new ArrayList<>();

        // File name
        String filename = "numbers.txt";

        //creation of buffered reader
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        // Read first line from file
        String line = reader.readLine();

        // While loop until the end
        while (line != null) {

        // try to catch non integer values
            try {
                int number = Integer.parseInt(line);
        // If there is an integer it will be added to the array list
                numbers.add(number);
            } catch (NumberFormatException e) {
        // Program will be able to identify if it is an integer
                // if it's not then it will print the following
                System.out.println(line + " is not an integer, ignoring. ");
            }

        // Program will read the following line
            line = reader.readLine();
        }
        // Program will print the data in list
        System.out.println(numbers);
    }
}
