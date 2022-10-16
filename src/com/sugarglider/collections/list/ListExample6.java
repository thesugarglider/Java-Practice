package com.sugarglider.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample6 {
    public static void main(String[] args) {
        List value = List.of("A",'A',1,1.0);

        System.out.println(value.get(0) instanceof String);
        System.out.println(value.get(1) instanceof Character);
        System.out.println(value.get(2) instanceof Integer);
        System.out.println(value.get(3) instanceof Double);

        System.out.println();

        List<Integer> numbers = List.of(101,102,103,104);
        List<Integer> numbersArrayList = new ArrayList<>(numbers);
        System.out.println(numbers.indexOf(101));

        numbersArrayList.remove(Integer.valueOf(101));
        System.out.println(numbersArrayList);
    }
}
