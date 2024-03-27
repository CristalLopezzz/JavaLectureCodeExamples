package org.example.week5_hashmaps;

import java.util.HashMap;

public class states {
    public static void main(String[] args) {

        // 'stateAbbreviations' is the name of the hashmap
        HashMap<String, String> stateAbbreviations = new HashMap<>();
        //.put allows to add keys and its values
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");

        System.out.println(stateAbbreviations);

        // This retrieves only the values from the following keys
        System.out.println(stateAbbreviations.get("Minnesota"));
        System.out.println(stateAbbreviations.get("Iowa"));

        String wisconsinAbbreviation = stateAbbreviations.get("Wisconsin");
        System.out.println(wisconsinAbbreviation);
    }
}
