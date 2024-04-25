package org.example.week7_OOP;

public class SwimmingPoolProgram {
    public static void main (String[] args) {

        // Creates an instances of the ymca pool
        Pool ymca = new Pool("YMCA", 50);

        // Calculates the total distance of laps(6) swam in ymca pool
        double totalSwam = ymca.distanceForLaps(6);

        // Prints out information about the ymca pool
        System.out.println(ymca);

        // Prints out message with the final total value calculated in meters
        System.out.println("The total distance is " + totalSwam + " meters");

        // Creates an instance of the como pool
        Pool como = new Pool("Como Park", 25);

        // Calculates the total distance of laps(10) in the como pool
        System.out.println(como.distanceForLaps(10));

        // Prints information about the como pool
        System.out.println(como);

        // Creates an instance of the Edina pool
        Pool edina = new Pool("Edina", 50);

        // Calculates the total distance of laps in the Edina pool
        double distance = edina.distanceForLaps(12);
        // Prints out the information for the Edina pool
        System.out.println(distance);
        System.out.println(edina);
    }

}
