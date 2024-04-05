package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String myString = input.nextLine().toLowerCase();
        char[] charactersInString = myString.toCharArray();
        HashMap<String, Integer> characterCount = new HashMap<>();
        for (char c : charactersInString) {
            if (Character.isAlphabetic(c)) {
                if (characterCount.containsKey(String.valueOf(c))) {
                    characterCount.put(String.valueOf(c), (characterCount.get(String.valueOf(c))) + 1);
                } else {
                    characterCount.put(String.valueOf(c), 1);
                }
            }
        }
        for (Map.Entry<String, Integer> characterCounts : characterCount.entrySet()) {
            System.out.println(characterCounts.getKey() + ": " + characterCounts.getValue());
        }
    }
}
