package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterSet {
    public static void main (String[] args) {
        Map<String, Integer> countOfChars = new HashMap<>();
        Scanner input = new Scanner (System.in);
        String testString; /*= "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";*/
        char[] stringCharacters;

        System.out.println("Enter a string: ");
        testString = input.nextLine();
        stringCharacters = testString.toCharArray();

        for (int i = 0; i < stringCharacters.length; i++) {
            if(!Character.toString(stringCharacters[i]).toLowerCase().matches("[^\\p{Alpha}]")) {
                if (countOfChars.containsKey(Character.toString(stringCharacters[i]).toLowerCase())) {
                    countOfChars.put(Character.toString(stringCharacters[i]).toLowerCase(),
                            countOfChars.get(Character.toString(stringCharacters[i]).toLowerCase()) + 1);
                } else {
                    countOfChars.put(Character.toString(stringCharacters[i]).toLowerCase(), 1);
                }
            }
        }
        for (Map.Entry<String, Integer> character : countOfChars.entrySet()) {
            System.out.println(character.getKey() + " : " + character.getValue());
        }
        input.close();
    }
}
