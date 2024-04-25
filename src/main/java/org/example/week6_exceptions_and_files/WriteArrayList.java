package org.example.week6_exceptions_and_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteArrayList {
    public static void main (String[] args) throws IOException {

        // Data that is involved in the file
        List<String> classNames = List.of("Java", "Web", "C#");

        List<Integer> classCodes = List.of(2545, 2568, 2505);

        // Creation of buffer writer
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ITEC_Classes.txt"));

        // for loop that helps repeat and combine lists
        for (int i = 0; i <classNames.size(); i++) {
            String name = classNames.get(i);
            int code = classCodes.get(i);
            bufferedWriter.write("ITEC " + code + " " + name + "\n");
        }
    // Necessary for functionality
        bufferedWriter.close();
    }
}
