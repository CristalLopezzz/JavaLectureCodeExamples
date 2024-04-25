package org.example.week6_exceptions_and_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Name {

    public static void main(String[] args) throws IOException {

    // Variables with values for file writer
        String name = "Cristal";
        String favoriteColor = "blue";
        int classCode = 2454;

        // Creation of buffered writer for file functionality
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data.txt"));

        // This is what will be displayed on file
        // "\n" allows for data to be placed in separate lines
        bufferedWriter.write(name + "\n");
        bufferedWriter.write(favoriteColor);
        bufferedWriter.newLine();
        bufferedWriter.write(classCode + "\n");

        // Necessary for functionality
        bufferedWriter.close();


    }
}
