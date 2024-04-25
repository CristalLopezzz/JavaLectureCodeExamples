package org.example.week6_exceptions_and_files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class writing {
    public static void main(String[] args) throws IOException {
        // This creates a FileWriter to the following name file
        FileWriter writer = new FileWriter("hello.txt");

        // Creation of a buffered writer for the file writer
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // this is the text that will be displayed in the file
        bufferedWriter.write("Hello\n");
        // Adds a new line
        bufferedWriter.newLine();
        bufferedWriter.write("Helloooooo\n");
        bufferedWriter.write("Goodbye\n");

        bufferedWriter.close();
        // append flag true means to add data to the end
        FileWriter writer2 = new FileWriter("hello.txt", true);
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

        bufferedWriter2.write("Other data");
        bufferedWriter2.newLine();
        bufferedWriter2.write("Hello Programmers!");
        bufferedWriter2.newLine();
        bufferedWriter2.write("End of file!");
        bufferedWriter2.newLine();

        // Necessary to close otherwise file will not work properly
        bufferedWriter2.close();


    }
}
