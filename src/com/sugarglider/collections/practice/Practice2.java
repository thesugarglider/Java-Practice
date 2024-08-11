package com.sugarglider.collections.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

        arrayList.addAll(newList);
        System.out.println(arrayList);

        System.out.println(newList.get(2));

        if(newList.contains("curd")){
            System.out.println("New List Contains Curd");
        }

        System.out.println(arrayList.indexOf("eggs"));
        System.out.println(arrayList.lastIndexOf("eggs"));

        arrayList.remove(4);
        System.out.println(arrayList);
        arrayList.remove("eggs");
        System.out.println(arrayList);

        arrayList.removeAll(List.of("biscuits", "bananas"));
        System.out.println(arrayList);

        arrayList.retainAll(List.of("chicken", "bananas","apple"));
        System.out.println(arrayList);

        arrayList.clear();
        System.out.println("Food list -> " + arrayList);

        arrayList.addAll(List.of("apple", "almond", "fig", "chicken"));
        arrayList.addAll(Arrays.asList("eggs", "oranges", "foxnut"));

        System.out.println("Food List -> " + arrayList);

        arrayList.sort(Comparator.naturalOrder());
        System.out.println("Food List -> " + arrayList);

        arrayList.sort(Comparator.reverseOrder());
        System.out.println("Food List -> " + arrayList);

        String[] groceryArray = arrayList.toArray(new String[arrayList.size()]);
        System.out.println(Arrays.toString(groceryArray));

    }
}
