package org.example.week4_lists;

// Imports that allow for the information in the program to function correctly
import java.util.ArrayList;
import java.util.List;

public class Lists {
        public static void main(String[] args){

        // These are the contents inside the list
                List<String> arrayList = new ArrayList();
                arrayList.add("Hello");
                arrayList.add("World");
                arrayList.add("Cristal");
                arrayList.add("MCTC");

        // For the list of arrays these are the converted conditions that will be for the end result
                for (String s: arrayList) {
                        System.out.println(s);
                        System.out.println(s.toUpperCase());
                        System.out.println(s.length());
                }
                // This will allow the list to be printed
                System.out.println(arrayList);
        }
}