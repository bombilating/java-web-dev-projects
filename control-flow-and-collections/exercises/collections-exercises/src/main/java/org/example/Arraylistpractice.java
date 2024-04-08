package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylistpractice {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for( int integer : arr) {
            if(integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static ArrayList<String> printLetterWord(ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> fiveLetterWords = new ArrayList<>();
        System.out.println("Enter a word length: ");
        int wordLength = input.nextInt();
        for( String string : arr) {
            if(string.length() == wordLength)
                System.out.println(string);
                fiveLetterWords.add(string)
        }
        return fiveLetterWords;
    }
}
