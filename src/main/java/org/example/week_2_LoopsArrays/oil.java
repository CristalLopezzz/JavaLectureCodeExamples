package org.example.week_2_LoopsArrays;

public class oil {
    public static void main(String[] args){
        // It is easier to write integers as variables
        int miles = 150000;
        int oilChangeInterval = 3000;

        // oilChange < 8 will calculate 8 times of when an oil change will be needed
        // oilChange++ indicates that the values are increasing

        for (int oilChange = 0; oilChange < 8; oilChange++) {

            // This equation will define the specific number of miles that will be presented in the loop
            miles = miles + oilChangeInterval;
            System.out.println(miles);
            // This will print out the results for each loop
        }
    }
}
