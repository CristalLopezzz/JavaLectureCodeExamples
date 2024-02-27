package org.example.week3_methods;

import static input.InputUtils.doubleInput;
public class MilesToKm {
        public static void main(String[] args) {

            // Allows users to input their data
            double miles = doubleInput("Please enter number of miles");
            double km = milesToKm(miles);
            System.out.println(miles + " miles is equal to " + km + " kilometers");
        }

        public static double milesToKm(double miles) {
            // Equation will result the final answer one mile = 1.6 km
            double km = miles * 1.6;
            return km;
        }
}
