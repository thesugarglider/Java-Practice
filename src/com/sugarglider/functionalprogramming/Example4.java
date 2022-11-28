package com.sugarglider.functionalprogramming;

import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,4,10,5,7,2,8,4,3,5);

        numbers.stream().sorted().forEach(element -> System.out.print(element+" "));

        System.out.println();

        numbers.stream().distinct().forEach(element -> System.out.print(element+" "));

        System.out.println();

        numbers.stream().distinct().map(e -> e * e).forEach(e -> System.out.print(e+" "));
    }
}
