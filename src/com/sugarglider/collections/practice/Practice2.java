package com.sugarglider.collections.practice;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        String[] items = {"apple", "bananas", "milk", "oranges"};

        List<String> list = List.of(items);
        System.out.println(list);

        System.out.println(list.getClass().getName());

        ArrayList<String> arrayList = new ArrayList<>(list);
        arrayList.add("eggs");
        System.out.println(arrayList);

        ArrayList<String> newList = new ArrayList<>(
                List.of("eggs", "curd", "biscuits"));

        System.out.println(newList);
    }
}
