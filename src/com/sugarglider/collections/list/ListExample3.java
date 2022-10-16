package com.sugarglider.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample3 {
    public static void main(String[] args) {
        List<String> newList = List.of("Yak","Zebra");

        List<String> wordsArrayList = new ArrayList<String>();

        wordsArrayList.add("Tiger");
        wordsArrayList.add("Cheetah");

        System.out.println(wordsArrayList);

        wordsArrayList.addAll(newList);
        System.out.println(wordsArrayList);

        wordsArrayList.set(2,"Leopard");
        System.out.println(wordsArrayList);

        wordsArrayList.remove(3);
        System.out.println(wordsArrayList);

        wordsArrayList.remove("Cheetah");
        System.out.println(wordsArrayList);

    }
}
