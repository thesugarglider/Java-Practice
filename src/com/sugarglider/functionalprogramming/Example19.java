package com.sugarglider.functionalprogramming;

import java.util.List;

public class Example19 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,3,4,5,6,7,8);

        numbers.stream().map(number->number*number).forEach(System.out::println);

        numbers.stream().map(new Example19Function()).forEach(System.out::println);
    }
}
