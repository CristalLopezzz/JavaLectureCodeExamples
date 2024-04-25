package org.example.week6_exceptions_and_files;

public class StringToInt {
    public static void main(String[] args) {

        String hopeThisIsANumber = "cat";

        // 'try' verfies if there is an exception
        // Integer.parseInt tries to convert (hopeThisIsANumber) into an integer but if the string does not contain
        // a valid integer it will move on to process catch
        try {
            int number = Integer.parseInt(hopeThisIsANumber);
            System.out.println("The number is " + number);
        } catch (NumberFormatException e) {  //
            System.out.println(hopeThisIsANumber + " is not a valid number");
        }

        // Tells user the following after everything of the program has ran
        System.out.println("This is the end of the program");
    }
}
