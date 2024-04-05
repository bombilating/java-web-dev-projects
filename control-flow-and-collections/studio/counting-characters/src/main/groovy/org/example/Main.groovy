package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String myString = input.nextLine().toLowerCase();
    char[] charactersInString = myString.toCharArray();
    HashMap<String, Integer> characterCount = new HashMap<>();
    for(int i = 0; i <= charactersInString.length; i++){
      if(Character.isAlphabetic(charactersInString[i])){
        if(characterCount.containsKey(charactersInString[i])){
          characterCount.put(String.valueOf(charactersInString[i]), (characterCount.get(charactersInString[i] + 1)));
        }
        else{
          characterCount.put(String.valueOf(charactersInString[i]), 1);
        }
      }
    }
    System.out.println(characterCount);

  }
}