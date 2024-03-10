package com.sugarglider.collections.practice;


import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type , int count){
    GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString(){
        return String.format("%s %d in %s", name.toUpperCase(), count, type);
    }
}
public class Practice1 {
    public static void main(String[] args) {
        GroceryItem[] items = new GroceryItem[3];

        items[0] = new GroceryItem("milk");
        items[1] = new GroceryItem("apples", "PRODUCE", 3);
        items[2] = new GroceryItem("oranges", "PRODUCE", 5);

        System.out.println(Arrays.toString(items));

        ArrayList<GroceryItem> groceryItemArrayList = new ArrayList<>();

        groceryItemArrayList.add(new GroceryItem("Butter"));
        groceryItemArrayList.add(new GroceryItem("Cow Milk"));

        System.out.println(groceryItemArrayList);
    }
}
