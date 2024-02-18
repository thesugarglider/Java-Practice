package com.sugarglider.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

public class Example21 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,3,4,5,6,7,8);

        Predicate<Integer> evenPredicate = evenPredicate();
        Predicate<Integer> oddPredicate = number -> number % 2 != 0;

        numbers.stream().filter(evenPredicate).forEach(System.out::println);
        numbers.stream().filter(oddPredicate).forEach(System.out::println);
    }

    private static Predicate<Integer> evenPredicate() {
        return number -> number % 2 == 0;
    }
}
