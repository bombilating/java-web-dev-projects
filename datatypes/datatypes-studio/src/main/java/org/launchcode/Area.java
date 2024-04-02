package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double rad = 0.0;
        System.out.println("Enter a radius:");
        if(input.hasNextDouble()){
            rad = input.nextDouble();
        } else {
            System.out.println("Input has to be a number. Quitting out of program.");
            System.exit(0);
        }
        while(rad <= 0) {
            System.out.println("That is not a valid number please try again: ");
            rad = input.nextDouble();
            if(rad > 0) break;
        }
        double area = Circle.getArea(rad);
        System.out.println("The area of a circle of radius " + rad + " is: " + area);
    }
}
