package org.example.week6_exceptions_and_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingVariables {
    public static void main (String[] args) throws IOException {
        // Different variables with their values
        int classCode = 2454;
        double averageEnrollment = 22.16;
        String className = "Java";
        // Creation of a new file writer
        FileWriter writer = new FileWriter("java.txt");
        // Provides buffering capabilities that gives efficiency to the writing in file writer
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // Text that will be displayed in the filewriter
        bufferedWriter.write("The class name is " + className + "\n");
        bufferedWriter.write("The class code is " + classCode + "\n");
        bufferedWriter.write("The average enrollment is " + averageEnrollment + "\n");

        // Must be used for the file/program to function
        bufferedWriter.close();


    }
}
