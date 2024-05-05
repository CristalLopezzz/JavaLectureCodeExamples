package org.example.week6_exceptions_and_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloReading {
    public static void main(String[] args) throws IOException {

        // Creation of file reader and buffered reader for correct functionality
        FileReader reader = new FileReader("hello.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        //System.out.println(bufferedReader.readLine());
        //System.out.println(bufferedReader.readLine());
        //System.out.println(bufferedReader.readLine());
        //System.out.println(bufferedReader.readLine());
        //System.out.println(bufferedReader.readLine());
        //System.out.println(bufferedReader.readLine());

        // or use the following code
        String line = bufferedReader.readLine();
            while( line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            // Necessary for functionality
                bufferedReader.close();

    }
}
