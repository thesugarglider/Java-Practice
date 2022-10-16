package com.sugarglider.collections.list;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> words = List.of("Apple","Cat","Dog");

        System.out.println(words.size());
        System.out.println(words.isEmpty());
        System.out.println(words.get(0));
        System.out.println(words.contains("Cat"));
        System.out.println(words);
    }
}
