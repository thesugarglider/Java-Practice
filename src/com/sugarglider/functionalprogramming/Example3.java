package com.sugarglider.functionalprogramming;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15);
        addNumbers(numbers);
    }

    public static void addNumbers(List<Integer> numbers){
        System.out.println((int) numbers.stream().reduce(0,(number1, number2) -> number1 + number2));
    }
}
