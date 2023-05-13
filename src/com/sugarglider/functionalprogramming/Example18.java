package com.sugarglider.functionalprogramming;

import java.util.List;

public class Example18 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,3,4,5,6,7,8);

        numbers.stream().filter(number->number%2==0).forEach(System.out::println);

        numbers.stream().filter(number->number%2==0).forEach(new Example18Consumer());
    }
}
