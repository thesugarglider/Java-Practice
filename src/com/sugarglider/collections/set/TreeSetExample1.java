package com.sugarglider.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Set.of(34,50,12,99,65));
        System.out.println(numbers);

        System.out.println(numbers.floor(40));
        System.out.println(numbers.ceiling(40));

        System.out.println(numbers.lower(34));
        System.out.println(numbers.higher(34));

        System.out.println(numbers.subSet(34,99));
        System.out.println(numbers.subSet(34,true,99,true));

        System.out.println(numbers.headSet(50));
        System.out.println(numbers.tailSet(50));
    }
}
