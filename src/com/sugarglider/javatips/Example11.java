package com.sugarglider.javatips;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * the class without name is called anonymous class
 */

public class Example11 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(List.of("ant","lizard","cat","elephant","dog"));

        Comparator<String> lengthComparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        Collections.sort(animals, lengthComparator);
        System.out.println(animals);

    }
}
