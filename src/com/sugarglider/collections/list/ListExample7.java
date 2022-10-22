package com.sugarglider.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample7 {
    public static void main(String[] args) {
        List numbers = List.of(12,3,22,15);

        ArrayList<Integer> numberArrayList = new ArrayList<>(numbers);

        Collections.sort(numberArrayList);
        System.out.println(numberArrayList);
    }
}
