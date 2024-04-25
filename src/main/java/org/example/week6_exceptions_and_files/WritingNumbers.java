package org.example.week6_exceptions_and_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingNumbers {
    public static void main (String[] args) throws IOException {
    // int data value
        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

    // floating-point number
        double number = 12.34;

    // New file writer and buffered writer
        FileWriter writer = new FileWriter("numbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // If I want my integers to show up on my file I will need to use "\n" otherwise it will transform to letters
        bufferedWriter.write(data1 + "\n");
        bufferedWriter.write(Integer.toString(data2) + "\n");
        bufferedWriter.write(data3 + "\n");

        bufferedWriter.write(number + "\n");
        bufferedWriter.write("test");

        // Necessary for file functionality
        bufferedWriter.close();
    }
}
