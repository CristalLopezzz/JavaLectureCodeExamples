package org.example.week3_methods;

import static input.InputUtils.intInput;
public class CreditsToGraduate {

        public static void main(String[] args) {

            // User will be able to input their data
            int creditsEarned = intInput("How many credits have you earned?");
            int creditsNeeded = intInput("How many credits does your program require?");
            //
            int creditsToGraduate = howManyCreditsToGraduate(creditsNeeded, creditsEarned);
            System.out.printf("You need %d credits to graduate. You've got this!", creditsToGraduate);
        }

        private static int howManyCreditsToGraduate(int creditsNeeded, int creditsEarned) {
            // Subtracting will define how many credits student will have left
            return creditsNeeded - creditsEarned;
        }
}
