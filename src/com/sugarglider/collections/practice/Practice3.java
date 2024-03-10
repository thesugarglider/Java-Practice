package com.sugarglider.collections.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {
        String[] originalArray = new String[] {"First", "Second" ,"Third"};
        List<String> arrayList = Arrays.asList(originalArray);

        arrayList.set(0, "one");
        System.out.println(arrayList);
        System.out.println(Arrays.toString(originalArray));

        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);
        System.out.println(Arrays.toString(originalArray));

        arrayList.add("fourth");
        System.out.println(arrayList);
        System.out.println(originalArray);
    }
}
