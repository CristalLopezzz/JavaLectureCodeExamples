package org.example.week6_exceptions_and_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeStyleCheck {
    public static void main(String[] args) {

        // Number of file name
        String filename = "ReadNumberFromFile.java";

        // Buffered reader created incorporated with the try catch method
       try (BufferedReader reader = new BufferedReader(new FileReader("ReadNumberFromFile.java"))) {

           // These variables help identify if lines are too long
            boolean linesTooLong = false;
            int numberOfLinestooLong = 0;

            // each line will be able to be read
           String line = reader.readLine();

           // This integer variable will help determine the max length of line
           int maxLineLength = 100;

           // This integer variable will count the lines
           int lineCounter = 1;

           // This while loop will go through the file
           while (line != null) {
               // This will help determine if the length of the line reaches the max or not
               if (line.length() > maxLineLength) {

                   // Depending on the results, the program will print the following
                   System.out.println("The line " + lineCounter + " is too long.");
                   System.out.println(line);
                   linesTooLong = true;

               }

               // Program will continue through the file and increase in counter
               lineCounter++;
               line = reader.readLine();
           }
            // Depending on the results, the following messages will be displayed incorporated by try catch method
           if (linesTooLong) {
               System.out.println("there were " + numberOfLinestooLong + " lines that were too long.");
           } else {
               System.out.println("there were no lines that were too long.");
           }
        } catch (IOException e) {
           System.out.println("Error reading file" + filename + "because " + e);
        }

    }
}
