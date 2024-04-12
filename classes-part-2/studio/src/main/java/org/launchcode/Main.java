package org.launchcode;

import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem nyamaChoma = new MenuItem("Nyama Choma", 13.99, "Barbecued goat meat", "Main Course", false);
        MenuItem pilau = new MenuItem("Pilau", 8.99, "Spiced fragrant rice", "Appetizer", false);
        MenuItem mandazi = new MenuItem("Mandazi", 5.00, "Fried triangular doughnut balls", "Dessert", true);

        ArrayList<MenuItem> aMenuItems = new ArrayList<>();
        aMenuItems.add(nyamaChoma);
        aMenuItems.add(pilau);
        aMenuItems.add(mandazi);

        Menu testMenu = new Menu( new GregorianCalendar(2000, 1,1).getTime(), aMenuItems);

        MenuItem samosa = new MenuItem("Samosa", 3.50, "Fried pastry with savoury filling", "Appetizer", true);
        testMenu.addMenuItem(samosa);
        System.out.println(testMenu.getItems());
        System.out.println(testMenu.retrieveMenuItem(samosa));
        testMenu.removeMenuItem(pilau);
        System.out.println(testMenu.getItems());
        testMenu.sayDateLastUpdated();

    }
}
