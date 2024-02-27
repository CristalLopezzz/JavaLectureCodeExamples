package org.example.week_2_LoopsArrays;

import static input.InputUtils.doubleInput;
public class Test_Score {
    public static void main (String[]args){
        // List of variables that will be used among the rest of the program
        int numberOfTests = 5;
        double testScore;
        double testScoreSum = 0.0;
        double testScoreAverage;

        // these specifications define the structure of the for loop
        for (int test = 1; test <= numberOfTests; test++) {
            testScore = doubleInput("Enter test score # ");
            testScoreSum = testScoreSum + testScore;
        }
        // The equation will help figure out the average score
        testScoreAverage = testScoreSum / numberOfTests;
        System.out.println("Average score = " + testScoreAverage);
        // It will be printed out allong the test score average
    }
}

