package org.example.week3_methods;

import java.util.Arrays;
public class warmup {
    public static void main(String[] args) {
        // 'companyNames' is an array that contains string elements
        String[] companyNames = {"Ikea", "at&t", "cvs", "3m"};

        for (int x = 0; x < companyNames.length; x++) {
            // For loop that converts the string elements into uppercase

            // companyNames[x] accesses the elements that will be converted and replaced with uppercase method
            companyNames[x] = companyNames[x].toUpperCase();
        }
        System.out.println(Arrays.toString(companyNames));
    }
}

