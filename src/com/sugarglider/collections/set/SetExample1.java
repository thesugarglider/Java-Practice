package com.sugarglider.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {
    public static void main(String[] args) {
        Set<String> set = Set.of("Apple", "Banana", "Cat");

        Set<String> hashSet = new HashSet<>(set);
        System.out.println(hashSet.add("Apple"));
        System.out.println(hashSet);
    }
}
