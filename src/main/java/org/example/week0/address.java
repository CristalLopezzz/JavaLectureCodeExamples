package org.example.week0;

public class address {
    public static void main(String[] args) {

    //Variable values
        String city = "Minneapolis";
        String state = "mn";

// This code will join both variable values and convert 'state' value into upper case
        String cityState = city + ", " + state.toUpperCase();
        System.out.println(cityState);
    }
}
