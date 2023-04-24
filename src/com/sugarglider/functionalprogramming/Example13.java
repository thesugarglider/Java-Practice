package com.sugarglider.functionalprogramming;

import java.util.List;

public class Example13 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,3,6,8,13,14);

        int sum = 0;
        sum = numbers.stream().reduce(0, (number1, number2)->{
            System.out.println(number1+" "+number2);
            return number1 + number2;
        });
        System.out.println(sum);
    }
}
