package org.example.week_2_LoopsArrays;

public class January {
        public static void main(String[] args) {

            // The System.out.println prints out the following message to user
            System.out.println("Here are all the dates in January");

            // The int day = 1 command will start to print at day 1
            // day <= 31 indicates that the loop will keep going until it reaches 31
            // day ++ indicates that it will continue to add up by one
            for (int day = 1 ; day <= 31 ; day++)   {
                System.out.println("January " + day);
                // System.out.println will print out 'January' everytime with the different day result
            }
        }
}
