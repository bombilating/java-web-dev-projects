package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addMenuItem(MenuItem item){
        items.add(item);
    }

    public void removeMenuItem(MenuItem item){
        if(!items.contains(item)) {
            System.out.println("Menu item not found.");
        } else {
            items.remove(item);
        }
    }

    public MenuItem retrieveMenuItem(MenuItem item){
        if(!items.contains(item)) {
            System.out.println("Menu item not found.");
            return null;
        } else {
            return items.get(items.indexOf(item));
        }
    }
    public boolean isMenuItemNew(MenuItem item){
        return items.get(items.indexOf(item)).isNew();
    }

    public void sayDateLastUpdated(){
        System.out.println("The last time the menu was updated was " + lastUpdated);
    }
}


