package com.sugarglider.arrays;

import java.util.ArrayList;

public class Example8 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
        System.out.println(fruits);

        fruits.remove("apple");
        System.out.println(fruits);


    }
}
