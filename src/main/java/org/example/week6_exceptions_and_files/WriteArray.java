package org.example.week6_exceptions_and_files;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteArray {
    public static void main(String[] args) throws Exception {

        // String listing months
        String[] months = {"Jan", "Feb", "Mar"} ;

        // Creation of buffered writer
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("months.txt"));

        // for loop that will repeat data in the following manner
        for (String month: months) {
            bufferedWriter.write(month);
            bufferedWriter.newLine();
        }
        // Necessary for functionality
        bufferedWriter.close();
    }
}
